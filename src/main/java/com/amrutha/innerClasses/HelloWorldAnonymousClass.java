package com.amrutha.innerClasses;

public class HelloWorldAnonymousClass {
    interface HelloWorld{
        public void greet();
        public void greetSomeone(String someOne);
        }
        public void sayhello(){
        class EnglishGreeting implements HelloWorld{
            String name = "world";
            @Override
            public void greet() {
                greetSomeone("world");
            }

            @Override
            public void greetSomeone(String someOne) {
                name = someOne;
                System.out.println("hello" + name);

            }
        }
        HelloWorld englishGreeting = new EnglishGreeting();
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            @Override
            public void greet() {
                greetSomeone("tout le monde");
            }

            @Override
            public void greetSomeone(String someOne) {
                name = someOne;
                System.out.println("Salut" + name);
            }
        };
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            @Override
            public void greet() {
                greetSomeone("mundo");
            }

            @Override
            public void greetSomeone(String someOne) {
                name = someOne;
                System.out.println("Hola " + name);
            }
        };
        englishGreeting.greetSomeone(" hi");
        frenchGreeting.greet();
        spanishGreeting.greet();
    }
}
