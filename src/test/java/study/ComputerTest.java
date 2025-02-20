package study;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import Computer.Computer;
public class ComputerTest {

  @Test
  void 올바르게_랜덤숫자를_생성하는가(){
    Computer computer = new Computer();
    List<Integer> list = computer.generateRandomNumber();

    assertThat(list.size() == 3).isTrue();
    assertThat(Validator.isDuplicate(list)).isFalse();
    assertThat(Validator.isValidNumberRange(list)).isTrue();
  }


}

class Validator{

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
