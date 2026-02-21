import java.util.ArrayList;
import java.util.Vector;

public class Practical08 {
  public static void main(String[] args) {

    // ArrayList operations
    System.out.println("=== ArrayList Operations ===");
    ArrayList<String> fruits = new ArrayList<>();

    // Add elements
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");
    fruits.add("Mango");
    System.out.println("After adding: " + fruits);

    // Remove element
    fruits.remove("Banana");
    System.out.println("After removing 'Banana': " + fruits);

    // Iterate using enhanced for loop
    System.out.println("Iterating ArrayList:");
    for (String fruit : fruits) {
      System.out.println("  " + fruit);
    }

    // Vector operations
    System.out.println("\n=== Vector Operations ===");
    Vector<Integer> numbers = new Vector<>();

    // Add elements
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    System.out.println("Vector: " + numbers);
    System.out.println("Size: " + numbers.size());
    System.out.println("Capacity: " + numbers.capacity());

    // Get element
    System.out.println("Element at index 2: " + numbers.get(2));

    // Remove element
    numbers.remove(Integer.valueOf(20));
    System.out.println("After removing 20: " + numbers);
  }
}