import java.util.Arrays;

public class Practical02 {
  public static int factorial(int num) {
    int result = 1;
    for (int i = 1; i <= num; i++) {
      result *= i;
    }
    return result;
  }

  public static boolean armstrong(int num) {
    int temp = num;
    int result = 0;

    int len = Integer.toString(num).length();

    while (num > 0) {
      int digit = num % 10;
      int power = 1;

      for (int i = 0; i < len; i++) {
        power *= digit;
      }

      result += power;
      num /= 10;
    }

    return result == temp;
  }

  public static Boolean prime(int num) {
    int res = 0;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        res = 1;
      }
    }
    return res == 0;
  }

  public static boolean pallindrome(String str) {
    char[] chars = str.toCharArray();
    char[] reverse = new char[chars.length];
    int counter = chars.length - 1;
    for (int i = chars.length - 1; i >= 0; i--) {
      reverse[i] = chars[counter - i];
    }

    return Arrays.equals(chars, reverse);
  }

  public static String days(int day) {
    switch (day) {
      case 1:
        return "Sunday";
      case 2:
        return "Monday";
      case 3:
        return "Tuesday";
      case 4:
        return "Wednesday";
      case 5:
        return "Thursday";
      case 6:
        return "Friday";
      case 7:
        return "Saturday";
      default:
        return "number must be between 1-7";
    }
  }

  public static void main(String[] args) {
    System.out.println(days(5));
  }
}
