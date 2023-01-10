package tests.day19_crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.CrossDriver;
import utilities.Driver;
import utilities.TestBaseCross;

import static org.testng.AssertJUnit.assertTrue;

public class C01_AmazonSearch extends TestBaseCross {

    @Test

    public void test01(){

        //Amazon anasayfaya gidelim
        driver.get(ConfigReader.getProperty("amazonUrl"));

        //Nutella için arama yapalım
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);


        //Sonucların nutella icerdigini test edelim
        WebElement sonucYazıElementi= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String expectedKelime="Nutella";
        String actualKelime=sonucYazıElementi.getText();

        assertTrue(actualKelime.contains(expectedKelime));

    }



}
