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
public class Mst_File extends Utility_Functions {

    private UiDevice device;

    @Before
    public void setUp() throws Exception {

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        device.pressHome();

    }
    @Test
    public void mst_Operations() throws Exception {
        // Context of the app under test.


        for (int i = 1; i <= Mst_File; i++) {
            mst_Clock();
            System.out.println(" **********************MST_File " + i);
        }

    }

    public void mst_Clock () throws Exception {

        try {


            //Open application and return to Home Screen
            device.pressBack();
            device.pressHome();

            ufMenu_srch_App("File");
            System.out.println("Opened File App");
            device.pressBack();
            device.pressHome();
            System.out.println("Returned to Home Screen");

            //*********************************************************

            ufMenu_srch_App("File");
            System.out.println("Opened File App");
            UiObject more_Opt = new UiObject(new UiSelector()
                    .className("android.widget.ImageButton").index(0).description("Show roots"));


            UiObject more_Opt_Image = new UiObject(new UiSelector()
                    .className("android.widget.LinearLayout").index(0));
            more_Opt_Image.click();
            System.out.println("Clicked On More Options and navigating to all options");


            UiObject Camera_folder = new UiObject(new UiSelector()
                    .className("android.widget.LinearLayout").index(0));
            Camera_folder.click();

            device.pressBack();
            device.pressHome();
            System.out.println("Clicked on More Option and returend to Home Screen");

            ufMenu_srch_App("File");
            System.out.println("Opened File App");
            //more_Opt.click();
            UiObject more_Opt_Videos = new UiObject(new UiSelector()
                    .className("android.widget.LinearLayout").index(1));
            more_Opt_Videos.click();
            Camera_folder.click();

            device.pressBack();
            device.pressHome();
            System.out.println("Clicked on More Option and returend to Home Screen");

            ufMenu_srch_App("File");


            //more_Opt.click();
            UiObject more_Opt_Audio = new UiObject(new UiSelector()
                    .className("android.widget.LinearLayout").index(2));
            more_Opt_Audio.click();


            device.pressBack();
            device.pressHome();
            System.out.println("Clicked on More Option > Audio and returend to Home Screen");


            ufMenu_srch_App("File");
            //more_Opt.click();
            UiObject more_Opt_Recent = new UiObject(new UiSelector()
                    .className("android.widget.LinearLayout").index(3));
            more_Opt_Recent.click();

            device.pressBack();
            device.pressHome();
            System.out.println("Clicked on More Option > Recent Option and returend to Home Screen");

            ufMenu_srch_App("File");


            //more_Opt.click();
            UiObject more_Opt_Downloads = new UiObject(new UiSelector()
                    .className("android.widget.LinearLayout").index(5));
            more_Opt_Downloads.click();

            device.pressBack();
            device.pressHome();
            System.out.println("Clicked on More Option > Downloads and returend to Home Screen");
            //***********************************************************

            ufMenu_srch_App("File");

            more_Opt_Image.click();
            //device.pressBack();


            more_Opt.click();
            more_Opt_Videos.click();


            //device.pressBack();

            more_Opt.click();
            more_Opt_Audio.click();


            more_Opt.click();
            more_Opt_Recent.click();
            device.pressBack();

            device.pressBack();
            device.pressHome();
            System.out.println("**********************mst_Phone PASSED********************");

        } catch (Exception e) {

            e.printStackTrace();
            System.out.println("**********************mst_Phone FAILED********************");
            device.pressBack();
            device.pressHome();


        }
    }

}