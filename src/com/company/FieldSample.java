package com.company;

import java.lang.reflect.Field;

public class FieldSample {

    public static void main(String[] args) {
        ReflectionSample reflectionObject = new ReflectionSample();
        Class reflectionSampleClass = ReflectionSample.class;
//        Field[] fields = reflectionSampleClass.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field.getType() + ":"+field.getName());
//        }
        try {
            Field field = reflectionSampleClass.getDeclaredField("number");
            System.out.println(reflectionObject.getNumber());
            field.setAccessible(true);
            field.set(reflectionObject, 7);
            System.out.println(field.get(reflectionObject));
            System.out.println(reflectionObject.getNumber());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
