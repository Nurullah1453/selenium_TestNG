package tests.day14_testNGFramework;

import org.testng.annotations.Test;

public class C02_DependsOnMethods {

    @Test(priority = -3)
    public void test01(){
        System.out.println("İlk Test calıstı");
    }

    @Test(dependsOnMethods = "test01")
    public void test02(){
        System.out.println("İkinci Test Calıstı");
    }

    @Test(dependsOnMethods = "test02")
    public void test03(){
        System.out.println("ücüncü test calıstı");
    }

}
