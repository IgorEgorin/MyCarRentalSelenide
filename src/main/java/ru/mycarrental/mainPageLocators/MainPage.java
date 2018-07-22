package ru.mycarrental.mainPageLocators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private SelenideElement mainPageErrorClassTakeCity;
    private SelenideElement mainPageErrorClassReturnCity;
    private SelenideElement mainPageErrorOrderLowerThan24Hours;

    private SelenideElement mainPageCityTake;
    private SelenideElement mainPageCheckBoxReturnInAnotherCity;
    private SelenideElement mainPageCityReturn;
    private SelenideElement mainPageDataTake;
    private SelenideElement mainPageTimeTake;
    private SelenideElement mainPageTimeTakeValue13_00;
    private SelenideElement mainPageDataReturn;
    private SelenideElement mainPageTimeReturn;
    private SelenideElement mainPageTimeReturnValue15_00;
    private SelenideElement mainPagePromoCodeCheckBox;
    private SelenideElement mainPagePromoCodeField;
    private SelenideElement mainPageButtonFindCars;

    public MainPage() {
        this.mainPageErrorClassTakeCity = $("[class=\"left-form-field error\"] [for=\"from-field\"]");
        this.mainPageErrorClassReturnCity = $("[class=\"left-form-field error\"] [for=\"to-field\"]");
        this.mainPageErrorOrderLowerThan24Hours = $("#swal2-content");

        this.mainPageCityTake = $("#from-field");
        this.mainPageCheckBoxReturnInAnotherCity = $("[for=\"other-return\"]");
        this.mainPageCityReturn = $("#to-field");
        this.mainPageDataTake = $("#form-date-field");
        this.mainPageTimeTake = $("[class=\"sod_label\"]",0);
        this.mainPageTimeTakeValue13_00 = $("[data-value=\"13:00\"]");
        this.mainPageDataReturn = $("#to-date-field");
        this.mainPageTimeReturn = $("[class=\"left-form-field-time\"]",1);
        this.mainPageTimeReturnValue15_00 = $("[data-value=\"15:00\"]",1);
        this.mainPagePromoCodeCheckBox = $("[for=\"promo-label\"]");
        this.mainPagePromoCodeField = $("[placeholder=\"Укажите промокод\"]");
        this.mainPageButtonFindCars = $("[type=\"button\"]");
    }

    public MainPage enterTakeAndReturnCities(String cityTake, String cityReturn) {
        System.out.println("enter Take And Return Cities");
        mainPageCityTake.setValue(cityTake).pressEnter();
        mainPageCheckBoxReturnInAnotherCity.click();
        mainPageCityReturn.setValue(cityReturn).pressEnter();
        return new MainPage();
    }

    public MainPage selectDaysPeriod(String amountOfLEFTarrowClickInsideReturnCalendar) {
        System.out.println("select days period ");
        mainPageDataReturn.click();
        for (int i = 0; i < Integer.valueOf(amountOfLEFTarrowClickInsideReturnCalendar); i++) {
            mainPageDataReturn.sendKeys(Keys.LEFT);
        }
        mainPageDataReturn.pressEnter();
        return new MainPage();
    }

    public MainPage selectTimeHalfOfDayPeriodAndPressFind() {
        System.out.println("select Time half of day period");
        mainPageTimeTake.click();
        mainPageTimeTakeValue13_00.click();
        mainPageTimeReturn.click();
        mainPageTimeReturnValue15_00.click();
        return new MainPage();
    }

    public MainPage enterPromoCodeAndSubmitSearch(String promoCodeNumber) {
        mainPagePromoCodeCheckBox.click();
        mainPagePromoCodeField.sendKeys(promoCodeNumber);
        mainPageButtonFindCars.click();
        return new MainPage();
    }

    public MainPage setNewCalendarsDataBecauseCarsInListIsEnding() {
        mainPageDataTake.click();
        for (int i = 0; i < 10; i++) {
            mainPageDataTake.sendKeys(Keys.RIGHT);

        }
        mainPageDataTake.pressEnter();
        mainPageDataReturn.click();
        for (int i = 0; i < 10; i++) {
            mainPageDataReturn.sendKeys(Keys.RIGHT);
        }
        mainPageDataReturn.pressEnter();
        return new MainPage();
    }

    public SelenideElement getMainPageButtonFindCars() {
        return mainPageButtonFindCars;
    }

    public SelenideElement getMainPageErrorClassTakeCity() {
        return mainPageErrorClassTakeCity;
    }

    public SelenideElement getMainPageErrorClassReturnCity() {
        return mainPageErrorClassReturnCity;
    }

    public SelenideElement getMainPageCheckBoxReturnInAnotherCity() {
        return mainPageCheckBoxReturnInAnotherCity;
    }

    public SelenideElement getMainPageDataTake() {
        return mainPageDataTake;
    }

    public SelenideElement getMainPageDataReturn() {
        return mainPageDataReturn;
    }

    public String getMainPageErrorOrderLowerThan24Hours() {
        return mainPageErrorOrderLowerThan24Hours.getText();
    }
}
