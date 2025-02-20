package Model;

import java.util.List;

public class GameResult {
  private int strike;
  private int ball;

  public void getResult(List<Integer> computerNumber, List<Integer> userNumber){
    int strike = 0;
    int ball = 0;

    for (int i = 0; i < computerNumber.size(); i++){
      if (computerNumber.get(i) == userNumber.get(i)){
        ++strike;
      }else if (computerNumber.contains(userNumber.get(i))){
        ++ball;
      }
    }

    this.strike = strike;
    this.ball = ball;
  }

  public boolean isAllStrike(){
    return strike == 3;
  }


  public void setStrike(int strike){
    this.strike += strike;
  }

  public int getStrike(){
    return strike;
  }

  public void setBall(int ball){
    this.ball += ball;
  }

  public int getBall(){
    return ball;
  }
}
