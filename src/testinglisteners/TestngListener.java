package testinglisteners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestngListener extends TestListenerAdapter {
    public void onTestStart(ITestResult tr){
        System.out.println("Test method is started");
    }
    public void onTestSuccess(ITestResult tr) {
        System.out.println("Test method is passed");
    }
    public void onTestFailure(ITestResult tr){
        System.out.println("Test method is failed");
    }
    public void onTestSkipped(ITestResult tr) {
        System.out.println("Test method is skipped");
    }

    }

