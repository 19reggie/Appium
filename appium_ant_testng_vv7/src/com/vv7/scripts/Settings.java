package com.vv7.scripts;

import io.appium.java_client.android.AndroidKeyCode;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.vv7.controllers.Runner;
import com.vv7.models.AppsInfo;

public class Settings extends Runner {

	public void TT() {
		driver.startActivity(AppsInfo.Settings[0], AppsInfo.Settings[1]);
		// 飞行模式
		WebElement el = driver
				.findElementById("com.android.settings:id/switchWidget");
		String state_0 = el.getAttribute("checked");
		el.click();
		String state_1 = el.getAttribute("checked");
		Assert.assertNotEquals(state_0, state_1);
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		// WLAN
		WebElement el2 = driver.findElementByName("WLAN");
		el2.click();
		WebElement el3 = driver
				.findElementById("com.aurora:id/aurora_action_bar_title");
		Assert.assertEquals(el3.getText(), "WLAN");
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		// 移动网络
		WebElement el4 = driver.findElementByName("移动网络");
		el4.click();
		WebElement el5 = driver
				.findElementById("com.aurora:id/aurora_action_bar_title");
		Assert.assertEquals(el5.getText(), "移动网络设置");
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		// 蓝牙
		WebElement el6 = driver.findElementByName("蓝牙");
		el6.click();
		WebElement el7 = driver
				.findElementById("com.aurora:id/aurora_action_bar_title");
		Assert.assertEquals(el7.getText(), "蓝牙");
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		// 共享热点
		WebElement el8 = driver.findElementByName("共享热点");
		el8.click();
		WebElement el9 = driver
				.findElementById("com.aurora:id/aurora_action_bar_title");
		Assert.assertEquals(el9.getText(), "网络共享");
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		//显示
		WebElement el10 = driver.findElementByName("显示");
		el10.click();
		WebElement el11 = driver
				.findElementById("com.aurora:id/aurora_action_bar_title");
		Assert.assertEquals(el11.getText(), "显示");
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		//壁纸
		WebElement el12 = driver.findElementByName("壁纸");
		el12.click();
		WebElement el13 = driver
				.findElementById("com.aurora:id/aurora_action_bar_title");
		Assert.assertEquals(el13.getText(), "壁纸设置");
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		//日期和时间
		WebElement el14 = driver.findElementByName("日期和时间");
		el14.click();
		WebElement el15 = driver
				.findElementById("com.aurora:id/aurora_action_bar_title");
		Assert.assertEquals(el15.getText(), "日期和时间");
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		//声音和振动
		WebElement el16 = driver.findElementByName("声音和振动");
		el16.click();
		WebElement el17 = driver
				.findElementById("com.aurora:id/aurora_action_bar_title");
		Assert.assertEquals(el17.getText(), "声音和振动");
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		//通知栏
		WebElement el18 = driver.findElementByName("通知栏");
		el18.click();
		WebElement el19 = driver
				.findElementById("com.aurora:id/aurora_action_bar_title");
		Assert.assertEquals(el19.getText(), "通知栏");
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		//向上滑动
		//从(startx,starty)滑到（endx,endy），分duration步滑，每一步用时是5毫秒。
		driver.swipe(720, 2360, 720,1660, 500);

	}

}
