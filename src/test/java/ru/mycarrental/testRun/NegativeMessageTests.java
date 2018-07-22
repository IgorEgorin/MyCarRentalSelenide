package ru.mycarrental.testRun;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.mycarrental.precondition.CsvDataProvider;
import ru.mycarrental.precondition.Precondition;

import java.util.Map;

public class NegativeMessageTests extends Precondition {


    @Test
    public void checkMainPageMessagesForNegativeCases() throws Exception {


        mainPage.getMainPageCheckBoxReturnInAnotherCity().click();
        mainPage.getMainPageButtonFindCars().click();

        Assert.assertTrue(mainPage.getMainPageErrorClassTakeCity().exists(),
                "Error CSS class of TakeCity isnot worked ");
        Assert.assertTrue(mainPage.getMainPageErrorClassReturnCity().exists(),
                "Error CSS class of ReturnCity isnot worked ");

        mainPage.getMainPageDataTake().click();
        mainPage.getMainPageDataTake().sendKeys(Keys.LEFT);
        mainPage.getMainPageDataTake().pressEnter();

        Assert.assertTrue(mainPage.getMainPageErrorOrderLowerThan24Hours()
                .contains("Для того, чтобы сделать заказ на аренду автомобиля менее," +
                        " чем за 24 часа, пожалуйста," +
                        " обратитесь в Call Center по телефону 8 800 7774848"),
                "Text about too early order doesnot found");
//        Thread.sleep(7000);
    }

    @Test(dataProvider = "CsvDataProvider", dataProviderClass = CsvDataProvider.class)
    public void checkErrorMessagesOnOfferPage(Map<String, String> testData) throws Exception {


        String variableDataSurname = testData.get("surname");
        String variableDataName = testData.get("name");
        String variableDataPhone = testData.get("phone");
        String variableDataMail = testData.get("mail");
        String variableDataExpErrMessage = testData.get("expectedErrorMessage");

        mainPage.enterTakeAndReturnCities(
                "Алушта, Республика Крым", "Бахчисарай, Республика Крым")
                .setNewCalendarsDataBecauseCarsInListIsEnding()
                .enterPromoCodeAndSubmitSearch("0");

        selectCarPage.selectFirstCarFromList();

        offerPage.enterSurnameNamePhoneMail(variableDataSurname,
                variableDataName, variableDataPhone, variableDataMail);

        offerPage.clickOnCheckBoxIagreeAndPressSubmitButton();

        Assert.assertTrue(offerPage.getErrorMessageAllClassOfferPage()
                .contains(variableDataExpErrMessage));

        System.out.println("Expected message was" + " :"+ variableDataExpErrMessage+ "\n");

    }


    @Test
    public void checkErrorMessageWhenCheckBoxIagreeIsnotMarked() {

        String variableExpErrMessageMarkAagreeCheckBox = "Необходимо согласиться с условиями";

        mainPage.enterTakeAndReturnCities(
                "Алушта, Республика Крым", "Бахчисарай, Республика Крым")
                .setNewCalendarsDataBecauseCarsInListIsEnding()
                .enterPromoCodeAndSubmitSearch("0");

        selectCarPage.selectFirstCarFromList();

        offerPage.enterSurnameNamePhoneMail("Egorov", "Vasilii"
                , "+79999999999", "vasya44@gmaill.comm");

        offerPage.getOfferPageMakeAreservation().click();

        Assert.assertTrue(offerPage.getErrorMessageAllClassOfferPage()
                .contains(variableExpErrMessageMarkAagreeCheckBox));

        System.out.println("Expected message was" + " :"+ variableExpErrMessageMarkAagreeCheckBox+ "\n");
    }
}
