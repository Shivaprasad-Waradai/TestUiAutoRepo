package com.example.myapplicationtestjunit;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Mst_Calculator extends Utility_Functions{
    private UiDevice device;


    @Before
    public void setUp() throws Exception {

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        device.pressHome();

    }
    @Test
    public void mst_Operations() throws Exception {
        // Context of the app under test.
    /// testing

        //Loops for run the programm
        int i;
        for(i=1;i<=Mst_Calculator;i++){
            mst_Calculator();
            System.out.println(" **********************MST_Calculator " + i);
        }

    }

    public void mst_Calculator() throws Exception{
        // Menu Navigation Stability test on Calculator
        try {

            UiObject more_Opt = new UiObject(new UiSelector()
                    .description("More options"));
            UiObject history = new UiObject(new UiSelector()
                    .className("android.widget.LinearLayout").index(0));
            UiObject navigate_Up = new UiObject(new UiSelector()
                    .description("Navigate up"));
            UiObject send_Feedback = new UiObject(new UiSelector()
                    .className("android.widget.LinearLayout").index(1));
            UiObject close = new UiObject(new UiSelector()
                    .description("Close"));
            UiObject help = new UiObject(new UiSelector()
                    .className("android.widget.LinearLayout").index(2));
            UiObject article0 = new UiObject(new UiSelector()
                    .resourceId("com.google.android.gms:id/gh_popular_article_0"));
            UiObject article1 = new UiObject(new UiSelector()
                    .resourceId("com.google.android.gms:id/gh_popular_article_1"));
            UiObject article2 = new UiObject(new UiSelector()
                    .resourceId("com.google.android.gms:id/gh_popular_article_2"));
            UiObject article3 = new UiObject(new UiSelector()
                    .resourceId("com.google.android.gms:id/gh_popular_article_3"));
            UiObject article4 = new UiObject(new UiSelector()
                    .resourceId("com.google.android.gms:id/gh_popular_article_4"));
            UiObject help_send_Feedback = new UiObject(new UiSelector()
                    .resourceId("com.google.android.gms:id/gh_contact_option_title"));


            //Opening the calculation App and returning to Home Screen
            //***********************************************************************
            device.pressBack();
            device.pressHome();

            ufMenu_srch_App("Calculator");
            System.out.println("Opened the Calculator App");

            device.pressBack();
            device.pressHome();
            System.out.println("Closed the Calculator App and returned to the Home screen");
            //************************************************************************

            //Go to History in Calculator and Navigate all menu
            ufMenu_srch_App("Calculator");
            System.out.println("Opened the Calculator App");

            more_Opt.click();
            Thread.sleep(1000);
            history.click();
            Thread.sleep(1000);
            more_Opt.click();
            Thread.sleep(1000);
            device.pressBack();
            Thread.sleep(1000);
            navigate_Up.click();
            Thread.sleep(1000);
            System.out.println("Go to History in Calculator and Navigate all menu");

            //Go to Send FeedBack and return to Main menu
            device.pressBack();
            device.pressHome();System.out.println("Returned to Home Screen");

            ufMenu_srch_App("Calculator");
            System.out.println("Opened the Calculator App");

            more_Opt.click();
            Thread.sleep(1000);
            send_Feedback.click();System.out.println("Go to Send FeedBack and return to Main menu");
            Thread.sleep(1000);
            navigate_Up.click();
            Thread.sleep(1000);


            // Go to Help in Calculator and Navigate to each Help option
            device.pressBack();
            device.pressHome();System.out.println("Returned to Home Screen");

            ufMenu_srch_App("Calculator");
            System.out.println("Opened the Calculator App");

            more_Opt.click();
            Thread.sleep(1000);
            help.click();
            Thread.sleep(1000);
            article0.click();
            device.pressBack();System.out.println("Go to Help in Calculator and Navigate to each Help option");


            device.pressBack();
            device.pressHome();

            ufMenu_srch_App("Calculator");
            System.out.println("Opened the Calculator App");


            more_Opt.click();
            Thread.sleep(1000);
            help.click();System.out.println("Opened the Help Option");
            Thread.sleep(1000);
            article1.click();
            device.pressBack();

            device.pressBack();
            device.pressHome();

            ufMenu_srch_App("Calculator");
            System.out.println("Opened the Calculator App");

            more_Opt.click();
            Thread.sleep(1000);
            help.click();System.out.println("Opened the Help Option");
            Thread.sleep(1000);
            article2.click();
            device.pressBack();

            device.pressBack();
            device.pressHome();

            ufMenu_srch_App("Calculator");
            System.out.println("Opened the Calculator App");

            more_Opt.click();
            Thread.sleep(1000);
            help.click();System.out.println("Opened the Help Option");
            Thread.sleep(1000);
            article3.click();
            device.pressBack();

            device.pressBack();
            device.pressHome();

            ufMenu_srch_App("Calculator");
            System.out.println("Opened the Calculator App");

            more_Opt.click();
            Thread.sleep(1000);
            help.click();System.out.println("Opened the Help Option");
            Thread.sleep(1000);
            article4.click();
            device.pressBack();


            device.pressBack();
            device.pressHome();

            ufMenu_srch_App("Calculator");
            System.out.println("Opened the Calculator App");

            more_Opt.click();
            Thread.sleep(1000);
            help.click();System.out.println("Opened the Help Option");
            Thread.sleep(1000);
            help_send_Feedback.click();
            navigate_Up.click();
            close.click();
            Thread.sleep(1000);


            // Numeric to Advance and return Back
            device.pressBack();
            device.pressHome();

            ufMenu_srch_App("Calculator");
            System.out.println("Opened the Calculator App");

            Thread.sleep(1000);
            UiObject Advanced_Pad = new UiObject(new UiSelector()
                    .resourceId("com.google.android.calculator:id/pad_advanced"));
            Advanced_Pad.click();

            UiObject Number_Pad = new UiObject(new UiSelector()
                    .resourceId("com.google.android.calculator:id/pad_numeric"));
            Number_Pad.click();

            device.pressBack();
            device.pressHome();

            //Go To Idle
            device.pressBack();
            Thread.sleep(1000);
            device.pressHome();
            Thread.sleep(1000);
            System.out.println("***************** mst_Calculator PASSED *****************");

        }catch (Exception e){

            e.printStackTrace();
            System.out.println("***************** mst_Calculator FAILED *****************");
            device.pressHome();
            String path = "D:\\";
            //device.takeScreenshot();
        }
    }//End of Method
}