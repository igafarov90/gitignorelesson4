import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.PracticeForm;
import static com.codeborne.selenide.Selenide.*;


public class PracticeFormTests {

    @BeforeAll
    static void beforeAll() {
       // Configuration.baseUrl = "https://demoqa.com/automation-practice-form";
        Configuration.browser = "firefox";
        Configuration.browserSize = "1024x768";

    }
    @Test
    void SuccessFieldTextBox(){
       PracticeForm practiceForm = new PracticeForm();
       open("https://demoqa.com/automation-practice-form");
       practiceForm.setFirstName("ilgiz")
                    .setLastName("gafarov")
                    .setUserEmail("igafarov90@mail.ru")
                    .setUserNumber("9371247471")
                    .setCurrentAdress("Russia, 46°23'45.0\"N 48°05'49.1\"E")
                    .setSubjectsInput("Chemistry")
                    .setGenterRadioButton("Male")
                    .setDateOfBirthInput("1990", "11")
                    .clickCheckBoxHobbies("Music", "Reading")
                    .setStateSelect("NCR")
                    .setCitySelect("Delhi")
                    .uploadPictureInput("monkey.png")
                    .clickSubmitButton()
                    .openingModelContent()
                    .checkTable();
//new string
    }
}





