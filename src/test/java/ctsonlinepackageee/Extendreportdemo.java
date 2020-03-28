package ctsonlinepackageee;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class Extendreportdemo {
@Test
public void loginTest() {

Assert.assertEquals("loginsucess", "loginsucess");

ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./Reports1/extent.html");

ExtentReports extent = new ExtentReports();
extent.attachReporter(htmlReporter);

ExtentTest logger = extent.createTest("loginTest", "Description");

logger.log(Status.INFO, "Login to facebook");

logger.log(Status.PASS, "loginsucess");

extent.flush();


}
}