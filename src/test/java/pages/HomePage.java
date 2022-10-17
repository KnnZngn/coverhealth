package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {

      PageFactory.initElements(Driver.getDriver(),this);
    }




    @FindBy(xpath = "//*[(text()='HOME')]")
    public WebElement homeLink;

    @FindBy(xpath = "//*[(text()='ABOUT')]")
    public WebElement aboutLink;

    @FindBy(xpath = "//*[(text()='SERVICES')]")
    public WebElement servicesLink;

    @FindBy(xpath = "//*[(text()='DEPARTMENTS')]")
    public WebElement departmentsLink;

    @FindBy(xpath = "//*[(text()='DOCTORS')]")
    public WebElement doctorsLink;

    @FindBy(xpath = "//*[(text()='CONTACT')]")
    public WebElement contactLink;

    @FindBy(css = "#account-menu")//signin olmak ve sonrasında acoount işlemleri için
    public WebElement signInAndAccountIcon;

    @FindBy(xpath = "//*[(text()='Get Started')]")
    public WebElement getStarted;

    @FindBy(xpath = "//span[.='Items&Titles']")//adminde gözüküyor
    public WebElement itemsTitlesButton;

    @FindBy(xpath = "//span[.='Administration']")//adminde gözüküyor
    public WebElement administrationButton;

    @FindBy(xpath = "//*[(text()='MY PAGES')]")//staffda gözüküyor
    public WebElement myPagesButton;

    @FindBy(css = "svg[data-icon='th-list']")//patientde gözüküyor
    public WebElement myPagesPatientButton;

    @FindBy(xpath = "//*[(text()=' Appointment')]")
    public WebElement makeAppointment;

    //make an appointmenta clickleyince çıkıyor. homepage in alt kısmında
    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "phone")
    public WebElement phoneNumber;

    @FindBy(id = "appoDate")
    public WebElement appointmentDateTime;

    @FindBy(id = "register-submit")
    public WebElement sendAppointmentRequest;

}
