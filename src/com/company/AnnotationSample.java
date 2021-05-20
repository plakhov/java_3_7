package com.company;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AnnotationSample {
    @MyAnnotation(value = "привет", sample = 2)
    public int number;

    @MyAnnotation(value = "пока", sample = 5)
    public int digital;

    public static void main(String[] args) throws NoSuchFieldException {
        Class aClass = AnnotationSample.class;
        Field numberField = aClass.getField("number");
        Field digitalField = aClass.getField("digital");
        MyAnnotation numberFieldAnnotation = numberField.getAnnotation(MyAnnotation.class);
        MyAnnotation digitalFieldAnnotation = digitalField.getAnnotation(MyAnnotation.class);
        System.out.println(numberFieldAnnotation.sample());
        System.out.println(digitalFieldAnnotation.sample());

    }
}
