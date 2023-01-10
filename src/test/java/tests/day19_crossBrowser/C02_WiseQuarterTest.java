package tests.day19_crossBrowser;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseCross;

public class C02_WiseQuarterTest extends TestBaseCross {

    @Test
    public void test01(){

        //wisequarter anasayfaya gidelim
        driver.get("https://wisequarter.com/");

        //wisequarter sitesine gittimizi test edelim

        String actualUrl= driver.getCurrentUrl();
        String expectedKelime="wisequarter";

        Assert.assertTrue(actualUrl.contains(expectedKelime));


    }
}
