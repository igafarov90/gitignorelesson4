package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
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
            SubmitButton = $("#submit"),
            ModalContent =  $("[class=\"modal-content\"]"),
            Table = $("[class=\"table-responsive\"]");

    // action
    public PracticeForm setFirstName(String firstName) {
        firstNameInput.setValue(firstName);

        return this;
    }

    public PracticeForm setLastName(String lastName) {
        lastNameInput.setValue(lastName);

        return this;
    }

    public PracticeForm setUserEmail(String userEmail) {
        userEmailInput.setValue(userEmail);

        return this;
    }

    public PracticeForm setUserNumber(String userNumber) {
        userNumberInput.setValue(userNumber);

        return this;
    }

    public PracticeForm setCurrentAdress(String Adress) {
        currentAdress.setValue(Adress);

        return this;
    }

    public PracticeForm setSubjectsInput(String subjects) {
        subjectsInput.sendKeys(subjects);
        $("#subjectsInput").pressEnter();

        return this;
    }

    public PracticeForm setGenterRadioButton(String genter) {
        $("#genterWrapper").$(byText(genter)).click();

        return this;
    }

    public PracticeForm setDateOfBirthInput(String year, String month) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOptionByValue(year);
        $(".react-datepicker__month-select").selectOptionByValue(month);
        $(".react-datepicker__day--017").click();

        return this;
    }

    public PracticeForm clickCheckBoxHobbies(String hobby1, String hobby2) {
        $("#hobbiesWrapper").$(byText(hobby1)).click();
        $("#hobbiesWrapper").$(byText(hobby2)).click();

        return this;
    }

    public PracticeForm setStateSelect(String state) {
        $("#react-select-3-input").setValue(state).pressEnter();

        return this;
    }

    public PracticeForm setCitySelect(String city) {
        $("#react-select-4-input").setValue(city).pressEnter();

        return this;
    }

    public PracticeForm uploadPictureInput(String picture) {
        $("#uploadPicture").uploadFromClasspath(picture);

        return this;
    }

    public PracticeForm clickSubmitButton() {
        $("#submit").click();

        return this;
    }
    public PracticeForm openingModelContent() {
        $("[class=\"modal-content\"]").shouldHave(text("Thanks for submitting the form"));

        return this;
    }
   public PracticeForm checkTable() {
        $("tbody").shouldHave(text("ilgiz gafarov"),
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
                text("NCR Delhi"));

        return this;
   }
}