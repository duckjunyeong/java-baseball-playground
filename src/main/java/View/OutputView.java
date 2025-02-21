package View;

import Model.GameResult;

public class OutputView {

  public void printGameStart(){
    System.out.println("게임을 시작합니다.");
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

  public String addStr(String str, int num){
    if (num == 0){
      return "";
    }
    return num + str + " ";
  }

  public void printGameEnd(){
    System.out.println("게임이 시작되었습니다.");
  }
}
