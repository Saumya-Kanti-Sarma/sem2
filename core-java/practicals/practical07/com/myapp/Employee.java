package com.myapp;

public class Employee {
  private int id, sallary;
  private String name, email, address;

  public Employee(int id, int sallary, String name, String email, String address) {
    this.id = id;
    this.sallary = sallary;
    this.name = name;
    this.email = email;
    this.address = address;
  }

  public Object getValues(String value) {
    // getValues(email) -> returns this.email; getValues(name) -> returns this.name
    switch (value) {
      case "id":
        return id;
      case "address":
        return address;
      case "sallary":
        return sallary;
      case "name":
        return name;
      case "email":
        return email;
      default:
        return "Value: " + value + ", is not available";
    }

  }

}
