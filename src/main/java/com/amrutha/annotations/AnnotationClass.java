
package com.amrutha.annotations;

import java.util.Map;
@preamble(author = "anu")
public class AnnotationClass {
    @preamble(author= "sri")
    public int registerNumber;
    @preamble(author = "anu")
    public String name;

    @preamble(author = "anu")
    public AnnotationClass(String name,int registerNumber){
        this.name = name;
        this.registerNumber = registerNumber;
    }

    @preamble(author = "hall")
    public String getName(){
        @preamble(author = "anu")
        String studentName = name;
        return studentName;
    }

    @preamble(author = "anu")
    public int getRegisterNumber(){
        return registerNumber;
    }
}
