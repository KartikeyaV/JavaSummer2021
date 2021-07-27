import java.util.Random;

public class MathProblem {
 
  public static char[] operations = {'+', '-', '*', '/', '%'};
 
  private int num1;
  private int num2;
  private char operation;
  private int playerAnswer;
  private int actualAnswer;
  public int counter;
 
  public void generateQuestion() {
	  num1 = new Random().nextInt(100);
	  num2 = new Random().nextInt(100);
	  int rndArrayIndex = new Random().nextInt(operations.length);
	  operation = operations[rndArrayIndex];
  }
 

  public void printProblem() {
	  System.out.println("\t\t" + num1);
	  System.out.println("\t" + operation + "\t" + num2);
	  System.out.println("-------------------");
  }

  public void recordAnswer(int aAnswer) {
    playerAnswer = aAnswer;
  }
  public int getUserAnswer() {
	  return playerAnswer;
  }

  public int getAnswer () {
	  if(operation == '+') {
		  actualAnswer = num1 + num2;
	  } else if (operation == '-') {
		  actualAnswer = num1 - num2;
	  } else if (operation == '*') {
		  actualAnswer = num1 * num2;
	  } else if (operation == '/') {
		  actualAnswer = num1 / num2;
	  } else if (operation == '%') {
		  actualAnswer = num1 % num2;
	  }
	  return actualAnswer;
  }
 
 
  public String isRightAnswer() {
	  if (actualAnswer == playerAnswer) {
		  counter++;
		  return "Right";
	  } else {
		  return "Wrong";
	  }
  }
  public int returnCounter() {
	  return counter;
  }
  
  public String displayProblem() {
		return num1 + " " + operation + " " + num2 + " =";
	}
}

	

