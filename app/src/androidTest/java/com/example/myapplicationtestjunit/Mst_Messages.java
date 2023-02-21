package com.example.myapplicationtestjunit;

import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

public class Mst_Messages extends Utility_Functions {

    private UiDevice device;

    @Before
    public void setUp() throws Exception {

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        device.pressHome();

    }
    @Test
    public void mst_Operations() throws Exception {
        // Context of the app under test.
        for (int i = 1; i <= Mst_Message; i++) {
            mst_Messages();
            System.out.println(" **********************MST_Messages " + i);
        }
    }



    public void mst_Messages() throws Exception{
        try {
            // MST Messages Navagating to Messages App
            //****************************************************
            device.pressBack();
            device.pressHome();

            ufMenu_srch_App("Messages");

            device.pressBack();
            device.pressHome();
            System.out.println("Opened Massages App and returend to Home Screen");
            //****************************************************


            ufMenu_srch_App("Messages");

            UiObject msg_Create_New_Msg = new UiObject(new UiSelector()
                    .className(MSG_MORE_OPT_className).index(1));
            msg_Create_New_Msg.click();

            device.pressBack();


            UiObject msg_More_Opt = new UiObject(new UiSelector()
                    .className(MSG_MORE_OPT_className).description(MSG_MORE_OPT_contentDescription));
            msg_More_Opt.click();


            UiObject msg_More_Opt_Settings = new UiObject(new UiSelector()
                    .className(MSG_MORE_OPT_LIST_className).index(2));
            msg_More_Opt_Settings.click();
            device.pressBack();
            msg_More_Opt.click();

            UiObject msg_More_Opt_Archived = new UiObject(new UiSelector()
                    .className(MSG_MORE_OPT_LIST_className).index(0));
            msg_More_Opt_Archived.click();
            device.pressBack();
            msg_More_Opt.click();


            UiObject msg_More_Opt_Blocked_Contacts = new UiObject(new UiSelector()
                    .className(MSG_MORE_OPT_LIST_className).index(1));
            msg_More_Opt_Blocked_Contacts.click();
            device.pressBack();
            msg_More_Opt.click();


            UiObject msg_More_Opt_Help = new UiObject(new UiSelector()
                    .className(MSG_MORE_OPT_LIST_className).index(3));
            msg_More_Opt_Help.click();
            device.pressBack();
            device.pressHome();


            System.out.println("************************* Application found & PASSED **************************");

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("************************* Application Not found & FAILED **************************");
            device.pressBack();
            device.pressHome();

        }
    }
}
