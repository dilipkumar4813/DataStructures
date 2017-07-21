package iamdilipkumar.com.datastructures.andrd;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/**
 * Created on 21/07/17.
 *
 * @author dilipkumar4813
 * @version 1.0
 */

public class TestObserver extends ContentObserver {

    /**
     * Creates a content observer.
     *
     * @param handler The handler to run {@link #onChange} on, or null if none.
     */
    public TestObserver(Handler handler) {
        super(handler);
    }

    @Override
    public void onChange(boolean selfChange) {
        super.onChange(selfChange);
    }

    @Override
    public void onChange(boolean selfChange, Uri uri) {
        super.onChange(selfChange, uri);
    }
}
