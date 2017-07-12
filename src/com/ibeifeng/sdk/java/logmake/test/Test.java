package com.ibeifeng.sdk.java.logmake.test;

import java.util.Random;

import com.ibeifeng.sdk.java.logmake.AnalyticsEngineSDK;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		while(true){
			AnalyticsEngineSDK.onChargeSuccess("orderid"+new Random().nextInt(1000000000), "ibeifeng"+new Random().nextInt(1000000000));
			Thread.sleep(1000);
			AnalyticsEngineSDK.onChargeRefund("orderid"+new Random().nextInt(1000000000), "ibeifeng" + +new Random().nextInt(1000000000));
			Thread.sleep(1000);
		}
	}
}
