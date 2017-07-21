package iamdilipkumar.com.datastructures.andrd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created on 21/07/17.
 *
 * @author dilipkumar4813
 * @version 1.0
 */

public class TestSqlDatabase extends SQLiteOpenHelper{

    private final static String DATABASE_NAME = "testdatabase";
    private final static int DATABASE_VERSION = 1;

    public TestSqlDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
