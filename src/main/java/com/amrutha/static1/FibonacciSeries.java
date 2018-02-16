package com.amrutha.static1;

public class FibonacciSeries {
    private int range = 30;
    private int firstNum;
    private int secondNum;
    public FibonacciSeries(int range,int firstNum,int secondNum){
       this.range =range;
       this.firstNum = firstNum;
       this.secondNum = secondNum;
    }
    public int [] mySeries(){
         int [] series = new int[this.range];
        for(int i=2;i<this.range;i++){
            series[0]=this.firstNum;
            series[1]=this.secondNum;
            series[i] = series[i-2]+series[i-1];
        }
        System.out.print("FibonacciSeries:"+this.firstNum+" "+this.secondNum);
        return series;
    }
}
