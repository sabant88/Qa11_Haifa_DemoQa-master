package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTests extends TestBase{

    @BeforeClass
    public void preCondition(){
        app.getAlert().selectItemAlert();
        app.getAlert().selectAlerts();
    }


    @Test
    public void clickAlert1(){
app.getAlert().clickAlert1();
    }


    @Test
    public void waitAlert(){
        app.getAlert().clickAlert2();
        app.getAlert().pause(3000);
    }

    @Test
    public void clickConfirmButton(){
        app.getAlert().clickAlert3();
        app.getAlert().clickConfirmButton("Cancel");
        Assert.assertTrue(app.getAlert().getConfirmResult().contains("Cancel"));
    }

    @Test
    public void clickPromtButton(){
        app.getAlert().clickAlert4();


        Assert.assertTrue(app.getAlert().elementGetText(By.xpath("//span[.='On button click, prompt box will" +
                " appear']/following-sibling::span")).contains("totti"));

      //  Assert.assertEquals(app.getAlert().isElementPresent(By.linkText("")), true);
    }
}
