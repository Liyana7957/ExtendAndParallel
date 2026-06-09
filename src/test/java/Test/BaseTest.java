package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Utils.DriverFactory;
import Utils.DriverManager;

public class BaseTest {

    @Parameters("browser")
    @BeforeMethod
    public void setup(String browser) {

        DriverFactory.createDriver(browser);

        DriverManager.getDriver()
                .manage()
                .window()
                .maximize();
    }

 
	@AfterMethod
    public void tearDown() {

        DriverManager.getDriver().quit();

        DriverManager.unload();
    }
}
