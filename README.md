
# Currency Price Tracker 📊

Currency Price Tracker is an Android application that provides real-time currency exchange rates. Built with **Kotlin**, it leverages **Retrofit** for seamless API communication and uses **XML** for the UI design. The app is developed in **Android Studio**.

---

## Features 🚀
- Live currency exchange rate updates.
- User-friendly interface with XML layouts.

---

## Tech Stack 🛠️
- **Programming Language:** Kotlin  
- **UI Design:** XML  
- **Networking Library:** Retrofit  
- **IDE:** Android Studio  

---

## Screenshots 📸
![App Screenshot](images/view_main.png "App Screenshot")

---

## Setup and Installation ⚙️

### Prerequisites:
1. Android Studio installed on your system.
2. A stable internet connection for fetching exchange rates.
3. API Key (if required for the currency API).

### Steps:
1. Clone the repository:
   ```bash
   git clone https://github.com/aryanteymoori
   ```
2. Open the project in **Android Studio**.
3. Sync Gradle files.
4. Add your API key to `local.properties` or directly in the Retrofit configuration.
5. Run the application on an emulator or a physical device.

---

## Architecture 🏗️
The application follows the **MVVM** (Model-View-ViewModel) architecture:
- **Model**: Handles data and API response parsing.
- **View**: XML layouts for user interface.
- **ViewModel**: Connects the View and Model, handling data logic and communication.

---

## Libraries and Tools Used 📚
1. **Retrofit**: For making network requests.  
2. **Gson**: For JSON parsing (used with Retrofit).  
3. **Coroutines**: For asynchronous programming.  
4. **ViewBinding**: For type-safe view references.  
5. **Material Design Components**: For modern UI design.  

---

## API Integration 🌐
1. currency API: http://tools.daneshjooyar.com/api/v1/currencies
2. DateTime API: https://tools.daneshjooyar.com/api/v1/date/now

### Retrofit Setup:
```kotlin
val retrofit = Retrofit.Builder()
    .baseUrl("https://api.exchangeratesapi.io/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val apiService = retrofit.create(CurrencyApiService::class.java)
```

---

## Contribution 🤝
Contributions are welcome! Please fork the repository and create a pull request with your changes. Ensure to follow the coding guidelines and write meaningful commit messages.

---

## License 📜
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## Contact 📬
For any queries or suggestions, feel free to reach out:
- **Email:** [Aryan Teymoori](mailto:atdbp9@gmail.com)
- **GitHub:** [Aryan Teymoori](https://github.com/aryanteymoori)
