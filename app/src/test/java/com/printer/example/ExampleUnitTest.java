package com.printer.example;


import com.printer.example.utils.FuncUtils;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
//        assertEquals(4, 2 + 2);
//        byte[] bts = FuncUtils.HexToByteArr("03 FF 2f 00");
//        System.out.println("str:" + FuncUtils.ByteArrToHex(bts));
        String str = "नमस्कार";
        try {
            byte[] btStr = str.getBytes("UTF-8");
            System.out.println("str111:" + FuncUtils.ByteArrToHex(btStr));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}