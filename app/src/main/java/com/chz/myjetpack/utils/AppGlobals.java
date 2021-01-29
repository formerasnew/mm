package com.chz.myjetpack.utils;

import android.app.Application;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AppGlobals {
    private static Application sApplication;
    public static Application getApplication(){
        if(sApplication==null){
            try {
                //反射拿到currentApplication
                Method method = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication");
                try {
                    //调用的时候传入null
                    sApplication = (Application) method.invoke(null, (Object[]) null);

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return sApplication;
    }
}
