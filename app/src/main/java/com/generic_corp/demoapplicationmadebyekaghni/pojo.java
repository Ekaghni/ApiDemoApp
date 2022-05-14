package com.generic_corp.demoapplicationmadebyekaghni;

import com.google.gson.JsonObject;

import java.util.ArrayList;

public class pojo {

    private String status;
    ArrayList< Object > data = new ArrayList < Object > ();
    private String message;

    public ArrayList<Object> getData() {
        JsonObject jsonObject = new JsonObject();

        return data;
    }
    // Getter Methods

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    // Setter Methods

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}


