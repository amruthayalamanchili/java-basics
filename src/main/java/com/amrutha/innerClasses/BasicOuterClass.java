package com.amrutha.innerClasses;

public class BasicOuterClass {
    int x;
    int y;
    static final int k = 12;

    public  int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public BasicOuterClass(){

    }

    public  BasicOuterClass(int x,int y){
        this.x = x;
        this.y = y;
    }
    public static class BasicStaticClass{
        BasicOuterClass outerObject1 = new BasicOuterClass();
        int j = outerObject1.getX();
        int z;
        int i =BasicOuterClass.k;

        public BasicStaticClass(int z){
            this.z= z;

        }
        public  int getZ(){
            return z;
        }
    }

}
