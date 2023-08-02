package TestCase;

import comteknasyontest.BaseTest;
import PageModel.PageModelTest;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;


public class TeknasyonCase extends BaseTest{

    PageModelTest pageModelTest = new PageModelTest(getWebDriver());

    @Step({"Google Ana Sayfasına Gidilir"})
    public void navigateToTeknasyon() {
        driver.navigate().to("https://google.com/");
    }

    @Step({"Google Web Sitesi Olduğu Kontrolü Yapılır"})
    public void isValidSite() {
        String ActualSite = driver.getCurrentUrl();
        Assert.assertEquals(ActualSite,"https://www.google.com/");
    }

    @Step({"Arama Motoruna Teknasyon Yazılır"})
    public void searchBox() {
    pageModelTest.clickSearchBox();

    }

    @Step({"Teknasyon Web Sitesi Listelendiği Kontrol Edilir"})
    public void isListedSite() {
        String ActualTitle = driver.findElement(By.xpath("(//cite[contains(text(),'https://teknasyon.com')])[1]")).getText();
        String ExpectedTitle = "https://teknasyon.com";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Step({"Teknasyon Sitesine Tıklanır"})
    public void clickSite() {
        pageModelTest.clickTeknasyonSite();
    }

    @Step({"Teknasyon Başlığı Doğruluğu Kontrol Edilir"})
    public void isTeknasyonTitle() {
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Teknasyon";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }

    @Step({"Kariyer Yazısına Scroll Edilir"})
    public void scrollButton() {
        pageModelTest.scrollKariyerButton();
    }

    @Step({"Beş Saniye Beklenir"})
    public void waitFiveSeconds() throws InterruptedException {
        pageModelTest.waitForFiveSeconds();
    }

    @Step({"Kariyer Butonunun Var Olduğu Kontrol Edilir"})
    public void isButtonPresent() {
        String ActualTitle = driver.findElement(By.xpath("//li[@id='menu-item-128']")).getText();
        String ExpectedTitle = "Kariyer";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Step({"Kariyer Yazısına Tıklanır"})
    public void clickButton() {
        pageModelTest.clickKariyerButton();
    }

    @Step({"Üç Saniye Beklenir"})
    public void waitThreeSeconds() throws InterruptedException {
        pageModelTest.waitForThreeSeconds();
    }

    @Step({"Açıklama Kısmı Kontrol Edilir"})
    public void isExplanationValid() {
        String actulString = driver.findElement(By.xpath("//div[@class='b-desc']//p")).getText();
        Assert.assertTrue(actulString.contains("Kodluyoruz ve dünyaya sunuyoruz! Bizimle birlikte bu dünyayı keşfetmek istersen başvurunu bekliyoruz. Hemen tanışalım ve sana Teknasyon’un ayrıcalıklarından bahsedelim."));
    }

    @Step({"Backend Yazılım Geliştirici Pozisyonunun Var Olduğu Kontrol Edilir"})
    public void isBackendButtonPresent() {
        String ActualTitle = driver.findElement(By.xpath("(//div[@class='jlb-text'])[1]")).getText();
        String ExpectedTitle = "Backend Yazılım Geliştirici";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Step({"Backend Yazılım Geliştirici Pozisyonuna Tıklanır"})
    public void clickBackendTextButton() {
        pageModelTest.clickBackendButton();
    }

    @Step({"Backend Yazılım Geliştirici Pozisyonu Başlığı Doğruluğu Kontrol Edilir"})
    public void isBackendTitle() {
        String ActualTitle = driver.findElement(By.xpath("//div[@class='tb-text']//h1")).getText();
        String ExpectedTitle = "Backend Yazılım Geliştirici";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Step({"Başvur Butonunun Var Olduğu Kontrol Edilir"})
    public void isApplyButtonPresent() {
        String ActualTitle = driver.findElement(By.xpath("//div[@class='tb-action']")).getText();
        String ExpectedTitle = "Başvur";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Step({"Başvur Butonuna Tıklanır"})
    public void clickBackendApplyButton() {
        pageModelTest.clickApplyButton();
    }

    @Step({"Başvuru Formu Başvur Butonuna Tıklanır"})
    public void clickApplyFormApplyButton() {
        pageModelTest.clickApplyFormButton();
    }

    @Step({"Ad Soyad Doldurma Alanı Uyarı Yazısı Doğruluğu Kontrol Edilir"})
    public void isNameSurnameText() {
        String ActualTitle = driver.findElement(By.xpath("//span[@id='jobNameSurname-error']")).getText();
        String ExpectedTitle = "Bu alanın doldurulması zorunludur.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Step({"Email Doldurma Alanı Uyarı Yazısı Doğruluğu Kontrol Edilir"})
    public void isEmailText() {
        String ActualTitle = driver.findElement(By.xpath("//span[@id='jobEmail-error']")).getText();
        String ExpectedTitle = "Bu alanın doldurulması zorunludur.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Step({"Cv Doldurma Alanı Uyarı Yazısı Doğruluğu Kontrol Edilir"})
    public void isCvText() {
        String ActualTitle = driver.findElement(By.xpath("//span[@id='jobFile-error']")).getText();
        String ExpectedTitle = "Bu alanın doldurulması zorunludur.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Step({"Aydınlatma Metni Alanı Uyarı Yazısı Doğruluğu Kontrol Edilir"})
    public void isFormCheckBoxText() {
        String ActualTitle = driver.findElement(By.xpath("//span[@id='jobLet-error']")).getText();
        String ExpectedTitle = "CV'nizi bizimle paylaşmadan önce, Aydınlatma Metni’ni okuyup, kutucuğu işaretlemeniz gerekmektedir.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Step({"Recaptcha Metni Alanı Uyarı Yazısı Doğruluğu Kontrol Edilir"})
    public void isRecaptchaText() {
        String ActualTitle = driver.findElement(By.xpath("//span[@id='recaptchaControl-error']")).getText();
        String ExpectedTitle = "Lütfen recaptcha doğrulamasını yapınız.";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Step({"Cv Ekle Butonunun Var Olduğu Kontrol Edilir"})
    public void isCvButtonPresent() {
        String ActualTitle = driver.findElement(By.xpath("//label[@class='inputfile-label']")).getText();
        String ExpectedTitle = "CV Yükle";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Step({"Başvuru Formuna Ad Soyad Yazılır"})
    public void nameSurnameBox() {
        pageModelTest.clickNameSurnameBox();
    }

    @Step({"Başvuru Formuna Email Yazılır"})
    public void emailBox() {
        pageModelTest.clickEmailBox();
    }

   /* @Step({"Cv Yükleme Yapılır"})
    public void cvUpload() {

        WebElement uploadCv = driver.findElement(By.xpath("//label[@class='inputfile-label']"));
        uploadCv.click();
        uploadCv.sendKeys("/Users/dcelik/Desktop/Cv Didem KAYABAŞI .pdf");

    }*/  //BU MADDEDE CV YÜKLEME KISMINI BU ŞEKİLDE YAZDIM FAKAT DOSYAMDAN CV Yİ ÇEKMEDİ.

    @Step({"Aydınlatma Metni Check Box Alanına Tıklanır"})
    public void formOkBox() {
        pageModelTest.clickFormOkCheckBox();
    }

    @Step({"Recaptcha Doğrulama Alanına Tıklanır"})
    public void recaptchaBox() {
        pageModelTest.clickRecaptchaCheckBox();
    }

/*    @Step({"Başvuru Başarılı Metni Kontrol Edilir"})
    public void isApplicationSuccessfulText() {
        String actulString = driver.findElement(By.xpath("//div[@class='container']//p")).getText();
        Assert.assertTrue(actulString.contains("Başvurunuz başarılı bir şekilde alınmıştır. İlgili ekiplerimiz başvurunuzu değerlendirip en yakın zamanda dönüş sağlayacaktır."));
    }*/
// Cv yükleme olmadığı için bu alana geçiş yapamıyor ben yinede kodunu ekledim.
}
