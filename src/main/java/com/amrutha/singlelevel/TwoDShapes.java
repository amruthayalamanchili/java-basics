package com.amrutha.singlelevel;

public abstract class TwoDShapes {
    private String shapeName;
    private String color;
    private boolean isFilled;
    public TwoDShapes(String ShapeName,String color,boolean isFilled){
        this.shapeName = ShapeName;
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getshapeName() {
        return this.shapeName;
    }

    public String getColor(){
        return this.color;
    }

    public boolean isFilled(){
        return this.isFilled;
    }

    public abstract float area();
    public abstract float perimeter();
}
