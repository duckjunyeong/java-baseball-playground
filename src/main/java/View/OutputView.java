package View;

import Model.GameResult;
import Constant.Message;
public class OutputView {

  public void printGameStart(){
    System.out.println(Message.GAME_START);
  }

  public void printGameResult(GameResult result){
    int strike = result.getStrike();
    int ball = result.getBall();

    if (strike == 0 && ball == 0){
      System.out.println("낫싱");
      return;
    }
    String outputStr = addStr("볼", ball) + addStr("스트라이크", strike);
    outputStr.trim();
    System.out.println(outputStr);
  }

  public void printGameRetry(){
    System.out.println(Message.GAME_RETRY);
  }

  public void printGameEnd(){
    System.out.println(Message.GAME_END);
  }

  public String addStr(String str, int num){
    if (num == 0){
      return "";
    }
    return num + str + " ";
  }
}
