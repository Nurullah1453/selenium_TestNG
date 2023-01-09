package tests.day18_htmlReports;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProvider {
    @DataProvider
    public static Object[][] AmazonAranacakKelimeler() {
        /*
        @DataProvider istedigimiz test methoduna test datası saglamak icin kullanılır
        Sadece bir sartı vardır:
        2 katlı bir Object array'i döndürmelidir.
         */
        Object[][] amazonAranacakKelimelerArrayi={{"Nutella"},{"java"},{"apple"},{"samsung"},{"armut"}};

        return amazonAranacakKelimelerArrayi;
    }

    //amazona gidelim
    //nutella,java,apple,samsung,armut kelimeri için arama yapalım
    //ve bu sonucların bu kelimeri icerdigini test edelim

    @Test(dataProvider = "AmazonAranacakKelimeler")
    public void aramaTesti(String aranacakKelime){

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        AmazonPage amazonPage=new AmazonPage();

        amazonPage.amazonAramaKutusu.sendKeys(aranacakKelime+ Keys.ENTER);

        String actualSonucYazısı=amazonPage.aramaSonucuElementi.getText();

        Assert.assertTrue(actualSonucYazısı.contains(aranacakKelime));

    }
}
