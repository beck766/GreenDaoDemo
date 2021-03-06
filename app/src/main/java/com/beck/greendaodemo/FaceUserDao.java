package com.beck.greendaodemo;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "FACE_USER".
*/
public class FaceUserDao extends AbstractDao<FaceUser, Long> {

    public static final String TABLENAME = "FACE_USER";

    /**
     * Properties of entity FaceUser.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Gender = new Property(2, String.class, "gender", false, "GENDER");
        public final static Property Icon = new Property(3, String.class, "icon", false, "ICON");
        public final static Property Age = new Property(4, String.class, "age", false, "AGE");
        public final static Property Feature = new Property(5, String.class, "feature", false, "FEATURE");
    }


    public FaceUserDao(DaoConfig config) {
        super(config);
    }
    
    public FaceUserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"FACE_USER\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: id
                "\"NAME\" TEXT," + // 1: name
                "\"GENDER\" TEXT," + // 2: gender
                "\"ICON\" TEXT," + // 3: icon
                "\"AGE\" TEXT," + // 4: age
                "\"FEATURE\" TEXT);"); // 5: feature
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"FACE_USER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, FaceUser entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String gender = entity.getGender();
        if (gender != null) {
            stmt.bindString(3, gender);
        }
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(4, icon);
        }
 
        String age = entity.getAge();
        if (age != null) {
            stmt.bindString(5, age);
        }
 
        String feature = entity.getFeature();
        if (feature != null) {
            stmt.bindString(6, feature);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, FaceUser entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String gender = entity.getGender();
        if (gender != null) {
            stmt.bindString(3, gender);
        }
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(4, icon);
        }
 
        String age = entity.getAge();
        if (age != null) {
            stmt.bindString(5, age);
        }
 
        String feature = entity.getFeature();
        if (feature != null) {
            stmt.bindString(6, feature);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public FaceUser readEntity(Cursor cursor, int offset) {
        FaceUser entity = new FaceUser( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // gender
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // icon
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // age
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // feature
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, FaceUser entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setGender(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setIcon(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAge(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setFeature(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(FaceUser entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(FaceUser entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(FaceUser entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
