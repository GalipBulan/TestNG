package tests.day14_testNGFramework;

import org.testng.annotations.Test;

public class C01_TestNGErstTest {

    // TestNG test method larini isim siralamasina gore calistirir.
    // priority degeri verilen method larda priority degeri kucukten buyuge dogru calisir.
    // Esit olan priority degerlerinde harf sirasina gore calisir.
    // Eger priority degeri yazmazsak priority=0 kabul edilir.

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
