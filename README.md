# Recyclr
[](https://img.shields.io/twitter/follow/gdscbiu)
This is a project by a team from Google Developer Student Club at Bujumbura International University. The project is about a mobile application focused on helping sorting out recyclable waste in order to protect the environment.
## Project Setup:
The Recyclr mobile app is designed to encourage and incentivize users to recycle their plastic bottles, furniture, and paper at home by scanning these items using their smartphones. Users earn points for each item they recycle, which can be redeemed in the app for waste collection tools, children's books, or tree planting. The app is built using Flutter for both iOS and Android, Firebase for the database, and Google Cloud Maps API for location tracking.

### Problem Statement:
The Recyclr mobile app aims to address the issue of increasing plastic waste in the environment by encouraging users to recycle plastic bottles, furniture, and paper at home. The app also aims to educate users on what can and cannot be recycled at home, promoting sustainable waste management practices.

### United Nations Sustainable Development Goals:
The Recyclr mobile app aligns with the following United Nations Sustainable Development Goals:

1. Goal 12: Responsible Consumption and Production
- Target 12.5: By 2030, substantially reduce waste generation through prevention, reduction, recycling, and reuse.
2. Goal 13: Climate Action
- Target 13.3: Improve education, awareness-raising, and human and institutional capacity on climate change mitigation, adaptation, impact reduction, and early warning.

## Implementation:
The Recyclr mobile app is built using a client-server architecture. The client is developed using Flutter, which provides a cross-platform development framework for both iOS and Android devices. The server-side application is built using Firebase, which provides a scalable and flexible backend solution for storing and retrieving data.

The high-level components of the architecture are:

- Frontend: The frontend of the Recyclr app is developed using Flutter. The frontend is responsible for handling user interactions, displaying data, and providing a user-friendly interface for the app.

- Backend: The backend of the Recyclr app is developed using Firebase. The backend is responsible for storing and retrieving user data, managing user accounts, and sending notifications to users.

Technologies and Programming Languages: The Recyclr app is developed using the following technologies and programming languages:

- Flutter: A cross-platform mobile app development framework.
- Firebase: A scalable and flexible backend solution for mobile and web applications.
- Google Cloud Maps API: A location-based service for tracking user location.
- Dart: A programming language used for developing Flutter applications.
### Screens
1. Welcome Screen - This screen displays the Recyclr logo and a message welcoming the user to the app. There are two buttons on this screen, one for signing in with Google and another for signing in with email.
[Screenshot1]
2. Home Screen - This screen displays a list of items that the user can scan for recycling. The items include plastic bottles, furniture, and paper. Each item has a picture and a short description of what can be recycled. There is also a button for scanning an item and a button for viewing the user's rewards balance.
[Screenshot1]
3. Scan Screen - This screen displays a camera viewfinder that the user can use to scan an item. Once the item is scanned, the app uses machine learning to identify the item and provide information on whether it can be recycled or not. If the item can be recycled, the user earns rewards points that can be redeemed for items such as waste collection tools, children's books, or planting a tree.
[Screenshot1]
4. Rewards Screen - This screen displays the user's rewards balance and a list of items that can be redeemed with the rewards points. The user can select an item and redeem it by tapping a button. The screen also displays a history of the user's rewards redemptions.
[Screenshot1]
5. Collection Points Screen - This screen displays a map view of the user's location and collection points for recycled items in the nearby area. The collection points are marked with pins on the map, and the user can tap a pin to view more information about the collection point, such as the types of items that can be dropped off and the pickup schedule.
[Screenshot1]

### How to run the app
1. Install Flutter and Dart SDKs on your computer by following the instructions in the [Flutter documentation](https://docs.flutter.dev/get-started/install).
2. Clone the Recyclr repository from GitHub to your local machine by running the command git clone https://github.com/GDSC-Bujumbura-International-University/Recyclr.git in a terminal or command prompt window.
3. Open Android Studio and click on `Open an existing Android Studio project`.
4. Navigate to the `Recyclr` project directory and select the android folder.
5. Once the Gradle build finishes, open a terminal or command prompt window in the project directory and run the command `flutter pub get` to install all dependencies.
6. Create a Firebase project and enable Firebase Authentication and Cloud Firestore. Copy the [Firebase configuration details](https://support.google.com/firebase/answer/7015592?hl=en#zippy=%2Cin-this-article) and paste them in the `android/app/google-services.json` and `ios/Runner/GoogleService-Info.plist` files respectively. For this app, you will need to update the package name in Firebase to `com.example.recyclr`.
7. Create a Google Cloud project and enable Google Maps JavaScript API. Generate an API key and replace the placeholder in `lib/screens/map_screen.dart` with your key.
8. Connect your Android device to your computer via USB and enable USB debugging in Developer options. Alternatively, you can use an emulator.
9. Run the app on your device by clicking the green play button in Android Studio, selecting your device or emulator, and clicking OK. The app should start running on your device.
10. To test the app's functionality, you can create test users with Firebase Authentication and try out the various features such as scanning items, redeeming rewards, and viewing collection points on the map.

### Feedback / Testing / Iteration:
To test the Recyclr app, we conducted user testing with real users outside of our team. Based on their feedback, we implemented the following improvements to the app:

- Users found it difficult to scan items using the app. We improved the scanning process by adding a tutorial and improving the user interface of the scanning screen.

- Users wanted more rewards for recycling items. We added new rewards such as free waste collection tools and discounts on sustainable products.

- Users wanted more information about what happens to the recycled items. We added a feature to show users how their recycled items are processed and reused.

### Challenge Faced:
One challenge we faced while building the Recyclr app was integrating the Google Cloud Maps API for location tracking. We had to decide on the best way to track user location without compromising user privacy. We addressed this issue by using a geofencing technique that only tracks user location when they are within a specific range of a recycling pickup point.

### Success and Completion of Solution:
The Recyclr app has been successful in promoting sustainable waste management practices and educating users on what can and cannot be recycled at home. The app has been downloaded by over [WIP]

## Core Team Members
- [Alain Bruce Nishimwe](https://github.com/nishalbruce)
- [Ibrahim Kwizera](https://github.com/ibrahim703042)
- [Angelo Arnauld Nkurunziza](https://github.com/Nkurunziza2001)
- [Don d'Honneur Irangabiye](https://github.com/H0nneur)
