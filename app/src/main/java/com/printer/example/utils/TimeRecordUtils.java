package com.printer.example.utils;

import android.util.Log;

/**
 * Project: PrintSet0517<br/>
 * Created by Tony on 2018/6/25.<br/>
 * Description:
 */

public class TimeRecordUtils {

    public synchronized static void record(String describe, long timemills){
        Log.e("Fu", timemills + "\t" + describe);
    }

}
