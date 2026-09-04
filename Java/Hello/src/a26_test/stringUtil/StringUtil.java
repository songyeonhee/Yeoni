package a26_test.stringUtil;

public class StringUtil {
  public static int countChar(String text, char ch) {
    if (text == null) {
      return 0;
    }
    int count = 0;

    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == ch) {
        count++;
      }
    }

    return count;
  }

  public static String reverseString(String text) {
    if (text == null) {
      return null;
    }

    return new StringBuilder(text).reverse().toString();
  }

  public static String toUpperCase(String text) {
    return text.toLowerCase();
  }

  public static String removeSpaces(String text) {
    if (text == null) {
      return null;
    }

    return text.replace(" ", "");
  }
}
