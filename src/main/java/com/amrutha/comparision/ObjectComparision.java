package com.amrutha.comparision;

public class ObjectComparision {
    private int a;
    private String b;
    public ObjectComparision(int a,String b){
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjectComparision)) return false;

        ObjectComparision that = (ObjectComparision) o;

        if (a != that.a) return false;
        return b.equals(that.b);
    }

    @Override
    public String toString() {
        return "ObjectComparision{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b.hashCode();
        return result;
    }

    //    @Override
//    public boolean equals(Object obj){
//        if(obj == null){
//            return false;
//        }else if(obj instanceof ObjectComparision){
//            if(this == obj){
//                return true;
//            }else{
//                ObjectComparision e = (ObjectComparision)obj;
//                if(this.a == e.a && this.b == null && e.b == null){
//                    return true;
//                }else if(this.a == e.a &&this.b != null){
//                    return this.b.equals(e.b);
//                }
//            }
//
//        }else{
//            return false;
//        }return false;
//    }
}
