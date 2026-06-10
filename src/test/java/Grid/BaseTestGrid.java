package Grid;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Utils.DriverFactory;
import Utils.DriverFactoryGrid;
import Utils.DriverManager;

public class BaseTestGrid {

	 @Parameters("browser")
	    @BeforeMethod
	    public void setup(String browser)
	            throws Exception {

		 DriverFactoryGrid.initDriver(browser);

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
