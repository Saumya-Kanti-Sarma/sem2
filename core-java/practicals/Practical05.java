// Write a Java program to work with constructors, constructor overloading. 
class Person {
  String name;
  String address;
  Long phoneNumber;

  Person(String name) {
    this.name = name;
  }

  Person(String name, String address, Long phoneNumber) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }

  void print() {
    System.out.println(name);
    System.out.println(address);
    System.out.println(phoneNumber);
  }

}

public class Practical05 {
  public static void main(String[] args) {
    Person saumya = new Person("Saumya");
    saumya.print();
    Person roshan = new Person("roshan", "Kameshwar Dharmanagar",
        8794444606l);
    roshan.print();
  }

}
