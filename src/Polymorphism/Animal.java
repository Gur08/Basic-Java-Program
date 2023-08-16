package Polymorphism;

public class Animal {
    public String makeSound(){
        return null;
    }
}
class Dog extends Animal{
    String sound="Dog Bark";
    public String makeSound(){
        return sound;
    }
}
class Cat extends Animal{
    String sound ="Meow";
    public String makeSound(){
        return sound;
    }
}
class AnimalMain{
    public static void main(String[] args) {
        Animal animal =new Dog();
        System.out.println("Dog Noise : "+animal.makeSound());
    Animal animal1=new Cat();
        System.out.println("Cat Noise :"+animal1.makeSound());
    }
}
//Final ----> if final keyword is used infront of the class it cannot we inherited
// Final -----> if used infront of method it cannot we used again
//Final ----> infront of the variable it cannot be changed or its constant
// All the string class are final class