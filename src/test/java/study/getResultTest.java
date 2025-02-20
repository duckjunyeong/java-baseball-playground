package study;

import org.assertj.core.internal.bytebuddy.implementation.bind.annotation.Argument;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import GameResult.GameResult;

public class getResultTest {

  @ParameterizedTest
  @MethodSource("results")
  void 결과를_도출하는지(List<Integer> computerNumber, List<Integer> userNumber, Map<String, Integer> result){
    GameResult gameResult = new GameResult();
    gameResult.getResult(computerNumber, userNumber);
    System.out.println("스트라이크: " + gameResult.getStrike());
    System.out.println("볼: " + gameResult.getBall());

    assertThat(gameResult.getStrike()).isEqualTo(result.get("스트라이크"));
    assertThat(gameResult.getBall()).isEqualTo(result.get("볼"));
  }


  static Stream<Arguments> results(){
    List<Integer> computerNumber = Arrays.asList(1,2,3);

    List<Integer> userNumber1= Arrays.asList(1,2,3);
    Map<String, Integer> result1 = new HashMap<>();
    result1.put("스트라이크", 3);
    result1.put("볼", 0);

    List<Integer> userNumber2= Arrays.asList(1,3,2);
    Map<String, Integer> result2 = new HashMap<>();
    result2.put("스트라이크", 1);
    result2.put("볼", 2);

    List<Integer> userNumber3= Arrays.asList(4,5,6);
    Map<String, Integer> result3 = new HashMap<>();
    result3.put("스트라이크", 0);
    result3.put("볼", 0);


    return Stream.of(
        Arguments.of(computerNumber, userNumber1, result1),
        Arguments.of(computerNumber, userNumber2, result2),
        Arguments.of(computerNumber, userNumber3, result3)
    );
  }
}
