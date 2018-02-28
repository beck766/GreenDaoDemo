package com.beck.greendaodemo;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by beck on 2018/2/28.
 * MyApplication
 */

public class MyApplication extends Application {
    public static MyApplication instances;
    private DaoMaster.DevOpenHelper mHelper;
    private SQLiteDatabase db;
    private DaoMaster daoMaster;
    private DaoSession daoSession;
    private static final String TAG = MyApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        instances = this;
        setDatabase();
        Log.i(TAG, "onCreate: ====>");
    }

    private void setDatabase() {
        mHelper = new DaoMaster.DevOpenHelper(this, "mate-db", null);
        db = mHelper.getWritableDatabase();
        daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }

    public static MyApplication getInstances() {
        Log.i(TAG, "getInstances: ====>");
        return instances;
    }

    public DaoSession getDaoSession() {
        Log.i(TAG, "getDaoSession: ====>");
        return daoSession;
    }

    public SQLiteDatabase getDb() {
        return db;
    }
}
