package com.pizzaapp.pizzaapp_v_2.app.database;

import android.app.ProgressDialog;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by neso on 14.04.14..
 */
public class SearchPlacesDatabase extends SQLiteOpenHelper
{

    private static final String     url_restaurants_database = "ZokiPHP treba stavit url";
    private static final int        DATABASE_VERSION         = 1;
    private static final String     DATABASE_NAME            = "food_order";
    private static final String     TABLE_RESTAURANTS        = "restaurants";
    private static final String     KEY_ID                   = "id";
    private static final String     KEY_IMAGE                = "image";
    private static final String     KEY_NAME                 = "name";
    private static final String     KEY_RATING               = "rating";
    private static final String     KEY_ORDER_TIME_START     = "order_time_start";
    private static final String     KEY_ORDER_TIME_END       = "order_time_end";
    private static final String     KEY_PHONE                = "phone";
    private static final String     KEY_EMAIL                = "email";
    private static final String     KEY_NOTES                = "notes";
    private static final String     KEY_COUNTRY              = "country";
    private static final String     KEY_STATE                = "state";
    private static final String     KEY_CITY                 = "city";
    private static final String     KEY_ZIP                  = "zip";
    private static final String     KEY_STREET               = "street";
    private static final String     KEY_LAST_UPDATE          = "last_update";
    private              JsonParser jsonParser               = new JsonParser();
    private              JSONArray  restaurantsJsonArray     = null;
    private ProgressDialog                     progressDialog;
    private ArrayList<HashMap<String, String>> restaurantsList;


    public SearchPlacesDatabase(Context context,
                                String name,
                                SQLiteDatabase.CursorFactory factory,
                                int version,
                                DatabaseErrorHandler errorHandler)
    {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }

    public String getTableRestaurants(int id)
    {
        SQLiteDatabase restaurantsDatabase = this.getReadableDatabase();

        Cursor cursor = restaurantsDatabase.query(TABLE_RESTAURANTS,
                                                  new String[]{KEY_ID, KEY_IMAGE, KEY_NAME,
                                                          KEY_RATING, KEY_ORDER_TIME_START,
                                                          KEY_ORDER_TIME_END, KEY_PHONE, KEY_EMAIL,
                                                          KEY_NOTES, KEY_COUNTRY, KEY_STATE,
                                                          KEY_CITY, KEY_ZIP, KEY_STREET,
                                                          KEY_LAST_UPDATE}, KEY_ID + "=?",
                                                  new String[]{String.valueOf(id)}, null, null, null
                                                 );


        if (cursor != null)
        {
            cursor.moveToFirst();

        }

        return TABLE_RESTAURANTS;
    }
}
