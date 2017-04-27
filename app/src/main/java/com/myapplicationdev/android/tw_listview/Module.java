package com.myapplicationdev.android.tw_listview;

/**
 * Created by 15056130 on 4/27/2017.
 */

public class Module {
    private String code;
    private boolean prog;
    public Module(String code, boolean prog){
        this.code = code;
        this.prog = prog;
    }
    public String getCode(){
        return code;
    }
    public boolean isProg(){
        return prog;
    }
}
