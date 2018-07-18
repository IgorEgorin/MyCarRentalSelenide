package ru.mycarrental.selectCarPageLocators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SelectCarPage {

    private SelenideElement selectFirstCarInList;

    public SelectCarPage() {
        this.selectFirstCarInList = $("[class=\"search-list-name ng-binding\"]");
    }

    public SelectCarPage selectFirstCarFromList() {
        System.out.println("select first far from catalog list");
        selectFirstCarInList.click();
        return new SelectCarPage();
    }
}
