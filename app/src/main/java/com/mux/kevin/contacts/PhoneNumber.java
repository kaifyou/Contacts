package com.mux.kevin.contacts;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin on 2016/11/16.
 */

public class PhoneNumber {

    public static String getPhoneNumber(Context context){

        public static List<PhoneInfo> lists = new ArrayList<PhoneInfo>();

        Cursor cursor = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        String phoneNumber;
        String phoneName;
        while (cursor.moveToNext()){
            phoneNumber = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
            phoneName = cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));

            PhoneInfo phoneInfo = new PhoneInfo(phoneName, phoneNumber);
            lists.add(phoneInfo);

            System.out.println(phoneName + phoneNumber);
        }

        return null;
    }
}
