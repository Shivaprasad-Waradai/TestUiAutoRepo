package com.example.myapplicationtestjunit;

import org.junit.Test;
import java.lang.Object;

/**import android.support.test.espresso.core.deps.guava.base.Strings;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;**/

import android.util.Log;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    private static final String TAG = "Browser";
//    private UiDevice mUiDevice;
    private static final String BROWSER_PACKAGE_NAME = "com.android.chrome";
}
/**
    public Browser(UiDevice uiDevice) {
       return this.mUiDevice = uiDevice;
    }


    public boolean enterBrowser() throws Exception {
        Log.i(TAG, "started:  enter Browser");
        mUiDevice.pressBack();
        mUiDevice.pressHome();
        boolean result = true;

        if (Util.clickByText(mUiDevice, "Chrome")) {
            Util.waitForWindowUpdate(mUiDevice, BROWSER_PACKAGE_NAME);
            //UiObject allAppsButton = device
            //        .findObject(new UiSelector().description("Apps"));
            UiObject2 acceptButton = null;
            acceptButton = mUiDevice.findObject(By.text("ACCEPT & CONTINUE"));
            if (null != acceptButton) {
                acceptButton.click();
            }

            UiObject2 noThanksButton = null;
            noThanksButton = mUiDevice.findObject(By.text("NO THANKS"));
            if (null != noThanksButton) {
                noThanksButton.click();
            }

            UiObject2 keepGoogle = null;
            keepGoogle = mUiDevice.findObject(By.text("KEEP GOOGLE"));
            if (null != keepGoogle) {
                keepGoogle.click();
            }

            Log.i(TAG, "finished: enter Browser successfully");
        } else {
            Log.i(TAG, "finished: enter Browser failed");
            result = false;
        }

        return result;
    }

    public boolean enterBrowserAndThenExit() throws Exception {
        Log.i(TAG, "started:  enter Browser and then exit");
        mUiDevice.pressBack();
        mUiDevice.pressHome();
        boolean result = true;

        if (Util.clickByText(mUiDevice, "Chrome")) {
            Util.waitForWindowUpdate(mUiDevice, BROWSER_PACKAGE_NAME);

            UiObject2 acceptButton = null;
            acceptButton = mUiDevice.findObject(By.text("ACCEPT & CONTINUE"));
            if (null != acceptButton) {
                acceptButton.click();
            }

            UiObject2 noThanksButton = null;
            noThanksButton = mUiDevice.findObject(By.text("NO THANKS"));
            if (null != noThanksButton) {
                noThanksButton.click();
            }

            UiObject2 keepGoogle = null;
            keepGoogle = mUiDevice.findObject(By.text("KEEP GOOGLE"));
            if (null != keepGoogle) {
                keepGoogle.click();
            }

            Log.i(TAG, "finished: enter Browser and then exit successfully");
        } else {
            Log.i(TAG, "finished: enter Browser and then exit failed");
            result = false;
        }

        mUiDevice.pressBack();
        mUiDevice.pressHome();
        return result;
    }

}

 **/