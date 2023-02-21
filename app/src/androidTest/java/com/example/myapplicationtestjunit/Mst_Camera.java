package com.example.myapplicationtestjunit;

import static org.junit.Assert.assertEquals;

import android.content.Context;
import android.content.Intent;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;
import android.support.test.uiautomator.Until;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class Mst_Camera extends  Utility_Functions{
    private UiDevice device;

    @Before
    public void setUp() throws Exception {

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        device.pressHome();

    }
    @Test
    public void mst_Operations() throws Exception {
        // Context of the app under test.

        int i;
        for(i=1;i<=Mst_Camera;i++){
            mst_Camera();
        }


    }

    public void mst_Camera() throws Exception {
        try {

            device.pressBack();
            device.pressHome();

            ufMenu_srch_App("Camera");

            UiObject settings_cam = new UiObject(new UiSelector()
                    .description("More settings controls"));
            settings_cam.click();
            device.pressBack();
            device.pressHome();


            ufMenu_srch_App("Camera");

            settings_cam.click();




            UiObject common_Settings_tab = new UiObject(new UiSelector()
                    .description("android.widget.ImageView").index(0));
            common_Settings_tab.click();

            Thread.sleep(2000);

            UiObject camera_Settings_tab = new UiObject(new UiSelector()
                    .resourceId("android.widget.ImageView").index(1));
            camera_Settings_tab.click();
            Thread.sleep(2000);

            UiObject video_Settings_tab = new UiObject(new UiSelector()
                    .resourceId("android.widget.ImageView").index(2));
            video_Settings_tab.click();
            Thread.sleep(2000);

            device.pressBack();
            device.pressHome();
            System.out.println("**********************mst_Camera PASSED********************");

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("**********************mst_Camera FAILED********************");
            device.pressBack();
            device.pressHome();
        }


    }
}