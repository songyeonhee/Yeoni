package a26_0825.sort.hak3;

import java.util.Comparator;

/**
 * AgeComparator
 */
public class AgeComparator implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    return Integer.compare(o1.getAge(), o2.getAge());
  }

}
