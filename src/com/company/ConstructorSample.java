package com.company;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorSample {
    public static void main(String[] args) {
        Class stringClass = String.class;
        String s = new String(new char[]{'j', 'a', 'v', 'a'});
        try {
            Constructor charConstructor = stringClass.getConstructor(char[].class);
            Object stringObject = charConstructor.newInstance(new char[]{'j','a','v','a'});
            if (stringObject instanceof String) {
                System.out.println(stringObject);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
