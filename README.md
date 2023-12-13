# Hospital-Navigation-System
Andriod Studio Application for Hospital Navigation

## Overview
This Android application helps users navigate within a hospital. Users can seamlessly move from the initial page to the Miscellaneous Activity page. In this page, they can choose destinations such as cafeterias, pharmacies, and restrooms within the hospital premises.

### Miscellaneous Activity Page
The Miscellaneous Activity page showcases three buttons, allowing users to explore various hospital amenities.


<a href="link-to-full-image">
    <img src="https://github.com/Saideepthi123/Hospital-Navigation-System/assets/122479660/4e1b5556-cf8a-471f-abd4-ad9c48e1860d" alt="Misc Activity page" width="400" height="600">
</a>

  <br> </br>

The users can select from the available three options and they will be directed to the respective pages.

For each of the respective pages, they will have below options in the activity page: 

### Features
- **Select Starting Point:** Users can choose their current location from a provided list.
- **Choose Destination:** Users can pick their desired destination, whether it's a cafeteria, pharmacy, or restroom.
- **Floor Information:** The app displays a list of available cafeterias, pharmacies, and restrooms, along with their respective floor numbers.

## Destination Pages
The Miscellaneous Activity page leads to three destination pages, each offering a unique set of options:

<a href="link-to-full-image">
    <img src="https://github.com/Saideepthi123/Hospital-Navigation-System/assets/122479660/c8d4664f-a29f-4f4e-930b-ee8342c39202" alt="cafetaria nav page" width="300" height="700">
</a>
<a href="link-to-full-image">
    <img src="https://github.com/Saideepthi123/Hospital-Navigation-System/assets/122479660/429d76fa-c548-4381-baba-e9d159f7ecc0" alt="pharmacy nav page" width="300" height="700">
</a>
<a href="link-to-full-image">
    <img src="https://github.com/Saideepthi123/Hospital-Navigation-System/assets/122479660/71387246-2953-41c7-8d50-70dbdf4eab40" alt="restroom nav page" width="300" height="700">
</a>
  <br> </br>

## Navigation Process for Cafetaria
Suppose the user enters the Cafeteria Navigation Page, selects room CE 5 as the starting point, and Subway Cafe as the destination, then the user will be shown with the map to go from CE 5 on the ground floor to the subway cafe that is on the first floor. After the user clicks "Yes" for "Have you gone upstairs", the next map will be shown for the first floor. The steps can be seen below.

<a href="link-to-full-image">
    <img src="https://github.com/Saideepthi123/Hospital-Navigation-System/assets/122479660/d310b136-cc28-4f66-b8af-ee93b3a39f0a" alt="input for cafe nav" width="300" height="700">
</a>
<a href="link-to-full-image">
    <img src="https://github.com/Saideepthi123/Hospital-Navigation-System/assets/122479660/b7094b7e-d74c-4250-a287-1f95b0261473" alt="output cafe nav page 1" width="300" height="700">
</a>
<a href="link-to-full-image">
    <img src="https://github.com/Saideepthi123/Hospital-Navigation-System/assets/122479660/467cd8c7-00c5-443d-b652-2ab1287d0caf" alt="output cafe nav page 2" width="300" height="700">
</a>

  <br> </br>


  ## Navigation Process for Pharmacy
Suppose the user enters the Pharmacy Navigation Page, selects room CE 2 as the starting point, and Pharmacy as the destination, then the user will be shown with the map to go from CE 2 on the ground floor to the Pharmacy that is on the ground floor. The steps can be seen below.

<a href="link-to-full-image" >
    <img src="https://github.com/Saideepthi123/Hospital-Navigation-System/assets/122479660/2459ed29-6688-4448-bcd5-dff8c20caf97" alt="input for pharma nav" width="300" height="700">
</a>
<a href="link-to-full-image" margin_left="50px">
    <img src="https://github.com/Saideepthi123/Hospital-Navigation-System/assets/122479660/2bf3f82c-d17f-4768-af3d-076966d7d096" alt="output pharma nav page" width="300" height="700">
</a>
  <br> </br>

  ## Navigation Process for Restrooms
Suppose the user enters the Restrooms Navigation Page, selects Subway Cafe as the starting point, and Washroom 1 as the destination, then the user will be shown with the map to go from Subway Cafe on the first floor to the Washroom 1 that is on the ground floor. After the user clicks "Yes" for "Have you gone downstairs", the next map will be shown for the ground floor. The steps can be seen below.

<a href="link-to-full-image">
    <img src="https://github.com/Saideepthi123/Hospital-Navigation-System/assets/122479660/b249080a-e6df-4692-b2eb-75432833f7b7" alt="input for restroom nav" width="300" height="700">
</a>
<a href="link-to-full-image">
    <img src="https://github.com/Saideepthi123/Hospital-Navigation-System/assets/122479660/4909fce7-39a7-41c6-aede-d2038b1fbd29" alt="output restroom nav page 1" width="300" height="700">
</a>
<a href="link-to-full-image">
    <img src="https://github.com/Saideepthi123/Hospital-Navigation-System/assets/122479660/7c689738-63ba-414c-9fe9-c90396e4da7f" alt="output restroom nav page 2" width="300" height="700">
</a>

  <br> </br>

## Treatment Room Allocation
In addition to miscellaneous navigation, the allocation of treatment rooms based on user-entered symptoms and room availability was also looked into.

### How it Works
 1. **User Input:**
    - Users input their symptoms into the application during the symptom-checking process.

2. **Symptom Analysis:**
   - The system analyzes the entered symptoms to determine the severity and urgency of the medical condition based on Emergency or Non Emergency situations.

3. **Room Availability Check:**
   - The application checks the availability of treatment rooms based on the severity of symptoms and the current occupancy status of rooms.

4. **Room Allocation:**
   - Treatment rooms are allocated to users based on the severity of their symptoms and the availability of rooms in the hospital. Information about allocated rooms is stored in the database for future reference.


Suppose a user with severe symptoms is allocated Treatment Room A. When a new user with similar symptoms arrives, the application checks the availability of Room A. If Room A is currently occupied, the system allocates the next available room, ensuring prompt medical attention.

This application enhances the hospital experience by providing users with a convenient and efficient wayfinding solution.

## How to Execute the Project

To successfully execute the project and run the Android application on your local machine, follow these step-by-step instructions:

### Prerequisites

Before you begin, ensure you have the following installed:

- Android Studio with the necessary SDK components.
- A working internet connection for downloading dependencies.

### Steps

1. **Download and Extract the Project:**
   - Download the entire project from my branch as a ZIP file from the GitHub repository.
   - Extract the contents of the downloaded ZIP file to a location of your choice on your local machine.

2. **Set SDK Location:**
   - Open the project in Android Studio.
   - Locate/create the `local.properties` file in the root of the project.
   - Set the `sdk.dir` property to the path where your Android SDK is installed.

     Example:
     ```properties
     sdk.dir=/path/to/your/android/sdk
     ```

3. **Sync Gradle and Download Dependencies:**
   - Android Studio will prompt you to sync the project with Gradle. Confirm the sync, and Android Studio will download the necessary dependencies.

4. **Build and Run:**
   - After syncing, click on the "Run" button in Android Studio to build and run the application.
   - If prompted, select a target device (either a physical Android device connected to your computer or an emulator).


5. **Application Execution:**
   - The application will be installed and executed on the selected device.
   - Once the application is running, explore the various features as described above in the readme file.



By following these steps, you'll be able to successfully set up and execute the project on your local development environment.
