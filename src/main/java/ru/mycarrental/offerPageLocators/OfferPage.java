package ru.mycarrental.offerPageLocators;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OfferPage {

    private SelenideElement offerPageCheckBoxNavigator;
    private SelenideElement offerPageCheckBoxCamera;
    private SelenideElement offerPageCheckBoxFridge;
    private SelenideElement offerPageCheckBoxKidSeat;
    private SelenideElement offerPageListSelectQuantityOfKidSeat;
    private SelenideElement offerPageListSelectTwoUnitsOfKidSeat;

    private SelenideElement offerPageName;
    private SelenideElement offerPageSurname;
    private SelenideElement offerPageMiddleName;
    private SelenideElement offerPagePhone;
    private SelenideElement offerPageMail;
    private SelenideElement offerPageOpenOrHideAdditionalDataFields;
    private SelenideElement offerPageListPassportOrTravelDocument;
    private SelenideElement offerPageLinkPassportInsideList;
    private SelenideElement offerPageLinkTravelDocumentInsideList;
    private SelenideElement offerPageSeriesOfDocument;
    private SelenideElement offerPageNumberOfDocument;
    private SelenideElement offerPageDocumentDataOfIssue;
    private SelenideElement offerPageDocumentValidPeriod;
    private SelenideElement offerPageDocumentIssueBy;
    private SelenideElement offerPageDocumentDivisionCode;
    private SelenideElement offerPageDriverLicenseSeries;
    private SelenideElement offerPageDriverLicenseNumber;
    private SelenideElement offerPageCommentField;
    private SelenideElement offerPageCheckBoxIagree;
    private SelenideElement offerPageLinkTermsAndConditions;
    private SelenideElement offerPageTermsOfUse;
    private SelenideElement offerPageMakeAreservation;

    private SelenideElement offerPageSuccesOrderTitle;

    public OfferPage() {
        this.offerPageCheckBoxNavigator = $("[class=\"checkout-sub-checkbox\"]", 0);
        this.offerPageCheckBoxCamera = $("[class=\"checkout-sub-checkbox\"]", 1);
        this.offerPageCheckBoxFridge = $("[class=\"checkout-sub-checkbox\"]", 2);
        this.offerPageCheckBoxKidSeat = $("[class=\"checkout-sub-checkbox\"]", 3);
        this.offerPageListSelectQuantityOfKidSeat = $("[class=\"checkout-sub-qty\"]", 3);
        this.offerPageListSelectTwoUnitsOfKidSeat = $("[data-value=\"2\"]", 3);
        this.offerPageSurname = $("[ng-model=\"order.surname\"]");
        this.offerPageName = $("[ng-model=\"order.name\"]");
        this.offerPageMiddleName = $("[ng-model=\"order.middle_name\"]");
        this.offerPagePhone = $("[ng-model=\"order.phone\"]");
        this.offerPageMail = $("[ng-model=\"order.email\"]");
        this.offerPageOpenOrHideAdditionalDataFields = $("[class=\"checkout-form-document\"]");
        this.offerPageListPassportOrTravelDocument = $(By.xpath("//span[@class='sod_label' and contains (text(), \"Паспорт РФ\")]"));
        this.offerPageLinkPassportInsideList = $(By.xpath("//span[@data-value=\"russian\"]"));
        this.offerPageLinkTravelDocumentInsideList = $(By.xpath("//span[@data-value=\"international\"]"));
        this.offerPageSeriesOfDocument = $(By.xpath("//input[@ng-model=\"order.passport_series\"]"));
        this.offerPageNumberOfDocument = $(By.xpath("//input[@ng-model=\"order.passport_number\"]"));
        this.offerPageDocumentDataOfIssue = $(By.xpath("//input[@ng-model=\"order.passport_date_at\"]"));
        this.offerPageDocumentValidPeriod = $(By.xpath("//input[@ng-model=\"order.passport_date_to\"]"));
        this.offerPageDocumentIssueBy = $(By.xpath("//input[@ng-model=\"order.granted_by\"]"));
        this.offerPageDocumentDivisionCode = $(By.xpath("//input[@ng-model=\"order.granted_by_code\"]"));
        this.offerPageDriverLicenseSeries = $(By.xpath("//input[@ng-model=\"order.license_series\"]"));
        this.offerPageDriverLicenseNumber = $(By.xpath("//input[@ng-model=\"order.license_number\"]"));
        this.offerPageCommentField = $(By.xpath("//textarea[@ng-model=\"order.comment\"]"));
        this.offerPageCheckBoxIagree = $(By.xpath("//div[@class=\"checkout-form-checkbox\"]/div"));
        this.offerPageLinkTermsAndConditions = $("[href=\"/terms\"]");
        this.offerPageTermsOfUse = $("href=\"/user-agreement\"");
        this.offerPageMakeAreservation = $("[type=\"submit\"]");

        this.offerPageSuccesOrderTitle = $("[class=\"checkout-form-title ng-binding\"]");
    }

    public OfferPage selectOneNavigatorOneCameraOneFridgeTwoKidSeats() {
        System.out.println("select one navigator, one camera, one fridge, two kid seats on offer page");
        offerPageCheckBoxNavigator.click();
        offerPageCheckBoxCamera.click();
        offerPageCheckBoxFridge.click();
        offerPageCheckBoxKidSeat.click();
        offerPageListSelectQuantityOfKidSeat.click();
        offerPageListSelectTwoUnitsOfKidSeat.click();
        return new OfferPage();
    }

    public OfferPage enterSurnameNameMiddleName(String surname, String name, String middleName) {
        System.out.println("enter surname, name, middle name");
        offerPageSurname.sendKeys(surname);
        offerPageName.sendKeys(name);
        offerPageMiddleName.sendKeys(middleName);
        return new OfferPage();
    }

    public OfferPage enterPhoneAndemail(String phone, String mail) {
        System.out.println("enter phone and email");
        offerPagePhone.setValue(phone);
        offerPageMail.sendKeys(mail);
        return new OfferPage();
    }

    public OfferPage clickOnLinkShowOrHideListOfAllDocuments() {
        System.out.println("click on link to show/hide all documents list");
        offerPageOpenOrHideAdditionalDataFields.click();
        return new OfferPage();

    }

    public OfferPage enterSeriesAndNumberPassportRF(String series, String number) {
        System.out.println("enter series and number passport RF");
        offerPageListPassportOrTravelDocument.click();
        offerPageLinkPassportInsideList.click();
        offerPageSeriesOfDocument.sendKeys(series);
        offerPageNumberOfDocument.sendKeys(number);
        return new OfferPage();

    }


    public OfferPage enterDocumentDataOfIssueAndValidPeriod(String issueData, String validPeriod) {
        System.out.println("enter document data of issue and valid until");
        offerPageDocumentDataOfIssue.setValue(issueData);
        offerPageDocumentValidPeriod.setValue(validPeriod);
        return new OfferPage();

    }

    public OfferPage documentWasGivenByAndDivisionCode(String givenBy, String divisionCode) {
        System.out.println("enter data when document was given and enter division code");
        offerPageDocumentIssueBy.sendKeys(givenBy);
        offerPageDocumentDivisionCode.sendKeys(divisionCode);
        return new OfferPage();

    }

    public OfferPage writeDriverLicenseSeriesAndNumber(String licenseSeries, String numberOfLicense) {
        System.out.println("enter series and number of driver license");
        offerPageDriverLicenseSeries.sendKeys(licenseSeries);
        offerPageDriverLicenseNumber.sendKeys(numberOfLicense);
        return new OfferPage();


    }

    public OfferPage writeAcomment(String comment) {
        System.out.println("write a comment into field");
        offerPageCommentField.sendKeys(comment);
        return new OfferPage();

    }


    public void clickOnCheckBoxIagreeAndPressSubmitButton() {
        System.out.println("click on checkbox" + "I agree..." + "and press submit button");
        offerPageCheckBoxIagree.click();
        offerPageMakeAreservation.click();
    }

    public SelenideElement getOfferPageSuccesOrderTitle() {
        return offerPageSuccesOrderTitle;
    }
}



