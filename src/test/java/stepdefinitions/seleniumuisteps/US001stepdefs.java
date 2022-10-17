package stepdefinitions.seleniumuisteps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegistrationDropdown;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US001stepdefs {


    RegistrationDropdown registration = new RegistrationDropdown();
    ReusableMethods reusableMethods = new ReusableMethods();
    @Given("user opens the URL {string}")
    public void user_opens_the_url(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }
    @When("Click on the sign in and account icon")
    public void click_OnTheSignInAndAccountIcon() {
        registration.signInAndAccountIcon.click();
    }
    @And("Click on Register Button")
    public void click_OnRegisterButton() {
        registration.registerIcon.click();
    }
    @When("Type the valid ssn as {string}")
    public void type_the_valid_ssn_as(String ssn) {
        registration.ssn.sendKeys(ssn, Keys.ENTER);
    }
    @And("Close the application")
    public void close_TheApplication() {
        Driver.getDriver().close();
    }
    @When("Type the multiple invalid ssn as {string}")
    public void typeTheMultipleInvalidSsnAs(String ssn) throws InterruptedException {
        registration.ssn.sendKeys(ssn, Keys.ENTER);
        Thread.sleep(2000);
        Assert.assertTrue(registration.textInvalidSSN.isDisplayed());
        System.out.println(registration.textInvalidSSN.getText());

    }


    @When("Click on the ssn box and leave empty ssn")
    public void clickOnTheSsnBoxAndLeaveEmptySsn() {
        registration.ssn.click();
    }

    @And("Enter a valid first name into the {string} box")
    public void enterAValidFirstNameIntoTheBox(String firstName) {
        registration.firstName.sendKeys(firstName);
    }

    @And("Enter a valid last name into the {string}box")
    public void enterAValidLastNameIntoTheBox(String lastName) {
        registration.lastName.sendKeys(lastName);
    }

    @And("Enter a valid user name into the {string} box")
    public void enterAValidUserNameIntoTheBox(String userName) {
        registration.userName.sendKeys(userName);
    }

    @And("Enter a valid email into the {string}")
    public void enterAValidEmailIntoThe(String email) {
        registration.email.sendKeys(email);
    }

    @And("Enter a valid password into the {string} box")
    public void enterAValidPasswordIntoTheBox(String password) {
        registration.newPassword.sendKeys(password);
    }

    @And("Enter a confirming password into the {string} box")
    public void enterAConfirmingPasswordIntoTheBox(String confirmPassword) throws InterruptedException {

        // registration.confirmPassword.sendKeys(confirmPassword);
        //Thread.sleep(3000);
    }


    @When("Click on the last Register button")
    public void clickOnTheLastRegisterButton() throws InterruptedException {

        registration.registerButton.click();
        Thread.sleep(3000);


    }

    @Then("Verify text that {string} is displayed")
    public void verify_TextThatIsDisplayed(String text) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(registration.successMessageToastContainer.isDisplayed());
        System.out.println(registration.successMessageToastContainer.getText());
    }


}



