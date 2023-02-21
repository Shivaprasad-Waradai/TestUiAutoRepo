package com.example.myapplicationtestjunit;

import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;
import android.util.Log;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


/*Test ID: MTBF Adding_Alarms_And_Deleting
 Description: Adding 3 Alarms and Deleting
    Test Steps:
          1. Back to idle.
          2. Enter clock app.
          3. Click Alarm button.
          4. Click Create New Alarm.
          5. Set Alarm times.
          6. Click ok Button.
          7.Repeating 2 Times
          8.Deleting 3 Alarm
         */

public class Mtbf_Alarms_Adding_And_Deleting  {
    private static final String TAG = "Adding Deleting Alarms";
    private UiDevice mUiDevice;
    private Utility_Functions uf;
    private Device_Veriables dv;
    int i;
    @Before
    public void setUp() throws Exception {
        mUiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        if (null == mUiDevice) {
            Log.e(TAG, "can't find the UiDevice");
            return;
        }

        mUiDevice.pressHome();

        uf = new Utility_Functions(mUiDevice);
        dv = new Device_Veriables(mUiDevice);
    }


    @Test
    public void Alarams() throws Exception {


        for (i = 1; i <= dv.Mtbf_Alarms; i++) {
            Alaram_Adding();
            Alaram_Deleting();

        }

    }

    public void Alaram_Adding() {

        try {
            mUiDevice.pressBack();
            mUiDevice.pressHome();

            uf.ufMenu_srch_App("Clock");    //Calling from Utility_Functions
            uf.Alarams_Added();            //Calling Method from Utility Function
            mUiDevice.pressBack();
            mUiDevice.pressHome();
            System.out.println("navigate_main_tabs method Pass in Loop" + i + "____________");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("navigate_main_tabs method Failed in loop " + i + "____________");
            mUiDevice.pressHome();
        }

    }

    public void Alaram_Deleting()  {

        try {

            uf.ufMenu_srch_App("Clock");    //Calling from Utility_Functions
            uf.Alarams_Deleted();          //Calling Method from Utility Function

            System.out.println("navigate_main_tabs method Pass in Loop" + i + "____________");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("navigate_main_tabs method Failed in loop " + i + "____________");
            mUiDevice.pressHome();
        }

    }
}