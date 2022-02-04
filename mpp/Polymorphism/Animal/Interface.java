package mpp.Polymorphism.Animal;

import java.util.ArrayList;
import java.util.List;

public class Interface {
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    Chicken chicken = new Chicken();
    List<Animal> animals = new ArrayList<>();
    animals.add(dog);
    animals.add(cat);
    animals.add(chicken);
    int sum = 0;
    for (Animal animal : animals) {
      sum = sum + animal.countFingers();
    }
    System.out.println("Total finger: " + sum);
  }
}

class Dog implements Animal {
  @Override
  public int countFingers() {
    // TODO Auto-generated method stub
    return 4;
  }
}

class Cat implements Animal {
  @Override
  public int countFingers() {
    // TODO Auto-generated method stub
    return 4;
  }
}

class Chicken implements Animal {
  @Override
  public int countFingers() {
    // TODO Auto-generated method stub
    return 2;
  }
}

interface Animal {
  public int countFingers();
}