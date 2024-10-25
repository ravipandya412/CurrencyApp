This CurrencyApp is built using Compose Multiplatform.

It uses:
- Compose Multiplatform Framework
- Working with a Local Database (MongoDB Realm)
- Working with Network (Ktor)
- Offline Cache
- MVVM Architecture
- Clean Architecture
- Beautiful and Animated UI
- Material 3 Components

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.








https://github.com/user-attachments/assets/9f549d8c-964f-4231-92b0-7657b6cef67f

