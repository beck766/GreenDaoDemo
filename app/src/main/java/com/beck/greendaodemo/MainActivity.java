package com.beck.greendaodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private FaceUser faceUser;
    private DaoSession daoSession;
    private FaceUserDao faceUserDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        daoSession = MyApplication.getInstances().getDaoSession();
        faceUserDao = daoSession.getFaceUserDao();
    }

    @OnClick({R.id.btn_insert, R.id.btn_delete, R.id.btn_update, R.id.btn_search,R.id.btn_deleteAll})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_insert:
                for (int i = 0; i < 10; i++) {
                    faceUser = new FaceUser(i, "beck" + i, "男", "", "24", "");
                    faceUserDao.insert(faceUser);
                }
                break;
            case R.id.btn_delete:
                List<FaceUser> faceUserList = (List<FaceUser>) faceUserDao.queryBuilder().where(FaceUserDao.Properties.Id.between(1, 3)).build().list();
                for (FaceUser user : faceUserList) {
                    faceUserDao.delete(user);
                }
                break;
            case R.id.btn_update:
                FaceUser user = new FaceUser(2, "beck02", "男", "", "24", "");
                faceUserDao.update(user);
                break;
            case R.id.btn_search:
                List<FaceUser> list = faceUserDao.queryBuilder()
                        .where(FaceUserDao.Properties.Id.between(0, 9)).limit(10).build().list();
                for (int i = 0; i < list.size(); i++) {
                    Log.i(TAG, "search: ====>" + list.get(i).getName());
                }
                break;
            case R.id.btn_deleteAll:
                faceUserDao.deleteAll();
                break;
        }
    }

}
