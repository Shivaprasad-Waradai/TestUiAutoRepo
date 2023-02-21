package com.example.myapplicationtestjunit;

import android.graphics.Camera;
import android.support.test.uiautomator.UiDevice;
import android.util.Log;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.SdkSuppress;
import androidx.test.platform.app.InstrumentationRegistry;

import junit.framework.AssertionFailedError;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Test ID: MTBF Multi-Media 1
 * Description: Record a 30s video
 * Test Steps:
 * 1. Back to idle.
 * 2. Enter Camera app.
 * 3. Click video button.
 * 4. Click record button to record a video.
 * 5. Wait for 30 seconds.
 * 6. End the video recording.
 * 7. Back to idle.
 */
/**@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 21)
public class MTBF_MULTI_MEDIA_1  {
    private UiDevice mUiDevice;
    private Camera mCamera;
    private Device_Veriables dv;
    private static final String TAG = "MTBF_MULTI_MEDIA_1";
    int i;
    @Before
    public void setUp() throws Exception {

        mUiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        if (null == mUiDevice) {
            Log.e(TAG, "can't find the UiDevice");
            return;
        }

        mCamera = new Camera(mUiDevice);
        dv = new Device_Veriables(mUiDevice);
    }

    @Test
    public void test() {
        for (i=1;i<=dv.MTBF_MULTI_MEDIA_1_loop;i++)
        {
            try {
                //Record a 30 seconds video
                mCamera.recordVideo(30000);
            } catch (Exception e) {
                throw new AssertionFailedError();
            }

        }

    }
}
**/