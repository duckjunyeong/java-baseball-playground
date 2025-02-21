package Model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validator {

  public static boolean isValidInput(List<Integer> list){
    return list.size() == 3 && !isDuplicate(list) && isValidNumberRange(list);
  }

  public static boolean isValidRetryInput(String str){
    return str.length() == 1 && (str.charAt(0) == '1' || str.charAt(0) == '2');
  }

  public static boolean isDuplicate(List<Integer> list){
    Set<Integer> set = new HashSet<>(list);
    return set.size() != list.size();
  }

  public static boolean isValidNumberRange(List<Integer> list){
    for (int number: list){
      if (number < 1 || number > 9){
        return false;
      }
    }
    return true;
  }
}