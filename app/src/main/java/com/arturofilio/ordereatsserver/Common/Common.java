package com.arturofilio.ordereatsserver.Common;

import com.arturofilio.ordereatsserver.Model.Request;
import com.arturofilio.ordereatsserver.Model.User;

public class Common {

    public static User currentUser;
    public static Request currentRequest;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";

    public static final int PICK_IMAGE_REQUEST =  71;

    public static String convertCodeToStatus(String code) {
        if(code.equals("0")) {
            return "Placed";
        } else if (code.equals("1")) {
            return "On my way";
        } else {
            return "Shipped";
        }
    }
}
