##安装步骤：
1. 安装 [nodejs](http://www.nodejs.org/download/ "nodejs")，进入cmd，输入node -v检查安装是否成功
2. 安装JDK和Android SDK
3. 安装appium，进入cmd，输入npm install -g appium或者npm --registry http://registry.cnpmjs.org install -g appium。安装成功后，进入cmd，输入appium-doctor检查环境是否都配置好
4. 运行appium，进入cmd，输入appium
5. 创建Java工程，导入相关依赖架包  
 [java-client](http://appium.io/downloads.html "java-client")  
 [selenium-java](http://docs.seleniumhq.org/ "selenium-java")  
6. appium的一些方法汇总  

**findElementByAndroidUIAutomator()**   
WebElement el = driver.findElementByAndroidUIAutomator("new UiSelector().description(\"More\")");
Assert.assertNotNull(el); 
 
**findElementById()**  
WebElement el = driver.findElementById("com.xiaomi.notes:id/notelist_MenuBar_Add");

**findElementsById()**  
List<WebElement> els = driver.findElementsById("com.xiaomi.notes:id/noteitem_LayoutManager_Main");  
for(int i=0;i<els.size();i++){els.get(i); }

**findElementByName()**  
WebElement el = driver.findElementByName("小米便签"); 

**findElementByXPath()**  
 WebElement el = driver.findElementByXPath("//android.widget.ImageButton[@index='1']");

**sendKeyEvent()**  
 driver.sendKeyEvent(AndroidKeyCode.BACK);
 driver.sendKeyEvent(AndroidKeyCode.MENU);
 driver.sendKeyEvent(AndroidKeyCode.HOME);
 
**lockScreen()**     
 driver.lockScreen(3);//锁屏3s
 
**startActivity()**  
 driver.startActivity("com.xiaomi.notes", ".NoteListActivity");
 
**swipe()**  
 driver.swipe(720, 1260, 720, 660, 500);
 
**installApp()**  
driver.installApp("D:\apks2\com.xiaomi.notes.apk")

**removeApp()**  
 driver.removeApp("com.xiaomi.notes")

**closeApp()**  
 driver.closeApp();

**hideKeyboard()**  
 driver.hideKeyboard();
 
**currentActivity()**  
driver.currentActivity();

**sendKeys()**  
WebEelement el=driver.findElementById("com.xiaomi.notes:id/noteedit_note_bg");
el.sendKeys("xiaomi notes");


###[一些其他方法，参考API文档](http://appium.github.io/java-client/ "Java语言API文档")  

