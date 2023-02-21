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

/*Test ID: MTBF Browser_Navigating_To_Webpage
 Description: Browser_Navigating_To_Webpage
    Test Steps:
          1. Enter Setting.
          2. Select Sim1.
          3. Enter chrome app.
          4. Browse one Website.
          5.Back to idle Stage.
          6.Enter Setting.
          7.Select Sim2.
          8.Enter Chrome app.
          9.Browse one website.
          10.Back to idle stage.

         */

/**public class Mtbf_Browser_Navigating_To_Webpage  {
    private static final String TAG = "Naviate to Webpage";
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
    public void browser() throws Exception {


        for (i = 0; i <= dv.Mtbf_Browser_Navigating_To_Webpage_loop; i++) {
            Apps_Notifications();
        }
    }
    private void Apps_Notifications()  {

        try {
            mUiDevice.pressBack();
            mUiDevice.pressHome();
            uf.ufMenu_srch_App("Setting");
            uf.Sim_Selection();

            mUiDevice.pressBack();
            mUiDevice.pressHome();
            uf.ufMenu_srch_App("Chrome");
            UiObject Accept_Option = new UiObject(new UiSelector()
                    .resourceId("com.android.chrome:id/terms_accept"));  //*[@resource-id='com.android.chrome:id/positive_button']

            UiObject Continue_Option = new UiObject(new UiSelector()
                    .resourceId(dv.CONTINUE_AND_GOT_IT_resourceId));

            UiObject More_Option = new UiObject(new UiSelector()
                    .resourceId("com.android.chrome:id/more_button"));

            UiObject Select_GotIt = new UiObject(new UiSelector()
                    .resourceId(dv.CONTINUE_AND_GOT_IT_resourceId));

            if(Accept_Option.exists())
            {
                Accept_Option.click();
                Continue_Option.click();
                More_Option.click();
                Select_GotIt.click();
            }else {

                Thread.sleep(2000);
                UiObject Opening_Google_Page = new UiObject(new UiSelector()
                        .resourceId("com.android.chrome:id/search_box")); //Google search
                Opening_Google_Page.click();
                UiObject Search_url = new UiObject(new UiSelector()
                        .resourceId("com.android.chrome:id/url_bar")); //Google search
                Search_url.setText("Google");

                System.out.println("Google Page Opened");
                mUiDevice.pressBack();
                mUiDevice.pressHome();
                uf.ufMenu_srch_App("Setting");
                uf.Sim2_Selection();
                mUiDevice.pressBack();
                mUiDevice.pressHome();
                uf.ufMenu_srch_App("Chrome");
                Thread.sleep(2000);
                Opening_Google_Page.click();
                Search_url.setText("Google");
                mUiDevice.pressBack();
                mUiDevice.pressHome();


                System.out.println("navigate_main_tabs method Pass in Loop" + i + "____________");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("navigate_main_tabs method Failed in loop " + i + "____________");
            mUiDevice.pressHome();
        }

    }
}**/