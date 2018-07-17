package com.amrutha.comparable;

public class Fruit  {
    private String Name;
    private float price;

    public Fruit(String Name, float price) {
        this.Name = Name;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return Name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruit)) return false;

        Fruit fruit = (Fruit) o;

        return Name != null ? Name.equals(fruit.Name) : fruit.Name == null;
    }

    @Override
    public int hashCode() {
        return Name != null ? Name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "Name='" + Name + '\'' +
                ", price=" + price +
                '}';
    }

    //    @Override
//    public int compareTo(Fruit o) {
//        if (this.equals(o)) {
//            return 0;
//        } else {
//            String s1 = this.Name.toLowerCase();
//            String s2 = o.Name.toLowerCase();
//            int c1 = s1.charAt(0);
//            int c2 = s2.charAt(0);
//            if(c1 > c2){
//                return 1;
//            }else{
//                return -1;
//            }
//        }
//    }
}
