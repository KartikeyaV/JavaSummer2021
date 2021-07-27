import java.util.Scanner;

public class MathGame {
  public static void main(String[] args) {
   
    System.out.println("\t\tWelcome to math game");
    String playerName = RUI.readUserStringInput("Enter player name:");
    MathProblem[] problems = new MathProblem[10];
    int counter = 0;
    for(int i =0; i < problems.length; i++) {
      MathProblem problem = new MathProblem();
      problem.generateQuestion();
      problems[i] = problem;
    }
    for(int i = 0; i < problems.length; i ++) {
    	System.out.println("Problem: " + (i+1));
    	problems[i].printProblem();
    	int getAnswer = RUI.readUserIntInput("Enter Answer: ");
    	problems[i].recordAnswer(getAnswer);
    }
    String formatTitle = String.format("%-6s %-11s %-14s %-14s %-6s " , "No.", "Problem" , "User Answer", "Actual Answer", "Result");
    System.out.println(formatTitle);
    System.out.println("----------------------------------------------------------");
    for(int i = 0; i < problems.length; i ++) {
    	String outputResult  = String.format("%-6s %-11s %-14s %-14s %-6s " , (i+1) + ")", problems[i].displayProblem() , problems[i].getUserAnswer(), problems[i].getAnswer(), problems[i].isRightAnswer());
    	System.out.println(outputResult);
    	if (problems[i].isRightAnswer().equals("Right")) {
    		counter++;
    	}
    }
    System.out.println("----------------------------------------------------------");
    
    String formatScore = String.format("%-48s %-6s", "Total", counter + "/" + problems.length);
    System.out.println(formatScore);
    
   
  }
}