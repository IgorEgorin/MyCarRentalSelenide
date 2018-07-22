package ru.mycarrental.selectCarPageLocators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SelectCarPage {

    private SelenideElement selectFirstCarInList;
    private SelenideElement selectCarPageFirstCarInListPayForDayWithDiscount;

    public SelectCarPage() {
        this.selectFirstCarInList = $("[class=\"search-list-name ng-binding\"]");
        this.selectCarPageFirstCarInListPayForDayWithDiscount = $(By.xpath("//strong[@class=\"ng-binding\"]"));
    }

    public SelectCarPage selectFirstCarFromList() {
        System.out.println("select first car from Select-List");
        selectFirstCarInList.click();
        return new SelectCarPage();
    }

    public String selectCarPagePriceForDayWithDiscount() {
        return selectCarPageFirstCarInListPayForDayWithDiscount.getText();
    }
}
