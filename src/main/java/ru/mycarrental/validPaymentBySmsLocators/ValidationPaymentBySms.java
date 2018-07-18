package ru.mycarrental.validPaymentBySmsLocators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ValidationPaymentBySms {

    private SelenideElement validationPaymentBySmsField;
    private SelenideElement validationPaymentBySmsSubmit;

    public ValidationPaymentBySms() {
        this.validationPaymentBySmsField = $(By.xpath("//input[@name=\"password\"]"));
        this.validationPaymentBySmsSubmit = $(By.xpath("//input[@value=\"Submit\"]"));
    }

    public ValidationPaymentBySms enterSmsAndSubmitApayment (String smsOnPaymentPage) {
        validationPaymentBySmsField.sendKeys(smsOnPaymentPage);
        validationPaymentBySmsSubmit.click();
        return new ValidationPaymentBySms();
    }
}
