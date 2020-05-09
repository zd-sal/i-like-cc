
class testdrive {
  public static void main (String [] args) {
    GoodDog one = new GoodDog();
    one.setSize(70);
    //GoodDog two = new GoodDog();
    //two.setSize(8);
    System.out.println("dog one: " + one.getsize());
    //System.out.println("dog two: " + two.getsize());
    one.bark();
  //  two.bark();
  }
}

class GoodDog {
  private int size;
  public int getsize() {
    return size;
  }
  public void setSize(int s) {
    size = s;
  }
  void bark() {
    if (size > 60) {
      System.out.println ("wooof ! wooof");
    } else if (size > 14) {
      System.out.println("ruff ! ruff !");
    } else {
      System.out.println("yip ! yip !");
    }
  }
}
