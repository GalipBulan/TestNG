package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    // Page sayfalari o web sayfasinda kullanilacak locate'ler
    // ve varsa login islemi gibi basit method'lar icin kullanilir
    // Bir page classi olusturur olusturmaz ilk yapilacak sey parametresiz bin constructor
    // olusturup icinde PageFactory.initElements(Driver.getDriver, this) ile driver'a
    // page sayfasinda ilk deger atamasi yapmak olmalidir.



    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement amazonAramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucuElementi;



}






