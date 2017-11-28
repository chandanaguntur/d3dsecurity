package d3dCom;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basepage {
    public static WebDriver driver;
    // Webdriver is a datatype for variable driver; And we need to mention globally in the class before creating a method.'Static' holds the browser in that driver and when the method is called in another class

    public void Open_Browser() {
        String br = System.getProperty("browser");
        // each time u r running run cukes , first go to menu/toolbar(Runcukes dropdown) and check--Run-->edit config--->vm opions enter -Dbrowser=Chrome/firefox/ie,
        // -D is a syntax, enter valid name ex:'browser'=Chrome/firefox etc.
        // so when u mention "browser" in above system.get.property command,first put that in variable ex:br and write if condition. or u can write as below and comment the other browsers
        // ChromeDriverManager.getInstance().setup();
        // driver = new ChromeDriver();
        // FirefoxDriverManager.getInstance().setup();
        //  driver = new FirefoxDriver();

        if (br.equals("Chrome")) {
            ChromeDriverManager.getInstance().setup();
            // above syntax is used to setup the browser
            driver = new ChromeDriver();
        } else if (br.equals("Firefox")) {
            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();
            //with firefox its not working as the compatability is not there with selenium and firefox version
        }

    }

    public void Open_url(String url) {
        driver.manage().window().maximize();
        //above syntax used to maximise the window
        driver.get(url);
    }

    public void Close_Browser() {

        driver.quit();
    }
}
