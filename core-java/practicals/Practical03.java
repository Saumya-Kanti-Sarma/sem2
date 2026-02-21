
/*
Write a Java program to perform  
  a)write a program to find the maximum and minimum of  n elements. 
  b)Create a program that searches for a given element in an array of size n. 
  c)Write a program to add and multiply two matrices represented by 2D arrays. 
*/
import java.util.Arrays;

public class Practical03 {
  public static int[] minMax(int[] numbers) {
    Arrays.sort(numbers);
    int[] res = new int[2];
    res[0] = numbers[0];
    res[1] = numbers[numbers.length - 1];

    return res;
  }

  public static boolean search(int[] array, int target) {
    Arrays.sort(array);
    return Arrays.binarySearch(array, target) > 0;
  }

  public static void main(String[] args) {
    int[] numbers = { 43, 91, 75, 03 };
    int[] res = minMax(numbers);
    System.out.println("Minimum: " + res[0]);
    System.out.println("Maximum: " + res[1]);

    System.out.println(search(numbers, 91));
  }
}
