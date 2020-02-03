package com.kanlulu.kotlin01;

import android.content.Context;
import android.widget.Toast;

import com.kanlulu.kotlin01.companion.TestCompanion;

/**
 * author:kanlulu
 * data  :2020-02-02 16:29
 **/
public class JavaTest {

    public JavaTest(Context context) {
//        Utils.Test.INSTANCE.message("", context);
        Utils.Test.message("",context);

    }

    /**
     * 伴生对象在java中调用
     */
    public void testCompanion(String str,Context context){
        if (TestCompanion.Companion.isEmpty(str)) {
            Toast.makeText(context,"伴生对象!!!java",Toast.LENGTH_SHORT).show();
        }

    }
}
