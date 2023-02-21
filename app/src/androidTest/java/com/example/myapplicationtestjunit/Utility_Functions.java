package com.example.myapplicationtestjunit;

import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

/**
 * Created by Shivaprasad Waradai on 05-10-2017.
 */

public class Utility_Functions extends Device_Veriables  {





    private UiDevice device;

    public void ufMenu_srch_App(String AppName) throws Exception {
        try {

           UiObject device_main_menu_Key = new UiObject(new UiSelector()
               .resourceId(DEVICE_MAIN_MENU_resourceId));//Frontier Veriable Values are present in Device_Veriable Class

            UiObject search_App = new UiObject(new UiSelector()
                    .resourceId(DEVICE_SEARCH_APP_FROM_MAIN_MENU_resourceId));//Frontier


            UiObject click_on_App = new UiObject(new UiSelector()
                    .className("android.widget.TextView").index(0));//Frontier
            UiObject click_on_App1 = new UiObject(new UiSelector()
                    .className("android.widget.TextView").text("Settings"));//Frontier


            Thread.sleep(2000);
            device_main_menu_Key.click();
            Thread.sleep(2000);
            search_App.setText(AppName);
            Thread.sleep(2000);

            if (click_on_App1.exists()) {
                click_on_App1.click();
                Thread.sleep(2000);
            } else {
                click_on_App.click();
                Thread.sleep(2000);
            }

            System.out.println("*************************" + AppName + " Application found **************************");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("*************************" + AppName + " Application not found ****************************");


        }


    }



    public void add_numbers(String ContactName, String SAVING_NUMBER) {
        try {

            Thread.sleep(5000);
            UiObject create_contac = new UiObject(new UiSelector()
                    .descriptionContains("Contacts tab."));

            create_contac.click();
            UiObject create_new_contact = new UiObject(new UiSelector()
                    .className("android.widget.TextView").text("Create new contact"));

            UiObject create_new_contact1 = new UiObject(new UiSelector()
                    .text("CREATE NEW CONTACT"));
            if (create_new_contact1.exists()){
                create_new_contact1.click();
            }else {

                create_new_contact.click();
            }
            UiObject entering_first_name = new UiObject(new UiSelector()
                    .className(DATA_ENTERING_classId).text("First name"));   //Entering First name
            entering_first_name.setText(ContactName);
            Thread.sleep(2000);

             /*   UiObject more_option = new UiObject(new UiSelector()
                        .resourceId("com.google.android.contacts:id/expansion_view"));   //Entering First name
                more_option.click();
                UiObject more_option1 = new UiObject(new UiSelector()
                        .resourceId("com.google.android.contacts:id/expansion_view"));   //Entering First name
                more_option1.click();  */ //For Frontier

            UiObject phone_number = new UiObject(new UiSelector()
                    .className(DATA_ENTERING_classId).text("Phone"));//Entering Phone Number
            phone_number.click();
            phone_number.setText(SAVING_NUMBER);

            Thread.sleep(2000);
            UiObject Save_Button = new UiObject(new UiSelector()
                    .text("SAVE"));


            Save_Button.click();
            System.out.println("Contact saved  ________");
            Thread.sleep(2000);



        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }


    }


    public void deleting_numbers(String ContactName)  throws Exception {
        try {

            UiObject search_option = new UiObject(new UiSelector()
                    .resourceId(SEARCH_OPTION_IN_CONTACTS_resourceId));
            UiObject search_number = new UiObject(new UiSelector()
                    .resourceId(SEARCH_NUMBER_resourceId));
            UiObject select_number = new UiObject(new UiSelector()
                    .resourceId(SELECT_NUMBER_resourceId));

            UiObject select_option = new UiObject(new UiSelector()
                    .descriptionContains("More options"));


            UiObject delete_number = new UiObject(new UiSelector()
                    .text("Delete"));
            UiObject deleted_success = new UiObject(new UiSelector()
                    .text("DELETE"));


            Thread.sleep(2000);
            search_option.click();
            Thread.sleep(2000);

            search_number.setText(ContactName);
            Thread.sleep(2000);
            select_number.click();
            Thread.sleep(2000);
            select_option.click();

            Thread.sleep(2000);
            delete_number.click();
            Thread.sleep(2000);
            deleted_success.click();
            Thread.sleep(2000);
            System.out.println(" contact deleted successfuly  ________");



        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }


    }

    public void ufClear_Recent_Apps() throws Exception {

        try {
            UiObject ClearAll = new UiObject(new UiSelector()
                    .resourceId("com.android.systemui:id/button"));
            UiObject NoRecentApps = new UiObject(new UiSelector()
                    .text("No recent items"));
            Thread.sleep(4000);
            device.pressRecentApps();
            Thread.sleep(4000);
            if (NoRecentApps.exists()) {
                device.pressHome();
                System.out.println("Clicked Home ");
            } else {
                boolean flag = true;
                //  for (int j = 0; j <= 2; j++) {
                while (flag) {
                    // Thread.sleep(2000);
                    if (ClearAll.exists()) {
                        ClearAll.click();
                        System.out.println("Clicked Clear All");
                        flag = false;
                    } else
                        device.swipe(400, 200, 400, 1170, 10);
                }

                //  ClearAll.click();
            }
            System.out.println("ufClear_Recent_Apps method Pass___________");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ufClear_Recent_Apps method Failed____________");
        }

    }
    public void Network_Selection()  throws Exception {
        try {

            UiObject click_on_Network = new UiObject(new UiSelector()
                    .className(NETWORK_AND_INTERNET_OPTION_className).text("More")); // for frontier .text("Network & Internet") Inside Setting selecting Network Option
            UiObject Mobile_Networks = new UiObject(new UiSelector()
                    .className(NETWORK_AND_INTERNET_OPTION_className).text("Mobile network")); //selecting Mobile Network
            UiObject Preferred_Network = new UiObject(new UiSelector()
                    .className(NETWORK_AND_INTERNET_OPTION_className).text("Preferred network type"));//Selecting Preferred Network
            Thread.sleep(2000);
            click_on_Network.click();
            Thread.sleep(2000);
            Mobile_Networks.click();
            Thread.sleep(2000);
            Preferred_Network.click();
            System.out.println("preferred Network passed  ________");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }


    }


    public void Sim_Selection()   {
        try {

            UiObject click_on_Network = new UiObject(new UiSelector()
                    .className(NETWORK_AND_INTERNET_OPTION_className).text("Network & Internet")); //Inside Setting selecting Network Option
            UiObject Selecting_Sim_Cards = new UiObject(new UiSelector()
                    .className(NETWORK_AND_INTERNET_OPTION_className).text("SIM cards")); //Inside Setting selecting SIM cards
            UiObject Selecting_Mobile_data = new UiObject(new UiSelector()
                    .className(NETWORK_AND_INTERNET_OPTION_className).text("Mobile data")); //Inside Setting Mobile data SIM card
            UiObject Selected_sim1 = new UiObject(new UiSelector()
                    .className(SETTINGS_MENU_className).index(0)); //Inside Setting selecting SIM cards



            click_on_Network.click();
            Thread.sleep(2000);
            Selecting_Sim_Cards.click();
            Thread.sleep(2000);
            Selecting_Mobile_data.click();
            Thread.sleep(2000);
            Selected_sim1.click();




        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }


    }
    public void Sim2_Selection()   {
        try {

            UiObject click_on_Network = new UiObject(new UiSelector()
                    .className(NETWORK_AND_INTERNET_OPTION_className).text("Network & Internet")); //Inside Setting selecting Network Option
            UiObject Selecting_Sim_Cards = new UiObject(new UiSelector()
                    .className(NETWORK_AND_INTERNET_OPTION_className).text("SIM cards")); //Inside Setting selecting SIM cards
            UiObject Selecting_Mobile_data = new UiObject(new UiSelector()
                    .className(NETWORK_AND_INTERNET_OPTION_className).text("Mobile data")); //Inside Setting Mobile data SIM card
            UiObject Selected_sim1 = new UiObject(new UiSelector()
                    .className(SETTINGS_MENU_className).index(1)); //Inside Setting selecting SIM cards



            click_on_Network.click();
            Thread.sleep(2000);
            Selecting_Sim_Cards.click();
            Thread.sleep(2000);
            Selecting_Mobile_data.click();
            Thread.sleep(2000);
            Selected_sim1.click();




        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }


    }



    public void Alarams_Added()   {
        try {
         /*   UiObject Selecting_Alaram_Option = new UiObject(new UiSelector() //Selecting Alaram Button
                    .className(SELECTING_ALARAM_OPTION_ClassName).descriptionContains("Alarm"));*/ //for Frontier
            UiObject Selecting_Alaram_Option = new UiObject(new UiSelector() //Selecting Alaram Button
                    .className(SELECTING_ALARAM_OPTION_ClassName).descriptionContains("ALARM"));
            UiObject Alaram_Add_Button = new UiObject(new UiSelector() //Selecting Alaram Button
                    .resourceId("com.google.android.deskclock:id/fab"));
            UiObject select_Time1 = new UiObject(new UiSelector()    //Selecting Alaram1 Time
                    .descriptionContains(Alaram1));
            UiObject select_Time2 = new UiObject(new UiSelector()    //Selecting Alaram2 Time
                    .descriptionContains(Alaram2));
            UiObject select_Time3 = new UiObject(new UiSelector()    //Selecting Alaram3 Time
                    .descriptionContains(Alaram3));
            UiObject Click_Ok = new UiObject(new UiSelector()     // Clicking Ok
                    .resourceId("android:id/button1"));



            System.out.println("Menu_srch_App PASS ________");
            Thread.sleep(2000);
            Selecting_Alaram_Option.click();
            Thread.sleep(2000);
            Alaram_Add_Button.click();
            Thread.sleep(2000);
            select_Time1.click();
            Thread.sleep(2000);
            Click_Ok.click();

            Thread.sleep(2000);
            Alaram_Add_Button.click();
            Thread.sleep(2000);
            select_Time2.click();
            Thread.sleep(2000);
            Click_Ok.click();

            Thread.sleep(2000);
            Alaram_Add_Button.click();
            Thread.sleep(2000);
            select_Time3.click();
            Thread.sleep(2000);
            Click_Ok.click();




        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }


    }
    public void Alarams_Deleted()   {
        try {

            UiObject Alaram1_Extend_Button = new UiObject(new UiSelector() //Selecting Alaram1 Button
                    .className("android.view.ViewGroup").index(0));
            UiObject Alaram2_Extend_Button = new UiObject(new UiSelector() //Selecting Alaram2 Button
                    .className("android.view.ViewGroup").index(1));
            UiObject Alaram3_Extend_Button = new UiObject(new UiSelector() //Selecting Alaram3 Button
                    .className("android.view.ViewGroup").index(2));
            UiObject Delete_Alaram = new UiObject(new UiSelector()    //Deleting Alaram Button
                    .resourceId("com.google.android.deskclock:id/delete"));




            System.out.println("Menu_srch_App PASS ________");

            Thread.sleep(2000);
            Alaram1_Extend_Button.click();
            Thread.sleep(2000);
            Delete_Alaram.click();
            Thread.sleep(2000);
            Alaram2_Extend_Button.click();
            Thread.sleep(2000);
            Delete_Alaram.click();
            Thread.sleep(2000);
            Alaram3_Extend_Button.click();
            Thread.sleep(2000);
            Delete_Alaram.click();
            device.pressBack();
            device.pressHome();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }

    }
}

