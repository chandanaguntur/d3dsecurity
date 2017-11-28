package d3dCom.Pages;

import d3dCom.Basepage;
import org.openqa.selenium.By;

public class FreeQuote_Page extends Basepage {


    public void Click_Onlinedemo() {
        driver.findElement(By.xpath(".//*[@id='menu-item-1550']/a")).click();
    }

    public void Enter_Name(String first_name) {
        driver.findElement(By.xpath(".//*[@id='wpcf7-f391-p1521-o1']/form/div[2]/span/input")).sendKeys(first_name);
    }

    public void LastName(String last_name) {
        driver.findElement(By.xpath(".//*[@id='wpcf7-f391-p1521-o1']/form/div[3]/span/input")).sendKeys(last_name);
    }

    public void Email(String email_id) {
        driver.findElement(By.name("your-email")).sendKeys(email_id);
    }

    public void Phone(String Enter_Phoneno) {
        driver.findElement(By.name("tel-879")).sendKeys(Enter_Phoneno);
    }

    public void Enter_sub(String Subject) {
        driver.findElement(By.xpath(".//*[@id='wpcf7-f391-p1521-o1']/form/p[1]/span/input")).sendKeys(Subject);
    }

    public void EnterMessage(String msg) {
        driver.findElement(By.name("your-message")).sendKeys(msg);
    }

    public void Click_Send() {
        driver.findElement(By.xpath(".//*[@id='wpcf7-f391-p1521-o1']/form/p[4]/input")).click();
    }

    public void current_url() {
        driver.getCurrentUrl();
    }

}















