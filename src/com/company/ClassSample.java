package com.company;

import java.lang.reflect.Modifier;

public class ClassSample {

    public static void main(String[] args) {
        Class reflectionSampleClass = ReflectionSample.class;
//        System.out.println(reflectionSampleClass.getSimpleName());
//        System.out.println(reflectionSampleClass.getName());
        int modifiers = reflectionSampleClass.getModifiers();
        if (Modifier.isAbstract(modifiers)) {
            System.out.println("Класс абстрактный");
        } else {
            System.out.println("Класс не абстрактный");
        }
        Class superClass = reflectionSampleClass.getSuperclass();
        System.out.println(superClass.getName());
        Class[] interfaces = reflectionSampleClass.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }
    }
}
