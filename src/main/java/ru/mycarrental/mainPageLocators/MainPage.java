package ru.mycarrental.mainPageLocators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import ru.mycarrental.selectCarPageLocators.SelectCarPage;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement mainPageCityTake;
    private SelenideElement mainPageCheckBoxReturnToAnotherPage;
    private SelenideElement mainPageCityReturn;
    private SelenideElement mainPageDataTake;
    private SelenideElement mainPageTimeTake;
    private SelenideElement mainPageTimeTakeValue13_00;
    private SelenideElement mainPageDataReturn;
    private SelenideElement mainPageTimeReturn;
    private SelenideElement mainPageTimeReturnValue15_00;
    private SelenideElement mainPageButtonFindCars;

    public MainPage() {
        this.mainPageCityTake = $("#from-field");
        this.mainPageCheckBoxReturnToAnotherPage = $("[for=\"other-return\"]");
        this.mainPageCityReturn = $("#to-field");
        this.mainPageDataTake = $("#form-date-field");
        this.mainPageTimeTake = $("[class=\"sod_label\"]",0);
        this.mainPageTimeTakeValue13_00 = $("[data-value=\"13:00\"]");
        this.mainPageDataReturn = $("#to-date-field");
        this.mainPageTimeReturn = $("[class=\"left-form-field-time\"]",1);
        this.mainPageTimeReturnValue15_00 = $("[data-value=\"15:00\"]",1);
        this.mainPageButtonFindCars = $("[type=\"button\"]");
    }

    public MainPage enterTakeAndReturnCities(String cityTake, String cityReturn) {
        System.out.println("enter Take And Return Cities");
        mainPageCityTake.setValue(cityTake).pressEnter();
        mainPageCheckBoxReturnToAnotherPage.click();
        mainPageCityReturn.setValue(cityReturn).pressEnter();
        return new MainPage();
    }

    public MainPage selectSevenDaysPeriod() {
        System.out.println("select Seven Days Period ");
        mainPageDataTake.click();
        mainPageDataTake.sendKeys(Keys.RIGHT);
        mainPageDataTake.pressEnter();
        mainPageDataReturn.click();
        mainPageDataReturn.sendKeys(Keys.RIGHT);
        mainPageDataReturn.pressEnter();
        return new MainPage();
    }

    public void selectTimeHalfOfDayPeriodAndPressFind() {
        System.out.println("select Time half of day period");
        mainPageTimeTake.click();
        mainPageTimeTakeValue13_00.click();
        mainPageTimeReturn.click();
        mainPageTimeReturnValue15_00.click();
        mainPageButtonFindCars.click();
    }

}
