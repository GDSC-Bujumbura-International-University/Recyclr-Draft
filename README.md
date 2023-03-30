# Recyclr
[](https://img.shields.io/twitter/follow/gdscbiu)
This is a project by a team from Google Developer Student Club at Bujumbura International University. The project is about a mobile application focused on helping sorting out recyclable waste in order to protect the environment.
## Project Setup:
The Recyclr mobile app is designed to encourage and incentivize users to recycle their plastic bottles, furniture, and paper at home by scanning these items using their smartphones. Users earn points for each item they recycle, which can be redeemed in the app for waste collection tools, children's books, or tree planting. The app is built using Kotlin for Android, Firebase for the database, and Google Cloud Maps API for location tracking.

### Problem Statement:
The Recyclr mobile app aims to address the issue of increasing plastic waste in the environment by encouraging users to recycle plastic bottles, furniture, and paper at home. The app also aims to educate users on what can and cannot be recycled at home, promoting sustainable waste management practices.

### United Nations Sustainable Development Goals:
The Recyclr mobile app aligns with the following United Nations Sustainable Development Goals:

1. Goal 11: Make cities and human settlements inclusive, safe, resilient and sustainable
- Target 11.6: By 2030, reduce the adverse per capita environmental impact of cities, including by paying special attention to air quality and municipal and other waste management.
2. Goal 12: Responsible Consumption and Production
- Target 12.5: By 2030, substantially reduce waste generation through prevention, reduction, recycling, and reuse.
3. Goal 13: Climate Action
- Target 13.3: Improve education, awareness-raising, and human and institutional capacity on climate change mitigation, adaptation, impact reduction, and early warning.

## Implementation:
The Recyclr mobile app is built using a client-server architecture. The client is developed using Kotlin, which provides a development framework for Android devices. The server-side application is built using Firebase, which provides a scalable and flexible backend solution for storing and retrieving data.

The high-level components of the architecture are:

- Frontend: The frontend of the Recyclr app is developed using Jetpack Compose. The frontend is responsible for handling user interactions, displaying data, and providing a user-friendly interface for the app.

- Backend: The backend of the Recyclr app is developed using Firebase. The backend is responsible for storing and retrieving user data, managing user accounts, and sending notifications to users.

Technologies and Programming Languages: The Recyclr app is developed using the following technologies and programming languages:

- Kotlin - a modern programming language used to write the Android app.
- Jetpack Compose - a modern toolkit for building native Android UI using Kotlin.
- Firebase Authentication - a service used to handle user authentication and sign-in with email or Google account.
- Cloud Firestore - a NoSQL document database used to store and sync app data in real-time.
- Google Maps Android API - a service used to display maps and location data in the app.
- Android SDK - a software development kit used to develop Android applications.
- Gradle - a build automation tool used to build, test, and deploy the app.
- GitHub - a version control system used to store, manage, and share the app code.
### Screens
1. Welcome Screen - This screen displays the Recyclr logo and a message welcoming the user to the app. There are two buttons on this screen, one for signing in with Google and another for signing in with email.

![Onborading screen](/screenshots/1.jpg "Onborading screen")

2. Home Screen - This screen displays a list of items that the user can scan for recycling. The items include plastic bottles, furniture, and paper. Each item has a picture and a short description of what can be recycled. There is also a button for scanning an item and a button for viewing the user's rewards balance.
[Screenshot1]
3. Scan Screen - This screen displays a camera viewfinder that the user can use to scan an item. Once the item is scanned, the app uses machine learning to identify the item and provide information on whether it can be recycled or not. If the item can be recycled, the user earns rewards points that can be redeemed for items such as waste collection tools, children's books, or planting a tree.
[Screenshot1]
4. Rewards Screen - This screen displays the user's rewards balance and a list of items that can be redeemed with the rewards points. The user can select an item and redeem it by tapping a button. The screen also displays a history of the user's rewards redemptions.



5. Collection Points Screen - This screen displays a map view of the user's location and collection points for recycled items in the nearby area. The collection points are marked with pins on the map, and the user can tap a pin to view more information about the collection point, such as the types of items that can be dropped off and the pickup schedule.

[Screenshot1]

6. Profile Screen - This screen displays the user's personal information such as profile picture, name, points gained by submitting more waste, their address. And through the profile screen users can exchange their points to coins in order to redeem some eco-friendly tools such as bags,... .

[Screenshot1]

### How to run the app
1. Install Android Studio: Before running the app, you need to install Android Studio on your computer. You can download it from the official website: https://developer.android.com/studio

2. Clone the project from GitHub: Once you have installed Android Studio, you can clone the project from GitHub. Open Android Studio and select `Check out project from Version Control` from the welcome screen. Then, select `Git` from the dropdown menu and enter the URL of the Recyclr app GitHub repository: https://github.com/GDSC-Bujumbura-International-University/recyclr.git

3. Open the project in Android Studio: After cloning the project, Android Studio will ask you to open it. Click on `Yes` to open the project in Android Studio.

4. Sync Gradle: Once the project is open in Android Studio, you need to sync Gradle. This will download all the dependencies required by the app. To do this, go to `File` -> `Sync Project with Gradle Files`.

5. Set up Firebase: The Recyclr app uses Firebase services for authentication and database management. You will need to set up a Firebase project and add the configuration files to the app. You can follow the instructions in the Firebase documentation to set up a project and add the configuration files: https://firebase.google.com/docs/android/setup

6. Run the app: Once you have set up Firebase, you can run the app on an emulator or a physical device. To do this, click on the `Run` button in Android Studio, select the device you want to run the app on, and click on `OK`. Android Studio will build and install the app on the selected device.

7. Test the app: Once the app is installed on the device, you can test its features. You can scan plastic bottles, furniture, and paper using the camera, and earn points that can be redeemed in the store. You can also log in using Google Auth or sign in by email.

Note: This is a high-level guide, and the steps may vary depending on the version of Android Studio you are using and the configuration of your development environment. For more detailed information on running an app in Android Studio, you can refer to the official Android Studio documentation: https://developer.android.com/studio/run

### Feedback / Testing / Iteration:
To test the Recyclr app, we conducted user testing with real users outside of our team. Based on their feedback, we implemented the following improvements to the app:

- Users found it difficult to scan items using the app. We improved the scanning process by adding a tutorial and improving the user interface of the scanning screen.

- Users wanted more rewards for recycling items. We added new rewards such as free waste collection tools and discounts on sustainable products.

- Users wanted more information about what happens to the recycled items. We added a feature to show users how their recycled items are processed and reused.

### Challenge Faced:
One challenge we faced while building the Recyclr app was integrating the Google Cloud Maps API for location tracking. We had to decide on the best way to track user location without compromising user privacy. We addressed this issue by using a geofencing technique that only tracks user location when they are within a specific range of a recycling pickup point.

### Success and Completion of Solution:
The Recyclr app has been successful in promoting sustainable waste management practices and educating users on what can and cannot be recycled at home. The app has been downloaded by over [WIP]

## Recyclr Team Members
- [Alain Bruce Nishimwe](https://github.com/nishalbruce)
- [Ibrahim Kwizera](https://github.com/ibrahim703042)
- [Angelo Arnauld Nkurunziza](https://github.com/Nkurunziza2001)
- [Don d'Honneur Irangabiye](https://github.com/H0nneur)
