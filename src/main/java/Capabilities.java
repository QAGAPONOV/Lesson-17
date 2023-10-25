import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Capabilities {
    public static DesiredCapabilities getAndroidCapabilities() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        cap.setCapability(MobileCapabilityType.APP, "src/test/java/resources/com.google.android.calculator_8.4.1_84100198.apk");
        return cap;
    }
}
