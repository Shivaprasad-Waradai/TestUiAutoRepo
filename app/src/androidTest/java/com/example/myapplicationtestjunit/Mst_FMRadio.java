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
public class Mst_FMRadio extends Utility_Functions{

    private UiDevice device;

    @Before
    public void setUp() throws Exception {

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        device.pressHome();

    }
    @Test
    public void mst_Operations() throws Exception {
        // Context of the app under test.
        for (int i = 1; i <= Mst_FMRadio; i++) {
            mst_FMRadio();
            System.out.println(" **********************MST_FMRadio " + i);
        }
    }

    public void mst_FMRadio()throws Exception{
        try{

            device.pressBack();
            device.pressHome();

            ufMenu_srch_App("FM Radio");

            device.pressBack();
            device.pressHome();
            System.out.println("Opened FM Radio and returend to Home Screen");

            //*****************************************************
            ufMenu_srch_App("FM Radio");

            UiObject fm_Station_List = new UiObject(new UiSelector()
                    .resourceId(FM_STATION_LIST_resourceId));
            fm_Station_List.click();


            device.pressBack();

            UiObject fm_PrevStation = new UiObject(new UiSelector()
                    .resourceId(FM_PREVIOUS_STATION_resourceId));
            fm_PrevStation.click();

            UiObject fm_NextStation = new UiObject(new UiSelector()
                    .resourceId(FM_NEXT_STATION_resourceId));
            fm_NextStation.click();

            UiObject fm_AddToFevorite = new UiObject(new UiSelector()
                    .resourceId(FM_ADD_TO_FAVORITE_resourceId));
            //fm_AddToFevorite.click();

            UiObject fm_Btn_Increase = new UiObject(new UiSelector()
                    .resourceId(FM_BTN_INCREASE_resourceId));
            fm_Btn_Increase.click();

            UiObject fm_Btn_Decrease = new UiObject(new UiSelector()
                    .resourceId(FM_BTN_DECREASE_resourceId));
            fm_Btn_Decrease.click();

            UiObject fm_Btn_Play = new UiObject(new UiSelector()
                    .resourceId(FM_PLAY_BTN_resourceId));
            fm_Station_List.click();
            Thread.sleep(3000);
            System.out.println("Opened FM Radio > navigated to all Options and returend to Home Screen");
            //fm_Station_List.click();

            device.pressBack();
            device.pressHome();
            System.out.println("**********************mst_Phone PASSED********************");

        }catch (Exception e){
            e.printStackTrace();
            device.pressBack();
            device.pressHome();
            System.out.println("**********************mst_FMRadio FAILED********************");

        }

    }

}
