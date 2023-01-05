package tests.day14_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_DependsOnMethods {
    /*
      dependsOnMethods methodu ile bir methodun calismasini baska bir method a baglariz.
      Eger onceki test calisirsa onun calismasina bagli olan test calisir.
      Eger onceki test passed olmaz ise sonraki test calismayi rededer

      Hangi testi calistirirsak calisriralim ilk olarak bagli oldugu testi calistirip sonra
      calismasini istedigimiz testi calistirir. fakat en fazla 2 test calisririr.
     */

    @Test

    public void ilkTest (){

        System.out.println("Ilk test calisti");
        Assert.assertTrue(5<4);
    }

    @Test (dependsOnMethods ="ilkTest" )

    public void ikinciTest (){

        System.out.println("Ikinci test calisti");
    }
    @Test (dependsOnMethods ="ikinciTest")

    public void ucuncuTest (){

        System.out.println("Ucuncu test calisti");
    }
}
