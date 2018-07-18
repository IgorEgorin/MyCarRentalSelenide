package ru.mycarrental.testRun;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.mycarrental.precondition.Precondition;

public class SuccessOrder extends Precondition {


    @Test
    public void successOrderTwoCitiesPeriodSevenAndHalfOfDay() {
        mainPage.enterTakeAndReturnCities("Алушта, Республика Крым", "Бахчисарай, Республика Крым")
        .selectSevenDaysPeriod()
                .selectTimeHalfOfDayPeriodAndPressFind();
        selectCarPage.selectFirstCarFromList();
        offerPage.selectOneNavigatorOneCameraOneFridgeTwoKidSeats()
                .enterSurnameNameMiddleName("Егоров", "Василий", "Александрович")
                .enterPhoneAndemail("+79991654866", "vasya44@gmaill.comm")
                .clickOnLinkShowOrHideListOfAllDocuments()
                .enterSeriesAndNumberPassportRF("4008", "471556")
                .enterDocumentDataOfIssueAndValidPeriod("15062005", "15062025")
                .documentWasGivenByAndDivisionCode("УВД Москвы №4", "235-665")
                .writeDriverLicenseSeriesAndNumber("7704", "566114")
                .writeAcomment("За час до приезда, мы Вас наберём по телефону")
                .clickOnCheckBoxIagreeAndPressSubmitButton();

        sberbankPage.
                enterCreditCardNumberExpiredMonthAndExpiredYearAndPressSubmit("4111 1111 1111 1111","12", "19","VASILII EGOROV", "123");

        validationPaymentBySms.enterSmsAndSubmitApayment("12345678");

        Assert.assertTrue(offerPage.getOfferPageSuccesOrderTitle().getText().contains("Заказ № КР"));
        
    }
}
