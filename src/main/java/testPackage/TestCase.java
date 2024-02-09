package testPackage;

import static org.testng.Assert.assertTrue;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.event.LoggingEvent;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.epam.reportportal.message.ReportPortalMessage;
import com.epam.reportportal.service.ReportPortal;

import Config.Base;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.core.appender.FileAppender;
import org.apache.logging.log4j.core.impl.Log4jLogEvent;
import org.apache.logging.log4j.spi.LoggerContext;

public class TestCase extends Base {
	private static Logger Logg = LogManager.getLogger(Base.class);

	@BeforeMethod
	public void getdrivers() {
		driver = Base.getDriver();
	}

	@Test(priority = 0)
	public void login() throws InterruptedException, IOException {
		driver.navigate().refresh();
		// ReportPortal.emitLog("ERROR", "Step Failed", null);
		Logg.info("RP_MESSAGE#FILE#{}#{}", ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE).getAbsoluteFile(), "Homepage Screenshot");

	}

	@Test(priority = 1)
	public void Navigate_your_next() throws InterruptedException, IOException {
		//driver.findElement(By.xpath("//a[text()='Navigate your next']")).click();
		// ReportPortal.emitLog("INFO", "Step Pass", null);
	}
	public static final String screenshot_file_path = "C:\\Sabari\\github\\Selenium_Report_Portal\\reports\\Testing.jpg";
	@Test(priority = 2)
	public void Navigate_To_Careers() throws InterruptedException, IOException {
		String currentDir = System.getProperty("user.dir") + "\\reports\\Testing.png";
		File file = new File(currentDir);
		//ReportPortal.emitLog("My message", "INFO", Calendar.getInstance().getTime(), file);
		Logg.error("its failed");
        Thread.sleep(5000);
		Logg.info("RP_MESSAGE#FILE#{}#{}", ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE).getAbsoluteFile(), "Screenshot on Failure");
	
		driver.findElement(By.xpath("//a[text()='Carees']")).click();
	}

	@Test(priority = 3)
	public void Navigate_To_Home() throws InterruptedException, IOException {
		String currentDir = System.getProperty("user.dir") + "\\reports\\Testing.png";
		File file = new File(currentDir);
		//ReportPortal.emitLog("My message", "INFO", Calendar.getInstance().getTime(), file);
		Logg.error("its failed");
        Thread.sleep(5000);
		Logg.info("RP_MESSAGE#FILE#{}#{}", ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE).getAbsoluteFile(), "Screenshot on Failure");
	
		driver.findElement(By.xpath("//a[text()='Carees']")).click();
		
	}
	
	@Test(priority = 4)
	public void Navigate_To_Location() throws InterruptedException, IOException {
		String currentDir = System.getProperty("user.dir") + "\\reports\\Testing.png";
		File file = new File(currentDir);
		//ReportPortal.emitLog("My message", "INFO", Calendar.getInstance().getTime(), file);
		Logg.error("its failed");
        Thread.sleep(5000);
		Logg.info("RP_MESSAGE#FILE#{}#{}", ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE).getAbsoluteFile(), "Screenshot on Failure");
	
		driver.findElement(By.xpath("//a[text()='Carees']")).click();
		
	}
}
