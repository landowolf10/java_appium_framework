package framework.utils;

import framework.config.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends Config
{
    public WebElement getElementBy(By locatorType)
    {
        return waitUntilElementLocated(locatorType);
    }

    public void sendText(WebElement element, String text)
    {
        element.clear();
        element.sendKeys(text);
    }

    public boolean isVisible(By locatorType)
    {
        WebElement element = getElementBy(locatorType);

        if (element != null)
            return true;

        return false;
    }

    private WebElement waitUntilElementLocated(By locatorType)
    {
        return waitUntil(ExpectedConditions.visibilityOfElementLocated(locatorType), 10);
    }

    private WebElement waitUntil(ExpectedCondition<WebElement> condition, int maxWaitSec)
    {
        WebDriverWait wait = new WebDriverWait(setUp(), Duration.ofSeconds(maxWaitSec));

        return wait.until(condition);
    }
}
