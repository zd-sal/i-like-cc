class DogTestDrive {

  public static void main (String[] args) {
    Dog one = new Dog();
    one.size = 70;
    Dog two = new Dog();
    two.size = 8;
    Dog three = new Dog();
    three.size = 36;

    one.bark(20);
    two.bark(20);
    three.bark(20);
  }
}

class Dog{
  int size;
  String name;

  void bark(int barknumber) {
    if (size > 60) {
      while (barknumber > 0){
      System.out.println("woof woof");
      barknumber = barknumber - 1;
    }
    } else if (size > 14) {
      while (barknumber > 0){
        System.out.println("ruff ruff");
      barknumber = barknumber - 1;
      }
    } else {
      while (barknumber > 0) {
        System.out.println("yip yip");
        barknumber = barknumber - 1;
     }
    }
  }
}
