package tests.day18_htmlReports;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_HTML_Reports extends TestBaseRapor {

    AmazonPage amazonPage=new AmazonPage();
    @Test
    public void test01(){

        extentTest=extentReports.createTest("Nutella Testi","Kullanıcı amazonda nutella aratabilmeli");


        //Amazona gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Amazon AnaSayfaya Gidildi");

        //Nutella aratalım
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        extentTest.info("Arama kutusuna Nutella yazıp arama yapıldı");

        //sonucların nutella icerdigini test edelim
        String actualSonucYazısı=amazonPage.aramaSonucuElementi.getText();
        String expectedKelime="Nutella";
        extentTest.info("Arama sonucları kaydedildi");

        Assert.assertTrue(actualSonucYazısı.contains(expectedKelime));
        extentTest.pass("Arama sonuclarının nutella icerdigi test edildi");


    }
}
