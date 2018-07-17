package com.amrutha.generics;

public class Box<T,N> {
        private T weight;
        private N nameOfTheBox;

        public void set(T weight,N nameOfTheBox) {
                this.weight =  weight;
                this.nameOfTheBox = nameOfTheBox;
        }

        public T getWeight() {
                return weight;
        }
        public N getNameOfTheBox(){
                return nameOfTheBox;
        }
}

