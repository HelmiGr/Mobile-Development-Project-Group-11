# Healio - A Health App

## Features
- Track steps, calories, water intake
- BMI calculator
- Medicine logger
- Exercise logger
- A calendar for helpful reminders

## Project Structure
### Data
- Handles fetching data from API.
- Provides data to ViewModels using functions from Retrofit.

### Models
- Holds data classes that are used across the app.
  - UI data classes (e.g., `TabItem` for the navbar).
  - API response data classes.

### UI/Components
- Components that are used across multiple screens (e.g., navbar, buttons).

### UI/Screens/{screenName}
- Contains UI code used specifically in that screen.
- Contains the ViewModel for that screen (ViewModel holds logic between data and UI).

### Navigation
- `HealioNavigation.kt` has the main `NavHost` that is loaded in `MainActivity`. It holds the final navigation.
- `Routes.kt` has route constants that are used across the app. This ensures that the route names stay the same.
