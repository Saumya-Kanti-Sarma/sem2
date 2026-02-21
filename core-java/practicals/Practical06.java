public class Practical06 {

  public static void main(String[] args) {
    try {
      int[] numbers = { 1, 2, 3 };
      System.out.println("Accessing array element: " + numbers[5]);
      // int result = 10 / 0;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
    } catch (ArithmeticException e) {
      System.out.println("Caught ArithmeticException: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Caught Exception: " + e.getMessage());
    } finally {
      System.out.println("Finally block executed - cleanup resources");
    }
  }

}
