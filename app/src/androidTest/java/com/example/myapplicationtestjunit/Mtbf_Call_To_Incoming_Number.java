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

/*Test ID: MTBF Call_To_Incoming_Number
 Description: Calling to incoming number
         Test Steps:
         1. Back to idle.
         2. Enter Phone app.
         3. Click Call history button.
         4. Select pre condition incoming number.
         5. call to that number.
         6. Wait for 8 second.
         7. Click end button.
         8.Back to idle stage
         */
public class Mtbf_Call_To_Incoming_Number {
    private static final String TAG = "Call to incoming number";
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
    public void Call_to_incoming_Number() throws Exception {


        for (i = 1; i <= dv.Mtbf_Call_To_Incoming_Number; i++) {
            Call_From_Incoming();
            Basic_Setup();
            Select_Two_G();
            Call_From_Incoming();
            Basic_Setup();
            Select_Three_G();
            Call_From_Incoming();
            Basic_Setup();
            Select_Four_G();
            Call_From_Incoming();
        }

    }

    private void Call_From_Incoming()  {

        try {
            mUiDevice.pressBack();
            mUiDevice.pressHome();

            uf.ufMenu_srch_App("Phone");    //Calling from Utility_Functions
            UiObject select_history = new UiObject(new UiSelector() //Selecting History Menu
                    .descriptionContains("Call history tab."));
            UiObject select_number = new UiObject(new UiSelector()    //Selecting Number
                    .className(dv.NETWORK_AND_INTERNET_OPTION_className).text(dv.INCOMING_NUMBER));
            UiObject call_details = new UiObject(new UiSelector()     // Clicking Call Details
                    .className(dv.NETWORK_AND_INTERNET_OPTION_className).text("Call details"));
            UiObject Verify_call = new UiObject(new UiSelector()        //Verifying Incoming Call
                    .className(dv.NETWORK_AND_INTERNET_OPTION_className).text("Incoming call"));
            UiObject call_to_incoming_number = new UiObject(new UiSelector()  //Calling to Incoming Number
                    .descriptionContains("Call"));
            UiObject call_end = new UiObject(new UiSelector()            //Call End
                    .resourceId("com.android.dialer:id/incall_end_call"));


            System.out.println("Menu_srch_App PASS ________");
            Thread.sleep(2000);
            select_history.click();
            Thread.sleep(2000);
            select_number.click();
            Thread.sleep(2000);
            call_details.click();
            Thread.sleep(2000);
            if (Verify_call.exists()) {
                System.out.println("Verified with incoming number ");
            } else {
                System.out.println("There is no incoming calls ");

            }
            call_to_incoming_number.click();
            Thread.sleep(5000);
            call_end.click();
            mUiDevice.pressBack();
            mUiDevice.pressHome();
            System.out.println("navigate_main_tabs method Pass in Loop" + i + "____________");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("navigate_main_tabs method Failed in loop " + i + "____________");
            mUiDevice.pressHome();
        }

    }

    private void Basic_Setup()  {

        try {


            mUiDevice.pressBack();
            mUiDevice.pressHome();

            uf.ufMenu_srch_App("Setting");//Calling from Utility_Functions
            uf.Network_Selection();
            System.out.println("navigate_main_tabs method Pass in Loop" + i + "____________");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("navigate_main_tabs method Failed in loop " + i + "____________");
            mUiDevice.pressHome();
        }

    }


    public void Select_Two_G()  {
        try {


            UiObject Selected = new UiObject(new UiSelector()
                    .resourceId(dv.SELECTING_NETWORK_OPTION_resourceId).text("2G"));  //Selecting 2G Option
            Thread.sleep(2000);
            Selected.click();
            mUiDevice.pressBack();
            mUiDevice.pressHome();
            System.out.println(" Selected 2G Network and saved  ________");


            UiObject ClearAll = new UiObject(new UiSelector() //Clearing Recent Apps
                    .resourceId(dv.CLEAR_ALL_resourceId));
            Thread.sleep(4000);
            mUiDevice.pressRecentApps();

            Thread.sleep(4000);
            if (ClearAll.exists()) {
                ClearAll.click();
            } else {

                for (int j = 0; j <= 2; j++) {
                    Thread.sleep(2000);
                    mUiDevice.swipe(400, 200, 400, 1170, 4);
                }

                ClearAll.click();
            }
            System.out.println("Clear Recent Apps method Pass in Loop");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("navigate_main_tabs method Failed in loop " + i + "____________");
            mUiDevice.pressHome();
        }

    }

    public void Select_Three_G()  {
        try {


            UiObject Selected = new UiObject(new UiSelector()
                    .resourceId(dv.SELECTING_NETWORK_OPTION_resourceId).text("3G"));    //Selecting 3G Option
            Thread.sleep(2000);
            Selected.click();
            System.out.println(" Selected 3G Network and saved  ________");
            mUiDevice.pressBack();
            mUiDevice.pressHome();
            UiObject ClearAll = new UiObject(new UiSelector()  //Clear Recent Apps
                    .resourceId(dv.CLEAR_ALL_resourceId));
            Thread.sleep(4000);
            mUiDevice.pressRecentApps();
            Thread.sleep(4000);
            if (ClearAll.exists()) {
                ClearAll.click();
            } else {

                for (int j = 0; j <= 2; j++) {
                    Thread.sleep(2000);
                    mUiDevice.swipe(400, 200, 400, 1170, 4);
                }

                ClearAll.click();
            }
            System.out.println("Clear_Recent_Apps method Pass in Loop");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("navigate_main_tabs method Failed in loop " + i + "____________");
            mUiDevice.pressHome();
        }

    }

    public void Select_Four_G()  {
        try {


            UiObject Selected = new UiObject(new UiSelector()
                    .resourceId(dv.SELECTING_NETWORK_OPTION_resourceId).text("4G (recommended)"));  //Selecting 4G Option
            Thread.sleep(2000);
            Selected.click();
            System.out.println(" Selected 4G Network and saved  ________");
            mUiDevice.pressBack();
            mUiDevice.pressHome();


            UiObject ClearAll = new UiObject(new UiSelector()   //Clearing Recent Apps
                    .resourceId(dv.CLEAR_ALL_resourceId));
            Thread.sleep(4000);
            mUiDevice.pressRecentApps();
            Thread.sleep(4000);
            if (ClearAll.exists()) {
                ClearAll.click();
            } else {

                for (int j = 0; j <= 2; j++) {
                    Thread.sleep(2000);
                    mUiDevice.swipe(400, 200, 400, 1170, 4);
                }

                ClearAll.click();
            }
            System.out.println("ufClear_Recent_Apps method Pass in Loop");

        } catch (Throwable e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("navigate_main_tabs method Failed in loop " + i +"____________");
            mUiDevice.pressHome();
        }
    }

}
