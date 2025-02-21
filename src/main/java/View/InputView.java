package View;

import Model.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

  public static final Scanner scanner = new Scanner(System.in);

  public List<Integer> readUserInput(){
    String userInput = scanner.nextLine();
    List<Integer> arrayUserInput = convertToList(userInput);
    if (Validator.isValidInput(arrayUserInput)){
      return arrayUserInput;
    }
    throw new IllegalArgumentException("사용자의 입력이 잘 못 되었습니다.");
  }

  public List<Integer> convertToList(String str){
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < str.length(); i++){
      list.add(str.charAt(i) - '0');
    }
    return list;
  }

  public boolean isDone(){
    System.out.println("game is Done, if you want retry push 1, or not 2");
    String input = scanner.nextLine();
    if (!Validator.isValidRetryInput(input)){
      throw new IllegalArgumentException("사용자의 입력이 잘 못 되었습니다.");
    }
    if (input.charAt(0) == '1'){
      return false;
    }
    return true;
  }

}
