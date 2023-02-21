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
public class Mst_Phone extends Utility_Functions {

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

        for(i=1;i<=Mst_Phone;i++) {
            mst_Phone();
            System.out.println(" **********************MST_Phone " + i);
        }

    }

    public void mst_Phone() throws Exception{

        try {
//            UiObject menu_Mark = new UiObject(new UiSelector()
//                    .resourceId("com.android.launcher3_demo:id/all_apps_handle"));
//            menu_Mark.click();
//
//            UiObject search_input = new UiObject(new UiSelector()
//                    .resourceId("com.android.launcher3_demo:id/search_box_input"));
//            search_input.setText("Phone");
//
//            UiObject wedget_icon = new UiObject(new UiSelector()
//                    .className("android.widget.TextView").index(1));
//            wedget_icon.click();

            device.pressBack();
            device.pressHome();

            ufMenu_srch_App("Phone");

            device.pressBack();
            device.pressHome();

            //*****************************************************

//            menu_Mark.click();
//            search_input.setText("Phone");
//            wedget_icon.click();

            ufMenu_srch_App("Phone");

            UiObject Call_History_Tab = new UiObject(new UiSelector()
                    .description("Call history tab."));
            Call_History_Tab.click();
            UiObject Contact_Tab = new UiObject(new UiSelector()
                    .description("Contacts tab."));
            Contact_Tab.click();
            UiObject Speed_dial_Tab = new UiObject(new UiSelector()
                    .description("Speed dial tab."));
            Speed_dial_Tab.click();

            device.pressBack();
            device.pressHome();

            //*****************************************************
//            menu_Mark.click();
//            search_input.setText("Phone");
//            wedget_icon.click();

            ufMenu_srch_App("Phone");

            UiObject More_Option = new UiObject(new UiSelector()
                    .description("More options"));
            More_Option.click();

            UiObject Call_History_opt = new UiObject(new UiSelector()
                    .className("android.widget.LinearLayout").index(0));
            Call_History_opt.click();
            UiObject Navigate_Up = new UiObject(new UiSelector()
                    .description("Navigate up"));
            Navigate_Up.click();

            device.pressBack();
            device.pressHome();


            //*****************************************************


//            menu_Mark.click();
//            search_input.setText("Phone");
//            wedget_icon.click();

            ufMenu_srch_App("Phone");


            More_Option.click();

            UiObject Clear_Frequents_opt = new UiObject(new UiSelector()
                    .className("android.widget.LinearLayout").index(1));
            Clear_Frequents_opt.click();

            UiObject Popup_Cancle = new UiObject(new UiSelector()
                    .resourceId("android:id/button2"));
            if(Popup_Cancle.exists()) {
                Popup_Cancle.click();
            }
            device.pressBack();
            device.pressHome();


            //*****************************************************


//            menu_Mark.click();
//            search_input.setText("Phone");
//            wedget_icon.click();

            ufMenu_srch_App("Phone");

            More_Option.click();

            UiObject Settings_opt = new UiObject(new UiSelector()
                    .className("android.widget.LinearLayout").index(2));
            Settings_opt.click();

            Navigate_Up.click();

            device.pressBack();
            device.pressHome();


            //*****************************************************


//            menu_Mark.click();
//            search_input.setText("Phone");
//            wedget_icon.click();

            ufMenu_srch_App("Phone");

            More_Option.click();

            Settings_opt.click();

            UiObject sett_Disp_Option = new UiObject(new UiSelector()
                    .className("android.widget.LinearLayout").index(0));
            sett_Disp_Option.click();

            device.pressBack();

            Thread.sleep(2000);

            UiObject sett_Sound_Vib = new UiObject(new UiSelector()
                    .className("android.widget.LinearLayout").index(1));
            sett_Sound_Vib.click();

            device.pressBack();

            Thread.sleep(2000);


            UiObject sett_Quik_Resp = new UiObject(new UiSelector()
                    .className("android.widget.LinearLayout").index(2));
            sett_Quik_Resp.click();

            device.pressBack();

            Thread.sleep(2000);


            UiObject sett_Callin_Acc = new UiObject(new UiSelector()
                    .className("android.widget.LinearLayout").index(3));
            sett_Callin_Acc.click();

            device.pressBack();

            Thread.sleep(2000);


            UiObject sett_Call_Blockin = new UiObject(new UiSelector()
                    .className("android.widget.LinearLayout").index(4));
            sett_Call_Blockin.click();

            device.pressBack();

            Thread.sleep(2000);


            UiObject sett_Voice_Mail = new UiObject(new UiSelector()
                    .className("android.widget.LinearLayout").index(5));
            sett_Voice_Mail.click();

            device.pressBack();

            Thread.sleep(2000);


            UiObject sett_Access = new UiObject(new UiSelector()
                    .className("android.widget.LinearLayout").index(6));
            sett_Access.click();

            device.pressBack();

            Thread.sleep(2000);


            UiObject sett_About = new UiObject(new UiSelector()
                    .className("android.widget.LinearLayout").index(7));
            sett_About.click();

            device.pressBack();

            Thread.sleep(2000);


//        UiObject sett_Sound_Vib = new UiObject(new UiSelector()
//                .className("android.widget.LinearLayout").index(1));
//        sett_Sound_Vib.click();
//
//
//
//        UiObject sett_Sound_Vib = new UiObject(new UiSelector()
//                .className("android.widget.LinearLayout").index(2));
//        sett_Sound_Vib.click();


            //Navigate_Up.click();


            device.pressBack();
            device.pressHome();
            System.out.println("**********************mst_Phone PASSED********************");

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("**********************mst_Phone FAILED********************");

            device.pressBack();
            device.pressHome();
        }












    }
}