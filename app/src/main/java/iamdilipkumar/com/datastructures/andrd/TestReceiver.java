package iamdilipkumar.com.datastructures.andrd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created on 20/07/17.
 *
 * @author dilipkumar4813
 * @version 1.0
 */

public class TestReceiver extends BroadcastReceiver {

    private static final String TAG = "TestReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive method");
        Toast.makeText(context, "Power is connected", Toast.LENGTH_SHORT).show();
    }
}
