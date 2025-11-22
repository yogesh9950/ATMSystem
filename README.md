# ATMSystem - Console Java Project (Gradle)

यह एक simple **console-based ATM Banking System** Java project है जिसे Android Studio में import करके run किया जा सकता है (Android Studio Gradle-based Java application भी चला सकता है).

## क्या है इस ZIP में
- Gradle project (settings.gradle + build.gradle)
- Java source: `src/main/java/com/atm/ATMSystem.java`

## Import and Run (Android Studio में)
1. Android Studio खोलो → **File > Open...** और इस folder में `build.gradle` चुनकर open करो.
2. Gradle sync होने दो.
3. Run configuration बनाने के लिए:
   - **Run > Edit Configurations...** → ➕ → `Application`
   - Name: `ATM Console`
   - Main class: `com.atm.ATMSystem`
   - Use classpath of module: `ATMSystem.main` (या project का main module)
4. Run ▶️ पर क्लिक करो — Console window में input दे सकोगे (PIN, choices).

## Default PIN और Initial Balance
- Default PIN: `1234`
- Initial balance: ₹5000

## Notes
- यह Android mobile app नहीं है — यह console/text-based Java application है जिसे Android Studio में Java/Gradle support के ज़रिये run किया जाता है.
- अगर कोई issue आए तो मुझे बताओ — मैं help कर दूँगा step-by-step.

