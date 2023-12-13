package com.example.hospital_navigation_system.services;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.example.hospital_navigation_system.database.HospitalDB;
import com.example.hospital_navigation_system.database.RoomAllocation;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class RoomAllocationService extends Service {
    public static final String ACTION_RESULT = "com.navigation.hospital.ACTION_RESULT";
    public static final String EXTRA_RESULT = "com.navigation.hospital.EXTRA_RESULT";


    private static final String TAG = "ROOM_ALLOC";
    private static String result;


    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String symptom = intent.getStringExtra("Symptom");
        Log.d(TAG, "In service - " + symptom);
        try {
            result = allocateRoom(symptom);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        Intent intent2 = new Intent(ACTION_RESULT);
        intent2.putExtra(EXTRA_RESULT, result);
        sendBroadcast(intent2);


        // Return START_STICKY to make the service restart if it gets terminated
        return START_STICKY;
    }

    private String allocateRoom(String symptom) throws JSONException {
        // Your logic for allocating the room goes here
        if ("Accident".equals(symptom)) {
            return "CE 1";
        } else if ("Stroke".equals(symptom)) {
            return "CE 4";
        } else if ("Allergies".equals(symptom)) {
            return "CE 8";
        } else if ("Covid".equals(symptom)) {
            return "Treatment Room 1";
        }
        else
            return "";
    }

    private static void readAndInsertJsonFile(Context context, HospitalDB database) {
        try {
            // Load JSON file from assets
            String json = loadJsonFromAsset(context, "room_allocations.json");

            // Parse JSON array
            JSONArray jsonArray = new JSONArray(json);

            // Insert each JSON object into the Room database
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                RoomAllocation roomAllocation = new RoomAllocation();
                roomAllocation.roomCode = (jsonObject.getString("roomCode"));
                roomAllocation.roomPurpose = (jsonObject.getString("roomPurpose"));
                roomAllocation.isUse = (jsonObject.getInt("isUse"));
//                database.hDao2().insertRoom(roomAllocation);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static String loadJsonFromAsset(Context context, String filename) {
        String json;
        try {
            InputStream is = context.getAssets().open(filename);
            if (is != null) {
                int size = is.available();
                byte[] buffer = new byte[size];
                is.read(buffer);
                is.close();
                json = new String(buffer, StandardCharsets.UTF_8);
            } else {
                // Handle the case where InputStream is null (e.g., file not found)
                json = "";
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return json;
    }

}
