package Controller;

import Constant.GameStatus;
import Model.Computer;
import Model.GameResult;
import View.InputView;
import View.OutputView;

import java.util.List;

public class Game {
  private int status;
  public Computer computer;
  public InputView inputView;
  public OutputView outputView;

  public Game(){
    status = GameStatus.ONGAME;
    computer = new Computer();
    inputView = new InputView();
    outputView = new OutputView();
  }

  public void play(){
    outputView.printGameStart();
    do{
      computer.generateRandomNumber();
      playRound();
    } while(!isDone());
  }

  public boolean isDone(){
    return status == GameStatus.EXIT;
  }

  public void playRound(){
    while(true){
      List<Integer> userInput = inputView.readUserInput();
      GameResult result = new GameResult();
      result.getResult(computer.getNumbers(), userInput);
      outputView.printGameResult(result);
      if (result.isAllStrike()){
        outputView.printGameRetry();
        status = inputView.readUserRetryInput();
        return;
      }
    }
  }
}
