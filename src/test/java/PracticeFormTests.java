import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.PracticeForm;
import static com.codeborne.selenide.Selenide.*;


public class PracticeFormTests {

    @BeforeAll
    static void beforeAll() {
        //Запускал в firefox, в chrome не пашет, не видит кнопку Submit
        Configuration.browser = "firefox";
        //Configuration.baseUrl = "https://demoqa.com/automation-practice-form";
        //Configuration.browserSize = "1920x1080";
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
                    .clickSubmitButton();

        sleep(5000);

       /* // Проверяю, открытие модального окна и заполненность полей
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $("[class=\"table-responsive\"]").$("tbody")
                .shouldHave(text("ilgiz gafarov"),
                        text("Student Email"),
                        text("igafarov90@mail.ru"),
                        text("Gender"),
                        text("Male"),
                        text("Mobile"),
                        text("9371247471"),
                        text("Date of Birth"),
                        text("17 December,1990"),
                        text("Subjects"),
                        text("Chemistry"),
                        text("Hobbies"),
                        text("Music, Reading"),
                        text("Picture"),
                        text("monkey.png"),
                        text("Address"),
                        text("Russia, 46°23'45.0\"N 48°05'49.1\"E"),
                        text("State and City"),
                        text("NCR Delhi")
                );*/
    }
}



