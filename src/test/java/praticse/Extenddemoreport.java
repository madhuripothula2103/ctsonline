
package praticse;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class Extenddemoreport {
@Test
public void loginTest() throws Exception {

Assert.assertEquals("loginsucess", "loginsucess");

ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./Report/extent.html");

ExtentReports extent = new ExtentReports();
extent.attachReporter(htmlReporter);

ExtentTest logger = extent.createTest("loginTest", "Description");

logger.log(Status.INFO, "Login to facebook");
logger.log(Status.PASS, "loginsucess");

ExtentTest logger1 = extent.createTest("LogoffTest", "Description");

logger1.log(Status.FAIL, "logoffFail");

logger1.fail("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\chan\\Desktop\\ma.jpg").build());

extent.flush();


}
}