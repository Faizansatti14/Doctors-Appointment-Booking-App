# Doctor Appointment App

A modern Android application that helps users book appointments with doctors. This app provides a seamless experience for patients to find and schedule appointments with healthcare professionals.

## Features

- User-friendly interface for browsing doctors
- Doctor profiles with detailed information
- Appointment scheduling system
- Top doctors listing
- Firebase integration for real-time data management

## Technical Stack

- **Language**: Kotlin
- **Minimum SDK**: 26 (Android 8.0)
- **Target SDK**: 35
- **Architecture**: MVVM (Model-View-ViewModel)
- **Key Dependencies**:
  - Firebase Database
  - AndroidX Core KTX
  - Material Design Components
  - Glide (for image loading)
  - ViewBinding

## Project Structure

```
app/
├── src/
│   └── main/
│       ├── java/com/example/doctor_appointmentapp/
│       │   ├── Activity/         # UI components and screens
│       │   ├── Adapter/          # RecyclerView adapters
│       │   ├── Domain/           # Data models and business logic
│       │   └── ViewModel/        # ViewModels for MVVM architecture
│       ├── res/                  # Resources (layouts, drawables, etc.)
│       └── AndroidManifest.xml   # App configuration
```

## Key Components

### Activities
- `MainActivity`: Main entry point of the application
- `IntroActivity`: Introduction/welcome screen
- `TopDoctorsActivity`: Displays list of top-rated doctors
- `DetailActivity`: Shows detailed information about a specific doctor
- `BaseActivity`: Base class for common activity functionality

## Setup and Installation

1. Clone the repository
2. Open the project in Android Studio
3. Sync Gradle files
4. Configure Firebase:
   - Create a new project in [Firebase Console](https://console.firebase.google.com/)
   - Add an Android app to your Firebase project with package name `com.example.doctor_appointmentapp`
   - Download the `google-services.json` file
   - Replace the existing `google-services.json` in the `app` directory with your downloaded file
   - Make sure to update the Firebase API key in `app/google-services.json` with your own API key
5. Build and run the application

## Firebase Setup

1. Go to [Firebase Console](https://console.firebase.google.com/)
2. Create a new project or use an existing one
3. Add an Android app to your project:
   - Package name: `com.example.doctor_appointmentapp`
   - App nickname: "Doctor Appointment App" (or any name you prefer)
   - Debug signing certificate SHA-1: (optional for development)
4. Download the `google-services.json` file
5. Place the downloaded file in the `app` directory of your project
6. The `google-services.json` file should contain your Firebase configuration, including the API key

## Requirements

- Android Studio Arctic Fox or newer
- JDK 8 or newer
- Android SDK 26 or higher
- Google Play Services
- Firebase project with API key

## Contributing

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a new Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Contact

For any queries or support, please open an issue in the repository. 