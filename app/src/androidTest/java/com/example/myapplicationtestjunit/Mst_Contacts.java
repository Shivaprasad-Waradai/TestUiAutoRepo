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
public class Mst_Contacts extends  Utility_Functions {

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
        for(i=1;i<=Mst_Contacts;i++) {
            mst_Contacts();
            System.out.println(" **********************MST_Contacts " + i);
        }}

    public void mst_Contacts() throws Exception{

        try {

            //Open the Contacts and return to the Home Screen
            //************************************************************

            device.pressBack();
            device.pressHome();

            ufMenu_srch_App("Contacts");

            device.pressBack();
            device.pressHome();

            Thread.sleep(3000);

            //*********************************************************

            //Open and go to create icon
            //************************************************************
            ufMenu_srch_App("Contacts");
            System.out.println("Opened the Contact Application");
            UiObject create_new_contact = new UiObject(new UiSelector()
                    .description("Create new contact"));
            create_new_contact.click();

            device.pressBack();
            device.pressBack();
            device.pressHome();
            System.out.println("Returned To the Home Screen");

            Thread.sleep(3000);
            //*********************************************************

            //open and go to options
            //**************************************************************

            device.pressBack();
            device.pressHome();

            ufMenu_srch_App("Contacts");
            System.out.println("Opened the Contact Application");

            UiObject open_navigation_drawer = new UiObject(new UiSelector()
                    .description("Open navigation drawer"));
            open_navigation_drawer.click();


            UiObject create_label = new UiObject(new UiSelector()
                    .className("android.widget.TextView").text("Create label"));
            create_label.click();
            System.out.println("Opened the More Options > Create Label");
            UiObject Popup_Cancle = new UiObject(new UiSelector()
                    .resourceId("android:id/button2"));
            Popup_Cancle.click();
            System.out.println("Navigated to More Options>");


            device.pressBack();
            device.pressHome();

            System.out.println("Returned to Home Screen");

            Thread.sleep(3000);

            device.pressBack();
            device.pressHome();

            ufMenu_srch_App("Contacts");
            System.out.println("Opened the Contact Application");

            open_navigation_drawer.click();

            UiObject contact_Settings = new UiObject(new UiSelector()
                    .className("android.widget.TextView").text("Settings"));
            contact_Settings.click();
            System.out.println("Opened the More Options > Settings ");
            device.pressBack();
            device.pressHome();

            System.out.println("Returned To Home Screen");
            Thread.sleep(3000);

            device.pressBack();
            device.pressHome();

            ufMenu_srch_App("Contacts");
            System.out.println("Opened the Contact Application");

            open_navigation_drawer.click();

            UiObject contact_help_feedback = new UiObject(new UiSelector()
                    .className("android.widget.TextView").text("Help & feedback"));
            contact_help_feedback.click();
            System.out.println("Opened More Option Help Feedback");

            device.pressBack();
            device.pressHome();
            System.out.println("Returned to home Screen");
            Thread.sleep(3000);

            System.out.println("**********************mst_Contacts PASSED********************");
        }catch (Exception e){

            //device.takeScreenshot( );
            e.printStackTrace();
            System.out.println("**********************mst_Contacts FAILED********************");
            device.pressBack();
            device.pressHome();
        }


    }

}