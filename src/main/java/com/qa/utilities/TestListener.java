package com.qa.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testBase.TestBase;

public class TestListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println("Test Case is Started and Details are " + result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("Test Case is Succesed and Details are " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case is Failed and Details are " + result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("Test Case is Skipped and Details are " + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}
	public void onStart(ITestContext context) {
		System.out.println("Testing Of User Story Started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Testing Of User Story Finishied");
	}

}
