package javabasic;
//추상 클래스 예제
abstract class Animal {
    abstract void cry();
}

class Dog extends Animal {
    void cry() {
        System.out.println("bark");
    }
}

class Cat extends Animal {
    void cry() {
        System.out.println("meow");
    }
}
public class Ex01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        dog.cry();
        cat.cry();        
    }
}
