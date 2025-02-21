package Model;

import java.util.List;

public class GameResult {
  private int strike;
  private int ball;

  public void resetScore(){
    strike = 0;
    ball = 0;
  }

  public void getResult(List<Integer> computerNumber, List<Integer> userNumber){
    resetScore();
    for (int i = 0; i < computerNumber.size(); i++){
      increaseStrike(computerNumber.get(i), userNumber.get(i));
      increaseBall(computerNumber.get(i), userNumber.get(i), computerNumber);
    }
  }

  public void increaseStrike(int computerNumber, int userNumber){
    if (computerNumber == userNumber){
      ++strike;
    }
  }

  public void increaseBall(int computerNumber, int userNumber, List<Integer> computer){
    if (computerNumber != userNumber && computer.contains(userNumber)){
      ++ball;
    }
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
