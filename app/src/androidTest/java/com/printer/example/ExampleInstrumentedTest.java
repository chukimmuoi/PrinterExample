package com.printer.example;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.printer.example.utils.FuncUtils;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
//        Context appContext = InstrumentationRegistry.getTargetContext();
//
//        assertEquals("com.printer.example", appContext.getPackageName());

    }

    @Test
    public void hindiTest(){
        String str = "नमस्कार";
        try {
            byte[] btStr = str.getBytes("UTF-8");
            System.out.println("str111:" + FuncUtils.ByteArrToHex(btStr));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void hebrewTest(){
        String str = "שלום רונגטה ABCDEFGHIJK";
        String strStr = "שלוםABCD רונגטה ABCD";
        String str1 = "123456 שלום רונגטה";
        String str2 = "שלום רונגטה123456";
        String str3 = "שלום ABCD רונגטה";
        String str4 = "12ABCD שלום רונגטה";
        String str5 = "ABCD שלום רונגטה";
        String str11 = "ABCD שלום רונגטה";
        String str12 = "123 שלום רונגטה";
        String str13 = "ABCD123 שלום רונגטה";
        String str14 = "123ABCD שלום רונגטה";
        String str15 = "123ABCD123 שלום רונגטה";
        try {
            byte[] btStr = str.getBytes("UTF-8");
            byte[] btStrStr = strStr.getBytes("UTF-8");
            byte[] btStr1 = str1.getBytes("UTF-8");
            byte[] btStr2 = str2.getBytes("UTF-8");
            byte[] btStr3 = str3.getBytes("UTF-8");
            byte[] btStr4 = str4.getBytes("UTF-8");
            byte[] btStr5 = str5.getBytes("UTF-8");

            Log.e("Fuuu", "str:" + FuncUtils.ByteArrToHex(btStr));
            Log.e("Fuuu", "strStr:" + FuncUtils.ByteArrToHex(btStrStr));
            Log.e("Fuuu", "str1:" + FuncUtils.ByteArrToHex(btStr1));
            Log.e("Fuuu", "str2:" + FuncUtils.ByteArrToHex(btStr2));
            Log.e("Fuuu", "str3:" + FuncUtils.ByteArrToHex(btStr3));
            Log.e("Fuuu", "str4:" + FuncUtils.ByteArrToHex(btStr4));
            Log.e("Fuuu", "str5:" + FuncUtils.ByteArrToHex(btStr5));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void hTest2(){
        String str = "שלום רונגטה";
        String str21 = "שלום רונגטה !\"#$%&'()*+,-./";
        String str22 = "שלום רונגטה 0123456789";
        String str23 = "שלום רונגטה :;<=>?@";
        String str24 = "שלום רונגטה ABCDEF";
        String str25 = "שלום רונגטה [\\]^`";
        String str26 = "שלום רונגטה abcxyz";
        String str27 = "שלום רונגטה {|}~";
        String str211 = " !\"#$%&'()*+,-./ שלום רונגטה";
        String str222 = " 0123456789 שלום רונגטה";
        String str233 = " :;<=>?@ שלום רונגטה";
        String str244 = "ABCD שלום רונגטה";
        String str255 = " [\\]^` שלום רונגטה";
        String str266 = " abcxyz שלום רונגטה";
        String str277 = " {|}~ שלום רונגטה";
        try {
            byte[] btStr21 = str21.getBytes("UTF-8");
            byte[] btStr22 = str22.getBytes("UTF-8");
            byte[] btStr23 = str23.getBytes("UTF-8");
            byte[] btStr24 = str24.getBytes("UTF-8");
            byte[] btStr25 = str25.getBytes("UTF-8");
            byte[] btStr26 = str26.getBytes("UTF-8");
            byte[] btStr27 = str27.getBytes("UTF-8");
            byte[] btStr211 = str211.getBytes("UTF-8");
            byte[] btStr222 = str222.getBytes("UTF-8");
            byte[] btStr233 = str233.getBytes("UTF-8");
            byte[] btStr244 = str244.getBytes("UTF-8");
            byte[] btStr255 = str255.getBytes("UTF-8");
            byte[] btStr266 = str266.getBytes("UTF-8");
            byte[] btStr277 = str277.getBytes("UTF-8");

//            Log.e("Fuuu", "str21:  " + FuncUtils.ByteArrToHex(btStr21));
//            Log.e("Fuuu", "str22:  " + FuncUtils.ByteArrToHex(btStr22));
//            Log.e("Fuuu", "str23:  " + FuncUtils.ByteArrToHex(btStr23));
//            Log.e("Fuuu", "str24:  " + FuncUtils.ByteArrToHex(btStr24));
//            Log.e("Fuuu", "str25:  " + FuncUtils.ByteArrToHex(btStr25));
//            Log.e("Fuuu", "str26:  " + FuncUtils.ByteArrToHex(btStr26));
//            Log.e("Fuuu", "str27:  " + FuncUtils.ByteArrToHex(btStr27));
            Log.e("Fuuu", "str211:  " + FuncUtils.ByteArrToHex(btStr211));
            Log.e("Fuuu", "str222:  " + FuncUtils.ByteArrToHex(btStr222));
            Log.e("Fuuu", "str233:  " + FuncUtils.ByteArrToHex(btStr233));
            Log.e("Fuuu", "str244:  " + FuncUtils.ByteArrToHex(btStr244));
            Log.e("Fuuu", "str255:  " + FuncUtils.ByteArrToHex(btStr255));
            Log.e("Fuuu", "str266:  " + FuncUtils.ByteArrToHex(btStr266));
            Log.e("Fuuu", "str277:  " + FuncUtils.ByteArrToHex(btStr277));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void hTest3(){
//        String str = "שלום רונגטה";
//        String str24 = "שלום רונגטה abcd";
//        String str244 = "abcd שלום רונגטה";
        String str31 = "123456 שלום רונגטה";
        String str32 = "!@#$% aשלום רונגטה";
        try {
//            byte[] btStr24 = str24.getBytes("UTF-8");
//            byte[] btStr244 = str244.getBytes("UTF-8");
            byte[] btStr31 = str31.getBytes("UTF-8");
            byte[] btStr32 = str32.getBytes("UTF-8");

//            Log.e("Fuuu", "str24:  " + FuncUtils.ByteArrToHex(btStr24));
//            Log.e("Fuuu", "str244:  " + FuncUtils.ByteArrToHex(btStr244));
            Log.e("Fuuu", "str31:  " + FuncUtils.ByteArrToHex(btStr31));
            Log.e("Fuuu", "str32:  " + FuncUtils.ByteArrToHex(btStr32));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
