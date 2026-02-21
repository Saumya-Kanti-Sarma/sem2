package utils;

import java.security.MessageDigest;

public class HashUtil {

  public static String generateHash(String input) {
    try {
      MessageDigest digest = MessageDigest.getInstance("SHA-256");
      byte[] binaryHashArray = digest.digest(input.getBytes());

      StringBuilder hashString = new StringBuilder();
      for (byte b : binaryHashArray) {
        hashString.append(Integer.toHexString(0xFF & b));
      }
      return hashString.toString();

    } catch (Exception e) {
      throw new RuntimeException("SHA-256 not available", e);
    }
  }

  public static boolean checkHash(String input, String hashVal) {
    return generateHash(input).equals(hashVal);
  }

  public static void main(String[] args) {
    System.out.print(generateHash("Helloo"));
  }
}
