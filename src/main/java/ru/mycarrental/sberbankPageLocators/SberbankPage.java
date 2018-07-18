package ru.mycarrental.sberbankPageLocators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SberbankPage {

    private SelenideElement sberbankPageCardNumber;
    private SelenideElement sberbankPageExpiredMonth;
    private SelenideElement sberbankPageExpiredYear;
    private SelenideElement sberbankPageClientNameAndSurname;
    private SelenideElement sberbankPageCvc;
    private SelenideElement sberbankPageSubmitButton;

    public SberbankPage() {
        this.sberbankPageCardNumber = $("#iPAN_sub");
        this.sberbankPageExpiredMonth = $("#input-month");
        this.sberbankPageExpiredYear = $("#input-year");
        this.sberbankPageClientNameAndSurname = $("#iTEXT");
        this.sberbankPageCvc = $("#iCVC");
        this.sberbankPageSubmitButton = $("#buttonPayment");
    }

    public void enterCreditCardNumberExpiredMonthAndExpiredYearAndPressSubmit(
            String cardNumber, String expM, String expY, String clientNameandSurname, String cvc) {
        sberbankPageCardNumber.sendKeys(cardNumber);
        sberbankPageExpiredMonth.sendKeys(expM);
        sberbankPageExpiredYear.sendKeys(expY);
        sberbankPageClientNameAndSurname.sendKeys(clientNameandSurname);
        sberbankPageCvc.sendKeys(cvc);
        sberbankPageSubmitButton.click();
    }

}
