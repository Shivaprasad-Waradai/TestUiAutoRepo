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
public class Mtbf_Capture_A_Photo extends Utility_Functions {
    private UiDevice device;

    @Before
    public void setUp() throws Exception {

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        device.pressHome();

    }

    @Test
    public void mst_Operations() throws Exception {

        int i;
        for (i = 1; i <= Mtbf_Capture_A_Photo; i++) {
            Mtbf_Capture_A_Photo();
        }


    }

    public void Mtbf_Capture_A_Photo() throws Exception {
        try {

            device.pressBack();
            device.pressHome();

            ufMenu_srch_App("Camera");
            System.out.println("**********************Camera app launched successfully********************");

            UiObject Shutter_Button = new UiObject(new UiSelector()
                    .description(CAMERA_SHUTTER_BUTTON_Content_desc));

            Thread.sleep(8000);
            Shutter_Button.click();
            Thread.sleep(5000);

            device.pressBack();
            device.pressBack();
            device.pressHome();
            System.out.println("**********************mst_Camera PASSED********************");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("**********************mst_Camera FAILED********************");
            device.pressBack();
            device.pressHome();
        }
    }
}