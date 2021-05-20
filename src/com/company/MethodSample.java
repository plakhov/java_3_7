package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodSample {
    public static void main(String[] args) {
        Class stringClass = String.class;
        try {
            Method method = stringClass.getMethod("getChars", int.class, int.class, char[].class, int.class);
            String stringObject = "Привет, java";
            char[] objectArray = new char[4];
            char[] reflectionArray = new char[4];
            stringObject.getChars(0, 4,objectArray, 0);
            System.out.println(Arrays.toString(objectArray));
            Object reflectionResult = method.invoke(stringObject, 0,3,reflectionArray, 0);
            System.out.println(reflectionResult);
            System.out.println(Arrays.toString(reflectionArray));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
