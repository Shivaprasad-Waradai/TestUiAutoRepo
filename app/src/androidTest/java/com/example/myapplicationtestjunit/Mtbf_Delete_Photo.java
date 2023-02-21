package com.example.myapplicationtestjunit;

import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Test;

public class Mtbf_Delete_Photo extends Utility_Functions {

    private UiDevice device;

    @Before
    public void setUp() throws Exception {

        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        device.pressHome();

    }

    @Test
    public void mst_Operations() throws Exception {

        int i;
        for (i = 1; i <= Mtbf_Delete_Photo; i++) {
            Mtbf_Delete_Photo();
        }


    }

    private void Mtbf_Delete_Photo() throws Exception {
        try {

            device.pressBack();
            device.pressHome();

            ufMenu_srch_App("Photos");
            System.out.println("**********************Photos app launched successfully********************");

//            UiObject Backup_ON_Button = new UiObject(new UiSelector()
//                    .text(PHOTO_BACKUP_ON_BUTTON_Resource_Id));
//            UiObject Backup_Done_Button = new UiObject(new UiSelector()
//                    .text(PHOTO_BACKUP_DONE_BUTTON_Text));
//            UiObject Backup_Keep_Off_Button = new UiObject(new UiSelector()
//                    .text(PHOTO_KEEP_BACKUP_OFF_BUTTON_Text));
//
//            if (Backup_ON_Button.exists())
//            {
//                Backup_ON_Button.click();
//                Thread.sleep(2000);
//                Backup_Done_Button.click();
//                Thread.sleep(2000);
//                Backup_Keep_Off_Button.click();
//            }else {

            Thread.sleep(10000);

            UiObject First_Image = new UiObject(new UiSelector()
                    .className(PHOTO_FIRST_IMAGE_Classname).index(1));
            UiObject Delete_Button = new UiObject(new UiSelector()
                    .descriptionContains(PHOTO_DELETE_IMAGE_Disc));
            UiObject Move_To_Bin = new UiObject(new UiSelector()
                    .text(PHOTO_MOVE_TO_BIN_Text));

            Thread.sleep(5000);
            First_Image.click();
            Thread.sleep(5000);
            Delete_Button.click();
            Thread.sleep(2000);
            Move_To_Bin.click();
            Thread.sleep(2000);

            device.pressBack();
            device.pressBack();
            device.pressHome();
            System.out.println("**********************Mtbf_Delete_Photo PASSED********************");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("**********************Mtbf_Delete_Photo FAILED********************");
            device.pressHome();
        }


    }
}