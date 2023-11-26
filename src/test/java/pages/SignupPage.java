package pages;

import com.github.javafaker.Faker;
import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

@Data
public class SignupPage {

    public SignupPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(linkText = "Sign up")
    private WebElement signupButton;

    @FindBy(id = "inputfirstname4")
    private WebElement firstName;

    @FindBy(id = "inputlastname4")
    private WebElement lastName;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "register")
    private WebElement registerButton;

    @FindBy(id = "exampleInputPassword1")
    private WebElement password;

public void signupWithValidData(){
    Faker faker = new Faker();
    String generatedPassword = null;
    do {
        generatedPassword = faker.internet().password(8, 20, true, true);
    } while (!(generatedPassword.length() >= 8 && generatedPassword.matches(".*[A-Z].*") && generatedPassword.matches(".*\\d.*")));

//    signupButton.click();
    firstName.sendKeys(faker.name().firstName());
    lastName.sendKeys(faker.name().lastName());
    email.sendKeys(faker.internet().emailAddress());
    password.sendKeys(generatedPassword);
    registerButton.click();
}


//    <a href="register.php"><small>Sign up</small></a>



}
