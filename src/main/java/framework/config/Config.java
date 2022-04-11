package framework.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Config extends DesiredCapabilities
{
    protected RemoteWebDriver androidDriver;

    protected RemoteWebDriver setUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "ZY327VC88R");
        capabilities.setCapability("appPackage", "com.example.notesmvvm");
        capabilities.setCapability("appActivity", "com.example.notesmvvm.ui.views.user.LoginActivity");
        try {
            androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        //androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return androidDriver;
    }
    /*public void stopServer() {
        service.stop();
    }*/
}
