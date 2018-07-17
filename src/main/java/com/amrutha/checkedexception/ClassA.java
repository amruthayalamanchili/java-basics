package com.amrutha.checkedexception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLDataException;

public class ClassA {

    public void methodA() throws FileNotFoundException,SQLDataException,IOException{
         this.methodB();
         throw new FileNotFoundException("\nthis is an Exception");
    }
    public void methodB() throws SQLDataException,IOException{
        this.methodC();
        throw new SQLDataException("\nsql exception");
    }
    public void methodC() throws IOException{

    }
}
