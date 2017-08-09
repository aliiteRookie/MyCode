package com.example.free.mymvpdemo.bean.eventBean;

/**
 * Created by free on 2017/8/9.
 */

public class MyAction {

    private String textString;
    private int showNumber;

    public MyAction(String textString, int showNumber) {
        this.textString = textString;
        this.showNumber = showNumber;
    }

    public String getTextString() {
        return textString;
    }


    public int getShowNumber() {
        return showNumber;
    }

}
