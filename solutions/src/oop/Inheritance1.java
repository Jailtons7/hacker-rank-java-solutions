/*
Task:
Implement a sing method in the class Bird

Expected Output:
I am walking
I am flying
I am singing
 */
package oop;


public class Inheritance1 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}


class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}


class Bird extends Animal {
    void fly(){
        System.out.println("I am flying");
    }

    public void sing() {
        System.out.println("I am singing");
    }
}
