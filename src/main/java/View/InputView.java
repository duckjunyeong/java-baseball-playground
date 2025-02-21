package View;

import Constant.ExceptionMessage;
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
    throw new IllegalArgumentException(ExceptionMessage.USER_CORRECT_INPUT);
  }

  public int readUserRetryInput(){
    String userInput = scanner.nextLine();
    if (Validator.isValidRetryInput(userInput)){
      return Integer.parseInt(userInput);
    }
    throw new IllegalArgumentException(ExceptionMessage.USER_RETRY_INPUT);
  }

  public List<Integer> convertToList(String str){
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < str.length(); i++){
      list.add(str.charAt(i) - '0');
    }
    return list;
  }


}
