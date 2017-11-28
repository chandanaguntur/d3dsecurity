package d3dCom;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    // public WebDriver driver;
    Basepage bPage = new Basepage();

    @Before
//    @Before is a selenium defined tag.
    public void setup_browser() {
//        open a browser
        bPage.Open_Browser();
    }

    @After
    public void Tear_down(){
        bPage.Close_Browser();
        //close browser
    }
}
//First 'Runcukes test' will go to 'hooks' and (@before)open a browser for each scenario and after executing each scenario it will go to 'hooks'again and (@after)closes the browser. so it reduces the pain of writing open & close browser for many scenarios tested.
// 'Hooks' file cannot be called in any other class or executed. So we created a base page and used method calling without inheritance.This file is selenium defined file. It should be named as 'Hooks' only with this two methods in it generally.