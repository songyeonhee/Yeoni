package a26_0914;

import java.util.HashMap;

public class Ex28 {
  public static void main(String[] args) {
    HashMap<String, Integer> scores = new HashMap<>();
    scores.put("국어", 90);
    scores.put("수학", 80);

    System.out.println(scores.get("국어"));
  }
}