import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Factory {
    public static AndroidDriver getAndroidDriver() {
        try {
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            return new AndroidDriver(url, Capabilities.getAndroidCapabilities());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
