package com.generic_corp.demoapplicationmadebyekaghni;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JSONResponse {
    @SerializedName("datas")
    @Expose
    public Post[] datas;
    public Post[] getDatas(){return datas;}
    public void setDatas(Post[] datas){this.datas=datas;}
}
