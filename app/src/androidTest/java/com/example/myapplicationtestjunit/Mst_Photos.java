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
public class Mst_Photos extends Utility_Functions{

    private UiDevice device;

    @Before
    public void setUp() throws Exception {

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        device.pressHome();
    }


    @Test
    public void mst_Operations() throws Exception {



        //Loop to run the test multiple times
        int i;
        for(i=1;i<=Mst_Gallery;i++) {
            mst_Photos();
            System.out.println(" **********************MST_Photos " + i);
        }

    }

    //mst_Photos is the method for perform MST TC on the Photos application
    public void mst_Photos() throws Exception {

        try {
            //To Open the Photos Application and return back to home Screen
            //*************************************************************
            device.pressBack();
            device.pressHome();

            ufMenu_srch_App("Photos");

            device.pressBack();
            device.pressHome();
            //**************************************************************

            //To Open the Photos Application and Navigate to through the appiaction
            // and return back to Home Screen
            //**************************************************************
            ufMenu_srch_App("Photos");
            System.out.println("Opened Photos Application");
            Thread.sleep(2000);
            UiObject More_Options = new UiObject(new UiSelector()
                    .description("Show navigation drawer"));
            More_Options.click();
            System.out.println("Clicked on More Option");

            UiObject Shared = new UiObject(new UiSelector()
                    .resourceId(PHOTO_NAVIGATION_DRAWER_LIST_TITEL_resourceId).text("Shared"));
            Shared.click();
            System.out.println("Clicked on Shared");

            UiObject Navigate_UP = new UiObject(new UiSelector()
                    .description("Navigate up"));
            Navigate_UP.click();
            System.out.println("Clicked on Navigate Up");

            More_Options.click();
            System.out.println("Clicked on More Options");

            UiObject Device_Folder = new UiObject(new UiSelector()
                    .resourceId(PHOTO_NAVIGATION_DRAWER_LIST_TITEL_resourceId).text("Device folder"));
            Device_Folder.click();
            System.out.println("Clicked on Device Folders");

            Thread.sleep(2000);
            Navigate_UP.click();
            System.out.println("Clicked on Navigate Up");

            More_Options.click();
            UiObject Bin = new UiObject(new UiSelector()
                    .resourceId(PHOTO_NAVIGATION_DRAWER_LIST_TITEL_resourceId).text("Bin"));
            Bin.click();
            System.out.println("Clicked on Bin Folder");

            //**********************************************************

            device.pressBack();
            device.pressHome();
            System.out.println("**********************mst_Photos PASSED********************");

        }catch (Exception e){

            e.printStackTrace();
            System.out.println("**********************mst_Photos FAILED********************");
            device.pressBack();
            device.pressHome();


        }


    }


}