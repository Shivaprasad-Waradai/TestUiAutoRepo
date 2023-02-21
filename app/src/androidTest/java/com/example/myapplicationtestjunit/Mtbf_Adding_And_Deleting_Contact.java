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



/*Test ID: MTBF Adding_And_Deleting_Contacts
 Description: Adding 5 numbers and Deleting 5 numbers
    Test Steps:
          1. Back to idle.
          2. Enter Phone app.
          3. Click Contact  button.
          4. Click Create New Contact.
          5. Entering First Name and Phone number.
          6. Click Save Button.
          7. Back to idle.
          8.Repeating 5 Times
          9.Deleting 5 Contact
         */

public class Mtbf_Adding_And_Deleting_Contact extends Utility_Functions {
    private static final String TAG = "Adding Deleting Contact";
    private UiDevice mUiDevice;
    private Utility_Functions uf;
    private Device_Veriables dv;
    int i;

    public Mtbf_Adding_And_Deleting_Contact(UiDevice uiDevice) {
        super(uiDevice);
    }

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
    public void Operation() throws Exception {


        for ( i = 1;i<=dv.Mtbf_Adding_And_Deleting_Contacts;i++) {
            Add1_Contact();
            Delete1_Contact();
        }
    }

    private void Add1_Contact()  {

        try {


            mUiDevice.pressBack() ;
            mUiDevice.pressHome();

            uf.ufMenu_srch_App("Phone"); //Calling from Utility_Functions

            uf.add_numbers("Test01",dv.SAVING_NUMBER); //Calling from Utility Function to Save Number1
            System.out.println("Contact1 saved  ________");
            mUiDevice.pressBack();
            mUiDevice.pressHome();
            uf.ufMenu_srch_App("Phone");   //Calling from Utility_Functions

            uf.add_numbers("Test02",dv.SAVING_NUMBER);  //Calling from Utility Function to Save Number2
            System.out.println("Contact2 saved  ________");
            mUiDevice.pressBack();
            mUiDevice.pressHome();
            uf.ufMenu_srch_App("Phone");   //Calling from Utility_Functions

            uf.add_numbers("Test03",dv.SAVING_NUMBER);   //Calling from Utility Function to Save Number3
            System.out.println("Contact3 saved  ________");
            mUiDevice.pressBack();
            mUiDevice.pressHome();

            uf.ufMenu_srch_App("Phone");   //Calling from Utility_Functions

            uf.add_numbers("Test04",dv.SAVING_NUMBER);  //Calling from Utility Function to Save Number4
            System.out.println("Contact4 saved  ________");
            mUiDevice.pressBack();
            mUiDevice.pressHome();
            uf.ufMenu_srch_App("Phone");   //Calling from Utility_Functions

            uf.add_numbers("Test05",dv.SAVING_NUMBER);   //Calling from Utility Function to Save Number5
            System.out.println("Contact5 saved  ________");
            mUiDevice.pressBack();
            mUiDevice.pressHome();
            System.out.println("navigate_main_tabs method Pass in Loop" + i +"____________" );
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("navigate_main_tabs method Failed in loop " + i +"____________");
            mUiDevice.pressHome();
        }


    }

    private void Delete1_Contact()  {

        try {


            mUiDevice.pressBack() ;
            mUiDevice.pressHome();

            uf.ufMenu_srch_App("Contacts");   //Calling from Utility_Functions
            uf.deleting_numbers("Test01");      //Calling from Utility_Functions to Delete Number1
            System.out.println("Contact1 deleted");
            mUiDevice.pressBack() ;
            mUiDevice.pressHome();

            uf.ufMenu_srch_App("Contacts");   //Calling from Utility_Functions
            uf.deleting_numbers("Test02");     //Calling from Utility_Functions to Delete Number2
            System.out.println("Contact2 deleted");
            mUiDevice.pressBack() ;
            mUiDevice.pressHome();

            uf.ufMenu_srch_App("Contacts");     //Calling from Utility_Functions
            uf.deleting_numbers("Test03");       //Calling from Utility_Functions to Delete Number3
            System.out.println("Contact3 deleted");
            mUiDevice.pressBack() ;
            mUiDevice.pressHome();

            uf.ufMenu_srch_App("Contacts");     //Calling from Utility_Functions
            uf.deleting_numbers("Test04");       //Calling from Utility_Functions to Delete Number4
            System.out.println("Contact4 deleted");
            mUiDevice.pressBack() ;
            mUiDevice.pressHome();

            uf.ufMenu_srch_App("Contacts");      //Calling from Utility_Functions
            uf.deleting_numbers("Test05");       //Calling from Utility_Functions to Delete Number5
            System.out.println("Contact5 deleted");
            System.out.println("navigate_main_tabs method Passed in loop " + i +"____________");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("navigate_main_tabs method Failed in loop " + i +"____________");
            mUiDevice.pressHome();
        }



    }

}