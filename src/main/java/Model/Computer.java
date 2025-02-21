package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {

  private List<Integer> numbers;
  public static final Random random = new Random();

  public List<Integer> generateRandomNumber(){
    List<Integer> list = new ArrayList<>();

    while (list.size() < 3){
      int randomNumber = random.nextInt(9) + 1;
      addList(list, randomNumber);
    }
    numbers = list;
    return list;
  }

  public void addList(List<Integer> list, int randomNumber){
    if (!list.contains(randomNumber)){
      list.add(randomNumber);
    }
  }

  public List<Integer> getNumbers(){
    return numbers;
  }
}
