import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.PracticeForm;
import static com.codeborne.selenide.Selenide.*;


public class PracticeFormTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1024x768";
    }
    @Test
    void SuccessFieldTextBox(){
        PracticeForm practiceForm = new PracticeForm();
        open ("https://demoqa.com/automation-practice-form");

       practiceForm.setFirstName()
                    .setLastName()
                    .setUserEmail()
                    .setUserNumber()
                    .setCurrentAdress()
                    .setSubjectsInput()
                    .setGenterRadioButton()
                    .setDateOfBirthInput()
                    .clickCheckBoxHobbies()
                    .setStateSelect()
                    .setCitySelect()
                    .uploadPictureInput()
                    .clickSubmitButton()
                    .openingModelContent()
                    .checkTable();
        sleep(5000);


    }
}



