package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Log;
import android.util.Pair;

import java.util.concurrent.ExecutionException;

/**
 * Created by animo on 7/3/17.
 */

public class AsyncTest extends AndroidTestCase {
    public static final String LOG_TAG = AsyncTest.class.getSimpleName();

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
