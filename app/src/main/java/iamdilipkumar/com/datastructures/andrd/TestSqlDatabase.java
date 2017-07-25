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

public class TestSqlDatabase extends SQLiteOpenHelper {

    private final static String DATABASE_NAME = "testdatabase";
    private final static int DATABASE_VERSION = 1;

    private final static String TABLE_NAME = "testtable";
    private final static String ID = "_id";
    private final static String NAME = "name";
    private final static String NUMBER = "number";

    private final static String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS "
            + TABLE_NAME + "(" + ID + " INT PRIMARY KEY AUTOINCREMENT," + NAME +
            " TEXT," + NUMBER + " TEXT);";

    public TestSqlDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + TABLE_NAME);
    }
}
