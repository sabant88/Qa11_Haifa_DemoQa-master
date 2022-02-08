package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    AlertHelper alert;


    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://demoqa.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        alert = new AlertHelper(wd);


    }
    public void stop(){
        wd.quit();
    }

    public AlertHelper getAlert() {
        return alert;
    }
}
