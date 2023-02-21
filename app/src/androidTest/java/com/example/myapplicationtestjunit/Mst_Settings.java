package com.example.myapplicationtestjunit;

import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Mst_Settings extends Utility_Functions{
    private UiDevice device;

    public Mst_Settings(UiDevice uiDevice) {
        super(uiDevice);
    }

    @Before
    public void setUp() throws Exception {

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        device.pressHome();




    }
    @Test
    public void mst_Operations() throws Exception {
        // Context of the app under test.


        int i;
        for(i=1;i<=1;i++) {
            mst_Settings();
            System.out.println(" **********************MST_Settings " + i);
        }

    }

    public void mst_Settings() throws Exception{
        try{
            device.wakeUp();
            device.pressBack();
            device.pressHome();
            ufMenu_srch_App("Settings");

            //device.swipe(400, 200, 400, , 10);

            UiObject Network_Internet = new UiObject(new UiSelector()
                    .className(SETTINGS_MENU_className).index(0));
            Network_Internet.click();
            device.pressBack();
            Thread.sleep(3000);

            UiObject Connected_Devices = new UiObject(new UiSelector()
                    .className(SETTINGS_MENU_className).index(1));
            Connected_Devices.click();
            device.pressBack();
            Thread.sleep(3000);

            UiObject Apps_Notification = new UiObject(new UiSelector()
                    .className(SETTINGS_MENU_className).index(2));
            Apps_Notification.click();
            Thread.sleep(3000);

            device.pressBack();

            UiObject Battery = new UiObject(new UiSelector()
                    .className(SETTINGS_MENU_className).index(3));

            Battery.click();
            Thread.sleep(3000);
            device.pressBack();

            UiObject Display = new UiObject(new UiSelector()
                    .className(SETTINGS_MENU_className).index(4));


            Display.click();
            Thread.sleep(3000);
            device.pressBack();

            UiObject Sound = new UiObject(new UiSelector()
                    .className(SETTINGS_MENU_className).index(5));
            Sound.click();
            Thread.sleep(3000);
            device.pressBack();

            device.swipe(300, 700, 300, 100, 20);
            Thread.sleep(3000);
            device.swipe(300, 700, 300, 100, 20);


            UiObject Storage = new UiObject(new UiSelector()
                    .className(SETTINGS_MENU_className).index(1));

            Storage.click();
            Thread.sleep(3000);
            device.pressBack();

            UiObject Security_Location = new UiObject(new UiSelector()
                    .className(SETTINGS_MENU_className).index(2));
            Security_Location.click();
            Thread.sleep(3000);
            device.pressBack();

            UiObject User_Accounts = new UiObject(new UiSelector()
                    .className(SETTINGS_MENU_className).index(3));

            User_Accounts.click();
            Thread.sleep(3000);
            device.pressBack();

            UiObject Accessibility = new UiObject(new UiSelector()
                    .className(SETTINGS_MENU_className).index(4));

            Accessibility.click();
            Thread.sleep(3000);
            device.pressBack();

            UiObject Google = new UiObject(new UiSelector()
                    .className(SETTINGS_MENU_className).index(5));

            Google.click();
            Thread.sleep(3000);
            device.pressBack();

            UiObject Settings_System = new UiObject(new UiSelector()
                    .className(SETTINGS_MENU_className).index(6));
            Settings_System.click();
            Thread.sleep(3000);
            device.pressBack();
            device.pressBack();
            device.pressHome();




        }catch (Exception e){
            e.printStackTrace();
            System.out.println("********************Test Case Fail*******************");
            device.pressHome();


        }

    }
}