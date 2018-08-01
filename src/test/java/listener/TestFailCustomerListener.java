package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class TestFailCustomerListener implements ITestListener{

	public void onStart(ITestContext arg0) {
		System.out.println("!!!Test onStart");
		Reporter.log("!!!Test onStart");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("!!!Test onTestFailedButWithinSuccessPercentage");
		Reporter.log("!!!Test onTestFailedButWithinSuccessPercentage");
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("!!!Test onTestFailure");
		Reporter.log("!!!Test onTestFailure");
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("!!!Test onTestSkipped");
		Reporter.log("!!!Test onTestSkipped");
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("!!!Test onTestStart");
		Reporter.log("!!!Test onTestStart");
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("!!!Test onTestSuccess");
		Reporter.log("!!!Test onTestSuccess");
	}
	public void onFinish(ITestContext arg0) {
		System.out.println("!!!Test onFinish");
		Reporter.log("!!!Test onFinish");
	}

}
