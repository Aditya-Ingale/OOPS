package Abstraction;

class GreetingDemo {
    void generateGreeting() {
        // Anonymous inner class implementing Greeting
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello! Greetings from an anonymous inner class.");
            }
        };
        g.sayHello();
    }
}

