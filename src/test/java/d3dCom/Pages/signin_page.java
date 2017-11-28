//Page Object/Factory Model. Cut the respective elements of step definition file and create methods for each element in 'page' file and in 'step definiton' file call each method using without inheritance/creating instance. Calling a 'Pagefile' has different syntax which u can see in 'd3d_sd' step definition file.

package d3dCom.Pages;

import d3dCom.Basepage;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class signin_page extends Basepage {

    public void Click_Login() {
        driver.findElement(By.linkText("Login")).click();
    }
    public void Enter_username(String username) {
        driver.findElement(By.name("log")).sendKeys(username);
    }
    public void Enter_password(String password) {
        driver.findElement(By.name("pwd")).sendKeys(password);
    }
    public void submit(){
        driver.findElement(By.name("submit")).click();
    }
   //public void d3d_header(String expected_header) {
  //     String Actual_header = driver.findElement(By.xpath(".//*[@id='masthead']/div[1]/div[1]/div/a/img")).getText();
       //  expected_header = "D3D Security Systems";
       // assertEquals(expected_header, Actual_header);
   // }
    public void My_account() {
        String actual_result = driver.findElement(By.xpath(".//*[@id='menu-item-5958']")).getText();
        String expected_result = "My Account";
        assertEquals(expected_result, actual_result);
    }

    public void Logout() {
        boolean Actual_Logout = driver.findElement(By.linkText("Log Out")).isDisplayed();
        assertTrue(Actual_Logout);
    }
}
