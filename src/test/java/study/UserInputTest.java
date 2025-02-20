package study;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import Model.Validator;

public class UserInputTest {

  @ParameterizedTest
  @MethodSource("correctUserInput")
  void 옳은_값을_입력했을때(List<Integer> userInput){
    Validator validator = new Validator();
    assertThat(validator.isValidInput(userInput)).isTrue();
  }

  @ParameterizedTest
  @MethodSource("incorrectUserInput")
  void 틀린_값을_입력했을때(List<Integer> userInput){
    Validator validator = new Validator();
    assertThat(validator.isValidInput(userInput)).isFalse();
  }


  static Stream<List<Integer>> correctUserInput(){
    return Stream.of(
        Arrays.asList(1,2,3),
        Arrays.asList(4,5,6),
        Arrays.asList(9,1,2)
    );
  }

  static Stream<List<Integer>> incorrectUserInput(){
    return Stream.of(
        Arrays.asList(1,2,2),
        Arrays.asList(4,5,16),
        Arrays.asList(9,0,2)
    );
  }
}
