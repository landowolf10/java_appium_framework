package steps_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import project.pages.LoginPage;

public class LoginSteps
{
    LoginPage login = new LoginPage();

    @Given("App is open")
    public void openApp()
    {
        login.setUp();
    }

    @Then("Validate email textbox exists")
    public void validateElementExists()
    {
        login.validateLoginPage();
    }
}