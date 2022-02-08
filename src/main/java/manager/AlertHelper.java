package manager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHelper extends HelperBase{
    public AlertHelper(WebDriver wd) {
        super(wd);
    }

    public void selectItemAlert() {

        click(By.xpath("//a[@id='close-fixedban']"));

        click(By.xpath("//div[3]//div[1]//div[2]//*[name()='svg']"));
    }

    public void selectAlerts() {
        click(By.xpath("//span[text()='Alerts']"));
    }

    public void clickAlert1() {
        click(By.id("alertButton"));
        pause(2000);
        wd.switchTo().alert().accept(); /// ok button

    }

    public void clickAlert2() {
        click(By.id("timerAlertButton"));
        WebDriverWait wait = new WebDriverWait(wd,10);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }

    public void clickAlert3() {
        click(By.id("confirmButton"));
    }

    public void clickConfirmButton(String text) {
        if (text!=null && text.equals("Cancel")){
            wd.switchTo().alert().dismiss();// cancel
        }else if(text!=null && text.equals("Ok")){
            wd.switchTo().alert().accept();// ok
        }
    }

    public String getConfirmResult() {
        String text =wd.findElement(By.id("confirmResult")).getText();
        System.out.println(text);
        return text;
    }

    public void clickAlert4() {
        click(By.id("promtButton"));
        Alert alert = wd.switchTo().alert();
        alert.sendKeys("totti");
        alert.accept();


    }
}
