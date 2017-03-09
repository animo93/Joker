package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;
import android.util.Log;
import android.util.Pair;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static android.support.test.InstrumentationRegistry.getContext;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by animo on 7/3/17.
 */
@RunWith(AndroidJUnit4.class)
public class AsyncTest{
    public static final String LOG_TAG = AsyncTest.class.getSimpleName();

    @Test
    public void testJoke(){
        try {
            String joke=new EndpointsAsyncTask().execute(new Pair<Context, String>(getContext(),"null")).get();
            Log.d(LOG_TAG,joke);
            assertNotNull(joke);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
