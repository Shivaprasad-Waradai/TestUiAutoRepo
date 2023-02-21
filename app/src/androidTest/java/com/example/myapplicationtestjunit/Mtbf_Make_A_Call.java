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

/*Test ID: MTBF Make_A_Call
        Description: Adding 1 contact and calling 2G,3G,4G.
        Test Steps:
        1. Back to idle.
        2. Enter Phone app.
        3. Click Contact  button.
        4. Click Create New Contact.
        5. Entering First Name and Phone number.
        6. Click Save Button.
        7. Back to idle.
        8.Enter settings.
        9.Select 2G network.
        10.Calling to saved number.
        11.Select 3G network.
        12.Calling to saved number.
        13.Select 4G network.
        14.Calling to saved number.
        15.Back to idle stage
        */
/**@RunWith(AndroidJUnit4.class)
public class Mtbf_Make_A_Call {
    private static final String TAG = "Make A Call";
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
    public void Calling_Functionality() throws Exception {
        for (i = 0; i <= dv.Mtbf_Make_A_Call; i++) {
            Save_Contact();
            Basic_Setup();
            Select_Two_G();
            Calling_Functions();
            Basic_Setup();
            Select_Three_G();
            Calling_Functions();
            Basic_Setup();
            Select_Four_G();
            Calling_Functions();
            Delete_Contact();
        }
    }

    private void Save_Contact()  {

        try {


            mUiDevice.pressBack();
            mUiDevice.pressHome();


            uf.ufMenu_srch_App("Phone");   //Calling from Utility_Functions


            uf.add_numbers("Test001", dv.SAVING_NUMBER);//Calling from Utility Function to Save Number
            System.out.println("Contact saved  ________");
            // mUiDevice.pressBack();
            // mUiDevice.pressHome();


            System.out.println("navigate_main_tabs method Pass in Loop" + i + "____________");
        }   catch (Exception e) {
            e.printStackTrace();

            System.out.println("navigate_main_tabs method Failed in loop " + i + "____________");
            mUiDevice.pressHome();
        }


    }

    private void Basic_Setup()  {
        try {

            mUiDevice.pressBack();
            mUiDevice.pressHome();

            uf.ufMenu_srch_App("Settings");    //Calling from Utility_Functions
            UiObject click_on_Network = new UiObject(new UiSelector()
                    .className(dv.NETWORK_AND_INTERNET_OPTION_className).text("Network & Internet")); //Inside Setting selecting Network Option
            UiObject Mobile_Networks = new UiObject(new UiSelector()
                    .className(dv.NETWORK_AND_INTERNET_OPTION_className).text("Mobile network")); //selecting Mobile Network
            UiObject Preferred_Network = new UiObject(new UiSelector()
                    .className(dv.NETWORK_AND_INTERNET_OPTION_className).text("Preferred network type"));//Selecting Preferred Network
            Thread.sleep(2000);
            click_on_Network.click();
            Thread.sleep(2000);
            Mobile_Networks.click();
            Thread.sleep(2000);
            Preferred_Network.click();
            System.out.println("preferred Network passed  ________");
        }   catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("navigate_main_tabs method Failed in loop " + i + "____________");
            mUiDevice.pressHome();
        }
    }

    public void Select_Two_G()  {
        try {


            UiObject Selected = new UiObject(new UiSelector()
                    .resourceId(dv.SELECTING_NETWORK_OPTION_resourceId).text("2G"));  //Selecting 2G Option
            Thread.sleep(2000);
            Selected.click();
            mUiDevice.pressBack();
            mUiDevice.pressHome();
            System.out.println(" Selected 2G Network and saved  ________");


            UiObject ClearAll = new UiObject(new UiSelector() //Clearing Recent Apps
                    .resourceId(dv.CLEAR_ALL_resourceId));
            Thread.sleep(4000);
            mUiDevice.pressRecentApps();

            Thread.sleep(4000);
            if (ClearAll.exists()) {
                ClearAll.click();
            } else {

                for (int j = 0; j <= 2; j++) {
                    Thread.sleep(2000);
                    mUiDevice.swipe(400, 200, 400, 1170, 4);
                }

                ClearAll.click();
            }
            System.out.println("Clear Recent Apps method Pass in Loop");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("navigate_main_tabs method Failed in loop " + i + "____________");
            mUiDevice.pressHome();
        }

    }

    private void Calling_Functions()  {

        try {
            mUiDevice.pressBack();
            mUiDevice.pressHome();

            uf.ufMenu_srch_App("Contacts");       //Calling from Utility_Functions
            UiObject search_option = new UiObject(new UiSelector()
                    .resourceId(dv.SEARCH_OPTION_IN_CONTACTS_resourceId));  //Selecting Search Option
            UiObject search_number = new UiObject(new UiSelector()
                    .resourceId(dv.SEARCH_NUMBER_resourceId));               //Searching Number
            UiObject select_number = new UiObject(new UiSelector()
                    .resourceId(dv.SELECT_NUMBER_resourceId).text("Test001")); //Selecting Searched Number

            UiObject calling1_button = new UiObject(new UiSelector()       //Calling Number
                    .resourceId(dv.CALLING_BUTTON_resourceId).index(0));
            UiObject call_end = new UiObject(new UiSelector()               //Call End
                    .resourceId(dv.CALL_END_BUTTON_resourceId));
            Thread.sleep(2000);
            search_option.click();
            Thread.sleep(2000);

            search_number.setText("Test001");
            Thread.sleep(2000);
            select_number.click();
            Thread.sleep(2000);

            calling1_button.click();
            System.out.println(" contact searched successfuly  ________");
            Thread.sleep(5000);
            call_end.click();

            mUiDevice.pressBack();
            mUiDevice.pressHome();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("navigate_main_tabs method Failed in loop " + i + "____________");
            mUiDevice.pressHome();
        }
    }

    public void Select_Three_G()  {
        try {


            UiObject Selected = new UiObject(new UiSelector()
                    .resourceId(dv.SELECTING_NETWORK_OPTION_resourceId).text("3G"));    //Selecting 3G Option
            Thread.sleep(2000);
            Selected.click();
            System.out.println(" Selected 3G Network and saved  ________");
            mUiDevice.pressBack();
            mUiDevice.pressHome();
            UiObject ClearAll = new UiObject(new UiSelector()  //Clear Recent Apps
                    .resourceId(dv.CLEAR_ALL_resourceId));
            Thread.sleep(4000);
            mUiDevice.pressRecentApps();
            Thread.sleep(4000);
            if (ClearAll.exists()) {
                ClearAll.click();
            } else {

                for (int j = 0; j <= 2; j++) {
                    Thread.sleep(2000);
                    mUiDevice.swipe(400, 200, 400, 1170, 4);
                }

                ClearAll.click();
            }
            System.out.println("Clear_Recent_Apps method Pass in Loop");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("navigate_main_tabs method Failed in loop " + i + "____________");
            mUiDevice.pressHome();
        }

    }

    public void Select_Four_G()  {
        try {


            UiObject Selected = new UiObject(new UiSelector()
                    .resourceId(dv.SELECTING_NETWORK_OPTION_resourceId).text("4G (recommended)"));  //Selecting 4G Option
            Thread.sleep(2000);
            Selected.click();
            System.out.println(" Selected 4G Network and saved  ________");
            mUiDevice.pressBack();
            mUiDevice.pressHome();


            UiObject ClearAll = new UiObject(new UiSelector()   //Clearing Recent Apps
                    .resourceId(dv.CLEAR_ALL_resourceId));
            Thread.sleep(4000);
            mUiDevice.pressRecentApps();
            Thread.sleep(4000);
            if (ClearAll.exists()) {
                ClearAll.click();
            } else {

                for (int j = 0; j <= 2; j++) {
                    Thread.sleep(2000);
                    mUiDevice.swipe(400, 200, 400, 1170, 4);
                }

                ClearAll.click();
            }
            System.out.println("ufClear_Recent_Apps method Pass in Loop");

        } catch (Throwable e) {
            System.out.println(e.getMessage());





            e.printStackTrace();
            System.out.println("navigate_main_tabs method Failed in loop " + i +"____________");
            mUiDevice.pressHome();
        }
    }

    private void Delete_Contact()  {

        try {


            mUiDevice.pressBack() ;
            mUiDevice.pressHome();

            uf.ufMenu_srch_App("Contacts");     //Calling from Utility_Functions
            uf.deleting_numbers("Test001");     //Calling  From Utility Functions
            System.out.println("Contact deleted");
            mUiDevice.pressBack() ;
            mUiDevice.pressHome();

        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("navigate_main_tabs method Failed in loop " + i +"____________");
            mUiDevice.pressHome();
        }



    }


}**/