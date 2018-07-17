package com.amrutha.annotations;

import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD,ElementType.TYPE,ElementType.CONSTRUCTOR,
        ElementType.LOCAL_VARIABLE,ElementType.METHOD,ElementType.PACKAGE})
@Retention(RetentionPolicy.RUNTIME)
public @interface preamble {
    String author();
    /*String date();
    int currentRevision()default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    // Note use of array
    String[] reviewers();*/
}
