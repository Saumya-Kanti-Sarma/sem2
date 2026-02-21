/*
a)Write a Java program to implement methods with variable   length 
arguments  
b)Create a class Person where this keyword is used to differentiate between 
class variables and method parameters. 
c)Create a Counter class with a static field to count the number of objects 
created. Implement a static method to get the count.
*/
class Person {
  String name;
  String address;
  Boolean gender;

  void setDetails(String name, String address, Boolean gender) {
    this.name = name;
    this.address = address;
    this.gender = gender;
  }

}

class Counter {
  static int count;

  Counter() {
    increment();
  }

  public static void increment() {
    count++;
  }
}

public class Practical04 {
  public static void print(Object... x) {
    for (Object X : x) {
      System.out.println(X);
    }
  }

  public static void main(String[] args) {
    print("Hello", "My", "Name", "Is", "Saumya");

    Person p = new Person();
    p.setDetails("Saumya", "Vichumbe Panvel", true);
    print(p.name, p.address, p.gender);

    Counter c1 = new Counter();
    Counter c2 = new Counter();
    Counter c3 = new Counter();
    print(c3.count);
  }
}
