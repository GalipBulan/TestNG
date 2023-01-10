package tests.day15__SoftAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_PozitifLoginTesti {
    @Test(groups = "smoke")
    public void test01(){

        // 1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get("https://www.qualitydemy.com/");
        // 2- login linkine basin
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        // 3- Kullanici email'i olarak valid email girin
        qualitydemyPage.kullaniciEmailKutusu.sendKeys("galipbulan@gmail.com");
        // 4- Kullanici sifresi olarak valid sifre girin
        qualitydemyPage.passwordKutusu.sendKeys("Hatay.31");
        // 5- Login butonuna basarak login olun

        ReusableMethods.bekle(5);
        // qualitydemyPage.cookies.click();

        if (qualitydemyPage.cookies.isDisplayed()){
            qualitydemyPage.cookies.click();
        }
        ReusableMethods.bekle(2);
        qualitydemyPage.loginButonu.click();

        // 6- Basarili olarak giris yapilabildigini test edin
        Assert.assertTrue(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());

        Driver.closeDriver();
    }
}