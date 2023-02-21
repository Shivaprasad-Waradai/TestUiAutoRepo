package com.example.myapplicationtestjunit;

import android.support.test.uiautomator.UiDevice;

public class Device_Veriables extends Util {
    //Frontier test cases Loops
    int Mtbf_Adding_And_Deleting_Contacts =50;
    int Mtbf_Make_A_Call =50;
    int Mtbf_Send_SMS =50;
    int Mtbf_Call_To_Incoming_Number =50;
    int Mst_Calculator =2;
    int Mst_Camera =0;
    int Mst_Clock =0;
    int Mst_Contacts =50;
    int Mst_File =50;
    int Mst_FMRadio =50;
    int Mst_Gallery =50;
    int Mst_Message =50;
    int Mst_Phone =50;
    int Mtbf_Top_Five_Websites=50;
    int Mtbf_Alarms =50;
    int Mtbf_Play_Youtube_Video_Loop =50;
    int Mtbf_Browser_Navigating_To_Webpage_loop = 50;
    int MTBF_MULTI_MEDIA_1_loop = 50;
    int MTBF_MULTI_MEDIA_2_loop = 50;
    int MTBF_MULTI_MEDIA_3_loop = 50;
    int MTBF_MULTI_TASKING_4_loop = 50;
    int MTBF_MULTI_TASKING_5_loop = 50;
    int MTBF_MULTI_TASKING_6_loop = 50;
    int MTBF_TELEPHONY_2_loop = 50;
    int MTBF_TELEPHONY_4_loop = 25;
    int MTBF_TELEPHONY_5_loop = 50;
    int Create_Delete_Appointment_Loops=50;
    int Mst_Music_Loops=50;
    int Open_Play_Music_Loops=44;
    int Mst_Calendar_Loops=50;
    int Mtbf_Capture_A_Photo =0;
    int Mtbf_Delete_Photo =0;





    //Frontier ResourcesIDs, ClassNames, Content Descriptions, Text
//**************************************************************************************************
    String DEVICE_MAIN_MENU_resourceId = "com.android.launcher3:id/all_apps_handle";
    String DEVICE_SEARCH_APP_FROM_MAIN_MENU_resourceId = "com.android.launcher3:id/search_box_input";
    String App_Handler="Apps list";

    //Clock
    //Main Tab Resource Locators
    String CLOCK_MAIN_TABS_className = "wa";
    String CLOCK_TAB_ALARM_contentDescription = "Alarm";
    String CLOCK_TAB_CLOCK_contentDescription = "Clock";
    String CLOCK_TAB_TIMER_contentDescription = "Timer";
    String CLOCK_TAB_STOPWATCH_contentDescription = "StopWatch";

    //More Option
    String CLOCK_TAB_MORE_OPT_className = "android.widget.ImageView";
    String CLOCK_MORE_OPT_DROPDOWN_className = "android.widget.LinearLayout";
    String CLOCK_MORE_OPT_contentDescription = "More options";

    //FM Radio
    //**** Precondition kindly Insert the Head Set Properly. *****
    String FM_PREVIOUS_STATION_resourceId = "com.android.fmradio:id/button_prevstation";
    String FM_BTN_DECREASE_resourceId = "com.android.fmradio:id/button_decrease";
    String FM_ADD_TO_FAVORITE_resourceId = "com.android.fmradio:id/button_add_to_favorite";
    String FM_BTN_INCREASE_resourceId = "com.android.fmradio:id/button_increase";
    String FM_NEXT_STATION_resourceId = "com.android.fmradio:id/button_nextstation";
    String FM_STATION_LIST_resourceId = "com.android.fmradio:id/fm_station_list";
    String FM_HEADSET_DROPDOWN_resourceId = "com.android.fmradio:id/fm_headset";
    String FM_MORE_OPT_className = "android.widget.ImageButton";
    String FM_MORE_OPT_contentDescription = "More Options";
    String FM_MORE_OPT_LIST_className = "android.widget.LinearLayout";//same in all app
    String FM_MORE_OPT_LIST_START_RECORDING_text = "Start recording";
    String FM_MORE_OPT_LIST_SAVED_RECORDINGS_text = "Saved recordings";
    String FM_PLAY_BTN_resourceId = "com.android.fmradio:id/play_button";


    //
// Messages
    String MSG_MORE_OPT_className = "android.widget.ImageView";
    String MSG_MORE_OPT_contentDescription = "More options";
    String MSG_CREATE_NEW_MSG_ICON_resourceId = "com.google.android.apps.messaging:id/start_new_conversation_button";
    String MSG_MORE_OPT_LIST_className = "android.widget.LinearLayout";


    //Frontier device MTBF variables_Messaged
    String SMS_NEW_MESSAGE_resourceId ="com.google.android.apps.messaging:id/start_new_conversation_button";
    String SMS_DIALPAD_TOGGLE_resourceId ="com.google.android.apps.messaging:id/action_ime_dialpad_toggle";
    String SMS_ADD_PHONE_NO_resourceId ="com.google.android.apps.messaging:id/recipient_text_view";
    String SMS_COMPOSE_MSG_resourceId ="com.google.android.apps.messaging:id/compose_message_text";
    String SMS_SIM_SELECTION_LIST_resourceId ="com.google.android.apps.messaging:id/send_message_button_arrow_drop_down";
    String SMS_SELECT_SIM_className ="android.widget.LinearLayout";
    String SMS_SEND_MESSAGE_BUTTON_resourceId ="com.google.android.apps.messaging:id/send_message_button_icon";



//Frontier   ResourcesIDs

//*************************************************************************************************************************ANILs STARTS
//Frontier   ResourcesIDs



    //Contact Saving ResourcesIDs,ClassNames
    //String CREATE_CONTACT_resourceId="com.google.android.contacts:id/floating_action_button";//*[@resource-id='com.google.android.contacts:id/floating_action_button']
    String CREATE_CONTACTS_resourceId="com.android.contacts:id/floating_action_button";
    String SAVE_OPTION_resourceId="com.android.contacts:id/editor_menu_save_button";
    String DATA_ENTERING_classId="android.widget.EditText";
    String SAVING_NUMBER="7996000036";
    String INCOMING_NUMBER="+91 79 9600 0034";

    // Setting ResourcesIDs,ClassNames
    String NETWORK_AND_INTERNET_OPTION_className="android.widget.TextView";
    String SELECTING_NETWORK_OPTION_resourceId="android:id/text1";
    String CLEAR_ALL_resourceId="com.android.systemui:id/button";




    //Contact searching ResourceIDs
    String SEARCH_OPTION_IN_CONTACTS_resourceId="com.android.contacts:id/menu_search"; // for Frontier*[@resource-id='com.google.android.contacts:id/menu_search']
    String SEARCH_NUMBER_resourceId="com.android.contacts:id/search_view";// for Frontier*[@resource-id='com.google.android.contacts:id/search_view']
    String SELECT_NUMBER_resourceId="com.android.contacts:id/cliv_name_textview";// for Frontier*[@resource-id='com.google.android.contacts:id/cliv_name_textview']
    String CALLING_BUTTON_resourceId="com.android.contacts:id/icon";
    String CALL_END_BUTTON_resourceId="com.android.dialer:id/incall_end_call"; // for Frontier*[@resource-id='com.google.android.dialer:id/incall_end_call']
    String DELETING_OPTION_resourceId="android:id/title";
    String SELECT_DELETE_resourceId="android:id/button1";


    //Browser ResourceIDs,
    String CONTINUE_AND_GOT_IT_resourceId="com.android.chrome:id/next_button"; // for Frontier*[@resource-id='com.android.chrome:id/positive_button']

    //Youtube ResourceIDs,ClassName
    String OPENING_GOOGLE_PAGE_resourceId= "com.android.chrome:id/search_box";

    //Alaram ResourceIDs,Name
    String Alaram1="1";
    String Alaram2="3";
    String Alaram3="5";
    String SELECTING_ALARAM_OPTION_ClassName="android.widget.TextView"; // for frontier *[@class='android.widget.ImageView']

    //Mst Calendar,contentDescription

    String Menu="Show Calendar List and Settings drawer";
    String Schedule_option="Schedule";
    String Day_option="Day";
    String Week_Option="Week";
    String Month_option="Month";
//********************************************************************************************************************************ANILs END

    //SETTINGS ResourcesIDs, ClassNames, Content Descriptions, Text
    String SETTINGS_MENU_className = "android.widget.LinearLayout";
    String SETTINGS_MENU_resourceId = "com.android.settings:id/dashboard_tile";


//PHOTOS ResourcesIDs, ClassNames, Content Descriptions, Text

    String PHOTO_NAVIGATION_DRAWER_LIST_TITEL_resourceId = "com.google.android.apps.photos:id/title";

    //**************************************************************************************************
//Shiva
    //Frontier
    //Build Number - 000C_0_14A
    //FM Radio**
    String FM_power_btn = "Power";//*[@contentDescription='Power']
    String FM_more_options = "More options";//*[@contentDescription='More options']
    String FM_mo_Scan = "Scan";//*[@text='Scan']
    String FM_mo_Settings = "Settings";//*[@text='Settings']
    String FM_mo_Speaker = "Speaker on";//*[@text='Speaker on']
    String FM_mo_Record = "Record";//*[@text='Record']
    String FM_mo_About = "About";//*[@text='About']
    String FM_mo_list_classname = "android.widget.LinearLayout";//*[@class='android.widget.LinearLayout']
    String FM_star_check_box = "com.evenwell.fmradio:id/CheckboxStar";//*[@resource-id='com.evenwell.fmradio:id/CheckboxStar']
    String FM_drop_down_list = "android.widget.Spinner";//*[@class='android.widget.Spinner']
    String FM_ddl_FMRadio = "FM Radio";//*[@text='FM Radio']
    String FM_ddl_Fav = "Favorite List";//*[@text='Favorite List']
    String FM_ddl_RecFiles = "Recorded Files";//*[@text='Recorded Files']

    //Nokia 3 calendar
    //Srinidhi

    String EVENT_new= "Create new event and more";
    String EVENT_new1= "com.google.android.calendar:id/speed_dial_event_container";
    String EVENT_title= "com.google.android.calendar:id/title_edit_text";
    String EVENT_save= "com.google.android.calendar:id/save";
    String EVENT_done="DONE";
    String Click_Test_Event="android.view.View";
    String More_options="More options";
    String Delete_Event="android.widget.LinearLayout";

    //Nokia 3 Music
    String PLAY_music="Play Music";
    String Navigation_drawer="Show navigation drawer";
    String Recent_album="Recents";
    String Top_charts="Top charts";
    String New_releases="New releases";
//  **************************************************************Sri-End**********************************//


    //Nokia 3 Music Player
    //Niketha

    String Music_No_Thanks="NO THANKS";
    String Music_Header_Cancel="com.google.android.music:id/modal_header_button";
    String Music_Skip="com.google.android.music:id/button_0";
    String Music_Play="com.google.android.music:id/play_button";
    String Music_Pause="com.google.android.music:id/play_pause_header";

//*****************************************************************8Praveen **********************************//

    // Photos
    //  String PHOTO_BACKUP_ON_BUTTON_Text ="ON";
    String PHOTO_BACKUP_ON_BUTTON_Resource_Id = "com.google.android.apps.photos:id/auto_backup_switch";
    String PHOTO_BACKUP_DONE_BUTTON_Text ="DONE";
    String PHOTO_KEEP_BACKUP_OFF_BUTTON_Text ="KEEP OFF";
    String PHOTO_FIRST_IMAGE_Classname = "android.view.ViewGroup";  //desc took from E1M
    String PHOTO_DELETE_IMAGE_Disc = "Bin";   //desc took from E1M
    String PHOTO_MOVE_TO_BIN_Text ="Move to Bin";  //desc took from E1M

    // Camera
    String CAMERA_SHUTTER_BUTTON_Content_desc = "ShutterButton";  //desc took from E1M


//*******************************************************Praveen-End************************************************//

//E1M ResourcesIDs, ClassNames, Content Descriptions, Text
private UiDevice mUiDevice;
    public Device_Veriables(UiDevice uiDevice) {
        this.mUiDevice = uiDevice;
    }

    public Device_Veriables() {
    }
}
