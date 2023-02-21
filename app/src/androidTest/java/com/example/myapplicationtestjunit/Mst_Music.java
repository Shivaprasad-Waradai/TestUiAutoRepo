package com.example.myapplicationtestjunit;

import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


public class Mst_Music extends  Device_Veriables {

    int i;
    private UiDevice mUiDevice;


    @Before
    public void setUp() throws Exception {

        mUiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        mUiDevice.pressHome();

    }

    @Test
    public void operations() throws Exception {

        for (int i = 1; i <=Mst_Music_Loops; i++) {
            mst_music1();
            mst_music2();
            mst_music3();
            mst_music4();
            System.out.println("________________loop____________________ " + i);
        }

    }

    public void mst_music1() throws Exception {
        try {


            if (Util.clickByDesc(mUiDevice, App_Handler)) {
                UiObject new_Search = new UiObject(new UiSelector().resourceId(DEVICE_SEARCH_APP_FROM_MAIN_MENU_resourceId));
                new_Search.setText(PLAY_music);
                Thread.sleep(2000);
                Util.clickByDesc(mUiDevice, PLAY_music);
                Thread.sleep(10000);
                UiObject Close_Button = new UiObject(new UiSelector().description("Close"));
                if (Close_Button.exists()) {
                    Close_Button.click();
                    Thread.sleep(2000);
                    UiObject Continue_Button = new UiObject(new UiSelector().text("CONTINUE"));
                    if (Continue_Button.exists()) {
                        Continue_Button.click();
                        UiObject Allow_Button = new UiObject(new UiSelector().text("ALLOW"));
                        Allow_Button.click();

                    }

                }
                Thread.sleep(2000);
                mUiDevice.pressBack();
                mUiDevice.pressHome();


            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("sending message Failed in loop " + i + "____________");
            mUiDevice.pressBack();
            mUiDevice.pressBack();
            mUiDevice.pressHome();
        }
    }

    public void mst_music2() throws Exception {
        try {
            if (Util.clickByDesc(mUiDevice, App_Handler)) {
                UiObject new_Search = new UiObject(new UiSelector().resourceId(DEVICE_SEARCH_APP_FROM_MAIN_MENU_resourceId));
                new_Search.setText(PLAY_music);
                Thread.sleep(2000);
                Util.clickByDesc(mUiDevice, PLAY_music);
                Thread.sleep(5000);
                Util.clickByDesc(mUiDevice, Navigation_drawer);
                Thread.sleep(2000);
                Util.clickByText(mUiDevice, Recent_album);
                Thread.sleep(2000);
                mUiDevice.pressBack();
                mUiDevice.pressHome();


            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("sending message Failed in loop " + i + "____________");
            mUiDevice.pressBack();
            mUiDevice.pressBack();
            mUiDevice.pressHome();
        }
    }
    public void mst_music3() throws Exception {
        try {
            if (Util.clickByDesc(mUiDevice, App_Handler)) {
                UiObject new_Search = new UiObject(new UiSelector().resourceId(DEVICE_SEARCH_APP_FROM_MAIN_MENU_resourceId));
                new_Search.setText(PLAY_music);
                Thread.sleep(2000);
                Util.clickByDesc(mUiDevice, PLAY_music);
                Thread.sleep(5000);
                Util.clickByDesc(mUiDevice, Navigation_drawer);
                Thread.sleep(2000);
                Util.clickByText(mUiDevice, Top_charts);
                Thread.sleep(2000);
                mUiDevice.pressBack();
                mUiDevice.pressHome();


            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("sending message Failed in loop " + i + "____________");
            mUiDevice.pressBack();
            mUiDevice.pressBack();
            mUiDevice.pressHome();
        }
    }
    public void mst_music4() throws Exception {
        try {
            if (Util.clickByDesc(mUiDevice, App_Handler)) {
                UiObject new_Search = new UiObject(new UiSelector().resourceId(DEVICE_SEARCH_APP_FROM_MAIN_MENU_resourceId));
                new_Search.setText(PLAY_music);
                Thread.sleep(2000);
                Util.clickByDesc(mUiDevice, PLAY_music);
                Thread.sleep(5000);
                Util.clickByDesc(mUiDevice, Navigation_drawer);
                Thread.sleep(2000);
                Util.clickByText(mUiDevice, New_releases);
                Thread.sleep(2000);
                mUiDevice.pressBack();
                mUiDevice.pressHome();


            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("sending message Failed in loop " + i + "____________");
            mUiDevice.pressBack();
            mUiDevice.pressBack();
            mUiDevice.pressHome();
        }
    }
}
