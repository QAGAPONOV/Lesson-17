import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    private static AndroidDriver driver;
    private static MainScreen mainScreen;

    @BeforeAll
    public static void setUp() {
        driver = Factory.getAndroidDriver();
        mainScreen = new MainScreen(driver);
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    //3+6=9
    @Test
    public void plus() {
            driver.findElementById("com.google.android.calculator:id/digit_3").click();
            driver.findElementById("com.google.android.calculator:id/op_add").click();
            driver.findElementById("com.google.android.calculator:id/digit_6").click();
            driver.findElementById("com.google.android.calculator:id/eq").click();
            assertEquals("9", driver.findElementById("com.google.android.calculator:id/result_final"));
    };

    //3-2=1
    @Test
    public void minus() {
            driver.findElementById("com.google.android.calculator:id/digit_3").click();
            driver.findElementById("com.google.android.calculator:id/op_sub").click();
            driver.findElementById("com.google.android.calculator:id/digit_2").click();
            driver.findElementById("com.google.android.calculator:id/eq").click();
            assertEquals("1", driver.findElementById("com.google.android.calculator:id/result_final"));
    };

    //3*6=18
    @Test
    public void multiply() {
            driver.findElementById("com.google.android.calculator:id/digit_3").click();
            driver.findElementById("com.google.android.calculator:id/op_mul").click();
            driver.findElementById("com.google.android.calculator:id/digit_6").click();
            driver.findElementById("com.google.android.calculator:id/eq").click();
            assertEquals("18", driver.findElementById("com.google.android.calculator:id/result_final"));
    };

    //9/3=3
    @Test
    public void divide() {
            driver.findElementById("com.google.android.calculator:id/digit_9").click();
            driver.findElementById("com.google.android.calculator:id/op_div").click();
            driver.findElementById("com.google.android.calculator:id/digit_3").click();
            driver.findElementById("com.google.android.calculator:id/eq").click();
            assertEquals("3", driver.findElementById("com.google.android.calculator:id/result_final"));
    };
}
