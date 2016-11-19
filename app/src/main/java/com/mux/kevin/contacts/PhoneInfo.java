package com.mux.kevin.contacts;

import java.util.List;

/**
 * Created by kevin on 2016/11/16.
 */

public class PhoneInfo {

    private static String phoneNumber;
    private static String phoneName;

    public PhoneInfo(String name, String number){
        setPhoneName(name);
        setPhoneNumber(number);
    }

    public static String getPhoneNumber() {
        return phoneNumber;
    }

    public static void setPhoneNumber(String phoneNumber) {
        PhoneInfo.phoneNumber = phoneNumber;
    }

    public static String getPhoneName() {
        return phoneName;
    }

    public static void setPhoneName(String phoneName) {
        PhoneInfo.phoneName = phoneName;
    }
}
