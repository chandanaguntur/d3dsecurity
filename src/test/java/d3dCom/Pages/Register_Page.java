package d3dCom.Pages;

import d3dCom.Basepage;
import org.openqa.selenium.By;

public class Register_Page extends Basepage {
    public void Click_Register() {
        driver.findElement(By.linkText("Register")).click();
    }

    public void Enter_User(String name) {
        driver.findElement(By.name("email")).sendKeys(name);
    }

    public void Enter_Password(String password) {
        driver.findElement(By.name("pass1")).sendKeys(password);
    }

    public void Conf_Password(String confirm) {
        driver.findElement(By.name("pass2")).sendKeys(confirm);
    }
    public void Click_submit(){
        driver.findElement(By.name("submit")).click();
    }
    public void MyAcc_url() {
        driver.getCurrentUrl();
    }

}
