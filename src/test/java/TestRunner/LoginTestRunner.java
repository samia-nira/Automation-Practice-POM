package TestRunner;

import Pages.Login;
import Utils.Utils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.FileReader;
import java.io.IOException;

public class LoginTestRunner {
    Login objLogin;
    Utils utils;

    public void doLogin() throws Exception {
        driver.get("http://automationpractice.com");
        objLogin = new Login(driver);
        utils =new Utils(driver);
        utils.readJSONArray(0);
        String user = objLogin.doLogin(utils.getEmail(), utils.getPassword());
        Assert.assertEquals(user, "Samia Nira544");
        driver.findElement(By.xpath("//a[@class='logout']")).click();
    }



}
