public class Inheritance {
  public static void main(String[] args) {
    // Fish shark = new Fish();
    // shark.eat();
    Dog labrador = new Dog();
    labrador.eat();
    labrador.legs = 4;
    System.out.println(labrador.legs);
  }
}

//base class
class Animal {
  String color;
  void eat(){
    System.out.println("eats");
  }

  void breath(){
    System.out.println("breathes");
  }
}

class Mammals extends Animal {
  int legs;
  void walk(){
    System.out.println("walks on legs");
  }

}

class Fish extends Animal {
  int fins;

  void swim(){
    System.out.println("swims in water");
  }
}

class Dog extends Mammals {
  String breed;
  void bark(){
    System.out.println("barks");
  }
}

//derived class
// class Fish extends Animal {
//   int fins;

//   void swim(){
//     System.out.println("swims in water");
//   }
// }