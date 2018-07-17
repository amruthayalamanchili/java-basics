package com.amrutha.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class TestAnnotationProcessor {


    public static void main(String [] args) throws NoSuchMethodException, NoSuchFieldException {
        Annotation[] annotationsAtClassLevel = AnnotationClass.class.getAnnotations();
        for(Annotation annotation: annotationsAtClassLevel){
            if(annotation instanceof preamble){
                preamble annotation1 = (preamble) annotation;
                System.out.println("class Annotations:" + annotation1.author());
            }
        }
        Class<AnnotationClass> myClass = AnnotationClass.class;
        Method method = myClass.getMethod("getRegisterNumber",null);
        Annotation [] myAnnotation = method.getDeclaredAnnotations();
        for(Annotation aAnnotation : myAnnotation){
            if(aAnnotation instanceof preamble){
                preamble annotation = (preamble)aAnnotation;
                System.out.println("method Annotations:" + annotation.author());
            }
        }

        Constructor constructor = AnnotationClass.class.getConstructor(String.class,int.class);
        Annotation [] annotation1 = constructor.getDeclaredAnnotations();
        for(Annotation eachAnnotation : annotation1){
            if(eachAnnotation instanceof preamble){
                preamble annotations = (preamble)eachAnnotation;
                System.out.println("constructor annotation:" + annotations.author());
            }
        }

        try {
            Field field = myClass.getField("registerNumber");
            Annotation [] fieldAnnotation = field.getDeclaredAnnotations();
            for(Annotation fAnnotation : fieldAnnotation){
                if(fAnnotation instanceof preamble){
                    preamble fAnnotate = (preamble)fAnnotation;
                    System.out.println("field Annotations:" + fAnnotate.author());
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }


    }
}
