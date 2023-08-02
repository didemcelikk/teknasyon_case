package PageModel;

import comteknasyontest.BasePageTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;
import java.util.Arrays;

import static PageModel.Constants.*;

public class PageModelTest extends BasePageTest {
    protected static WebDriver driver;

    public PageModelTest(WebDriver driver) {
        super(driver);
    }

    public PageModelTest() {
        super();
    }

    public void clickSearchBox() {
        click(SEARCH_BOX_TIKLA);
        sendKeys(By.xpath("//textarea[@id='APjFqb']"),"Teknasyon");
        clickElement(By.xpath("//span[contains(text(),'TEKNASYON')]"));
    }

    public void clickTeknasyonSite() {
        click(CLICK_TEKNASYON);
    }

    public void scrollKariyerButton() {
        scrollDownToElement(KARIYER_BUTTON);
    }

    public void clickKariyerButton() {
        click(KARIYER_BUTTON);
    }

    public void clickBackendButton() {
        click(BACKEND_BUTTON);
    }

    public void clickApplyButton() {
        click(BASVUR_BUTTON);
    }

    public void clickApplyFormButton() {
        scrollDownToElementAndClick(BASVURU_FORMU_BASVUR_BUTTON);
    }

    public void clickNameSurnameBox() {
        click(NAME_SURNAME_BOX_TIKLA);
        sendKeys(By.xpath("//input[@id='jobNameSurname']"),"Didem Kayabaşı");
    }

    public void clickEmailBox() {
        click(EMAİL_BOX_TIKLA);
        sendKeys(By.xpath("//input[@id='jobEmail']"),"beykent.didemcelik@gmail.com");
    }

    public void clickFormOkCheckBox() {
        click(FORM_OK_CHECK_BOX_TIKLA);
    }

    public void clickRecaptchaCheckBox() {
        scrollDownToElementAndClick(RECAPTCHA_CHECK_BOX_TIKLA);

    }
}

