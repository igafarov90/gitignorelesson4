package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PracticeForm {
    // locators
    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            userNumberInput = $("#userNumber"),
            currentAdress = $("#currentAddress"),
            subjectsInput = $("#subjectsInput"),
            genterRadioButton = $("#genterWrapper"),
            dateOfBirthInput = $("dateOfBirthInput"),
            checkBoxHobbies = $("hobbiesWrapper"),
            stateSelect = $("#react-select-3-input"),
            citySelect = $("#react-select-4-input"),
            uploadPictureInput = $("#uploadPicture"),
            SubmitButton = $("#submit");

    // action
    public PracticeForm setFirstName() {
        firstNameInput.setValue("ilgiz");

        return this;
    }

    public PracticeForm setLastName() {
        lastNameInput.setValue("gafarov");

        return this;
    }

    public PracticeForm setUserEmail() {
        userEmailInput.setValue("igafarov90@mail.ru");

        return this;
    }

    public PracticeForm setUserNumber() {
        userNumberInput.setValue("9371247471");

        return this;
    }

    public PracticeForm setCurrentAdress() {
        currentAdress.setValue("Russia, 46°23'45.0\"N 48°05'49.1\"E");

        return this;
    }

    public PracticeForm setSubjectsInput() {
        subjectsInput.sendKeys("Chemistry");
        $("#subjectsInput").pressEnter();

        return this;
    }

    public PracticeForm setGenterRadioButton() {
        $("#genterWrapper").$(byText("Male")).click();

        return this;
    }

    public PracticeForm setDateOfBirthInput() {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOptionByValue("1990");
        $(".react-datepicker__month-select").selectOptionByValue("11");
        $(".react-datepicker__day--017").click();

        return this;
    }

    public PracticeForm clickCheckBoxHobbies() {
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#hobbiesWrapper").$(byText("Reading")).click();

        return this;
    }

    public PracticeForm setStateSelect() {
        $("#react-select-3-input").setValue("NCR").pressEnter();

        return this;
    }

    public PracticeForm setCitySelect() {
        $("#react-select-4-input").setValue("Delhi").pressEnter();

        return this;
    }

    public PracticeForm uploadPictureInput() {
        $("#uploadPicture").uploadFromClasspath("monkey.png");

        return this;
    }

    public PracticeForm clickSubmitButton() {
        $("#submit").click();

        return this;
    }
}