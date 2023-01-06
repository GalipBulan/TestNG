package tests.day14_testNGFramework;

import org.testng.annotations.Test;

public class C01_TestNGErstTest {

    // TestNG test method larini isim siralamasina gore calistirir.
    // priority degeri verilen method larda priority degeri kucukten buyuge dogru calisir.
    // Esit olan priority degerlerinde harf sirasina gore calisir.
    // Eger priority degeri yazmazsak priority=0 kabul edilir.


    /*
        1- Driver Class : Oluşturacagımız Framework'de webDriver'i Driver class'ındaki getDriver()
        method'undan alacagız.Driver class'ını biraz daha geliştireceğiz .Farklı browser'larla calısabılır
        hale gelecek
        2- Page Class : Surekli kullandıgımız Locate ıslemlerini ve Logın gibi basit işlevleri yapacak
        method'ları Page class'ında olusturacagız.
        3- Bir Page class'ı olusturur olusturmaz ilk yapmamız gereken sey, parametresiz bir Constructor olusturup,içinde
        PageFactory.initElements(webdriver,this) ile driver'a page sayfasında ilk değer atamasını yapmak olmalıdır.
        4- Assertion : TestNG'de 2 assertion yontemi vardır.
            - Hard Assert : JUnit'deki assert ile aynı method'lara sahiptir . İlk FAILED olan assertion'da
            çalışmayı durdurur ve rapor verir.
            - Soft Assert : Biz raporla diyene kadar assertion'lar FAILED olsa bile çalışmaya devam eder .assertAll() ile
            raporlamasını ıstedıgımızde failed olan  assertion varsa raporlar ve çalışmayı durdurur.

         5- Genelte "test edin" dendiğinde hard assert , doğrulayın(verify) denirse soft assert kullanılır.
         */

    @Test (priority = 6)

    public void ilkTest (){

        System.out.println("Ilk test calisti");
    }

    @Test (priority = 9)

    public void ikinciTest (){

        System.out.println("Ikinci test calisti");
    }
    @Test (priority = 12)

    public void ucuncuTest (){

        System.out.println("Ucuncu test calisti");
    }

  }
