package tests.day14_testNGFramework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C04_SoftAssert {

    @Test
    public void test(){

        //1.Adım softAssert objesi oluşturmak

        SoftAssert softAssert=new SoftAssert();

        //2.Adım softAssert objesini kullanarak istenilen assertionları yapın

        softAssert.assertEquals(6,8); //failed
        System.out.println("Birinci Assertion sonrası");

        softAssert.assertTrue(5>3); //passed
        System.out.println("İkinci Assertion Sonrası");

        softAssert.assertFalse(8>5); //failed
        System.out.println("Ücüncü Assertion sonrası");

        //3.Adım softAssert'e raporla diyecegiz.
        softAssert.assertAll();
        System.out.println("AssertAll sonrası");


    }
}
