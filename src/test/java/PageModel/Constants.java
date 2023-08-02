package PageModel;

import org.openqa.selenium.By;

public class Constants {

    public static final By SEARCH_BOX_TIKLA = By.xpath("//textarea[@id='APjFqb']");
    public static final By CLICK_TEKNASYON = By.xpath("(//h3[contains(text(),'Teknasyon')])[1]");
    public static final By KARIYER_BUTTON = By.xpath("(//a[contains(text(),'Kariyer')])[2]");
    public static final By BACKEND_BUTTON = By.xpath("(//div[@class='jl-box jl-box-7701'])[1]");
    public static final By BASVUR_BUTTON = By.xpath("//div[@class='tb-action']");
    public static final By BASVURU_FORMU_BASVUR_BUTTON = By.xpath("//button[@class='button button-blue']");
    public static final By NAME_SURNAME_BOX_TIKLA = By.xpath("//input[@id='jobNameSurname']");
    public static final By EMAİL_BOX_TIKLA = By.xpath("//input[@id='jobEmail']");
   // public static final By CV_YUKLE_TIKLA = By.xpath("//label[@class='inputfile-label']");
    public static final By FORM_OK_CHECK_BOX_TIKLA = By.xpath("(//span[@class='ci-effect'])[1]");
    public static final By RECAPTCHA_CHECK_BOX_TIKLA = By.xpath("//iframe[@title='reCAPTCHA']");
}
