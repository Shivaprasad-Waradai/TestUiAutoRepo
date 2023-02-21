package com.example.myapplicationtestjunit;

import android.content.Context;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;
import android.util.Log;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Mst_Clock extends Utility_Functions{

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
        for(i=1;i<=Mst_Clock;i++) {
            mst_Clock();
            System.out.println(" **********************MST_Clock " + i);
        }
    }


    public void mst_Clock() throws Exception{
        try{

            //mst_Clock Method for performing MST TC on Clock App
            //Opening the Clock App and returning the home Screen
            //****************************************************************
            device.wakeUp();
            device.pressBack();
            device.pressHome();

            ufMenu_srch_App("Clock");

            device.pressBack();
            device.pressHome();
            //*****************************************************************


            ufMenu_srch_App("Clock");


            UiObject tab_Clock = new UiObject(new UiSelector()
                    .className(CLOCK_MAIN_TABS_className).index(1));
            tab_Clock.click();
            System.out.println("Clicked on Clock Tab");


            device.pressBack();
            device.pressHome();
            ufMenu_srch_App("Clock");

            UiObject tab_Alarm = new UiObject(new UiSelector()
                    .className(CLOCK_MAIN_TABS_className).index(0));
            tab_Alarm.click();
            System.out.println("Clicked on Alarm Tab");

            device.pressBack();
            device.pressHome();
            ufMenu_srch_App("Clock");

            UiObject tab_Timer = new UiObject(new UiSelector()
                    .className(CLOCK_MAIN_TABS_className).index(2));
            tab_Timer.click();
            System.out.println("Clicked on Timer Tab");

            device.pressBack();
            device.pressHome();
            ufMenu_srch_App("Clock");

            UiObject tab_Stopwatch = new UiObject(new UiSelector()
                    .className(CLOCK_MAIN_TABS_className).index(3));
            tab_Stopwatch.click();
            System.out.println("Clicked on Stop Watch Tab");

            device.pressBack();
            device.pressHome();
            ufMenu_srch_App("Clock");

            UiObject tab_More_Opt = new UiObject(new UiSelector()
                    .className(CLOCK_TAB_MORE_OPT_className).description(CLOCK_MORE_OPT_contentDescription));
            tab_More_Opt.click();
            UiObject more_Opt_ScreenSaver = new UiObject(new UiSelector()
                    .className(CLOCK_MORE_OPT_DROPDOWN_className).index(0));
            more_Opt_ScreenSaver.click();
            System.out.println("Clicked on Screen Saver Option");

            Thread.sleep(2000);
            device.pressBack();
            //device.pressBack();


            tab_More_Opt.click();
            UiObject more_Opt_Settings = new UiObject(new UiSelector()
                    .className(CLOCK_MORE_OPT_DROPDOWN_className).index(1));
            more_Opt_Settings.click();
            System.out.println("Clicked on Setting Option");
            device.pressBack();


            tab_More_Opt.click();
            UiObject more_Opt_Send_Feedback = new UiObject(new UiSelector()
                    .className(CLOCK_MORE_OPT_DROPDOWN_className).index(2));
            more_Opt_Send_Feedback.click();
            System.out.println("Clicked on Send Feedback Option");
            device.pressBack();
            Thread.sleep(2000);
            device.pressBack();


            tab_More_Opt.click();
            UiObject more_Opt_Help = new UiObject(new UiSelector()
                    .className(CLOCK_MORE_OPT_DROPDOWN_className).index(3));
            more_Opt_Help.click();
            System.out.println("Clicked on Help Option");
            device.pressBack();
            device.pressHome();


            System.out.println("**********************mst_Clock PASSED********************");

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("**********************mst_Clock FAILED********************");
        }



    }

}


