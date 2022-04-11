package project.pages;

import framework.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage
{
    WebElement emailTxt = getElementBy(By.id("com.example.notesmvvm:id/etMail"));
    //WebElement emailTxt = setUp().findElement(By.id("com.example.notesmvvm:id/etMail"));

    public void validateLoginPage()
    {
        System.out.println("Application started");

        //WebElement element = preparation().findElement(By.xpath("//android.view.View/android.widget.EditText[1]"));

        //TouchActions touchAction = new TouchActions(preparation());


        //touchAction.singleTap(element);
        //touchAction.perform();
        //action.singleTap(element);
        //action.perform();
        //element.click();
        //preparation().getKeyboard().sendKeys("orlando.avilag@hotmail.com");
        //element.sendKeys("orlando.avilag@hotmail.com");
        sendText(emailTxt, "Test");
    }
}
