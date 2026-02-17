import java.util.Scanner;

public class Practical01 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number: ");
    int num = sc.nextInt();
    sc.close();
    for (int i = 1; i < 11; i++) {
      System.out.println(num + "x" + i + "= " + (num * i));
    }

  }
}
