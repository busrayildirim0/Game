
package newpackage;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int userScore = 0;
        int computerScore = 0;
        System.out.println("Welcome to the Rock Paper Scissors game!");
        System.out.println("1-Rock 2-Paper 3-Scissors");
        
        while(true) {
            System.out.println("Your choice: ");
            int choice = s.nextInt();
            int computerChoice = (int)(Math.random() * 3) + 1;

            if (choice == 1) {
                if (computerChoice == 1) {
                    System.out.println("Computer's choice: Rock\nResult: Tie");
                    System.out.println("Your score: " + userScore + " Computer's score: " + computerScore);
                } else if (computerChoice == 2) {
                    System.out.println("Computer's choice: Paper\nResult: You lost");
                    computerScore++;
                    System.out.println("Your score: " + userScore + " Computer's score: " + computerScore);
                } else {
                    System.out.println("Computer's choice: Scissors\nResult: You won");
                    userScore++;
                    System.out.println("Your score: " + userScore + " Computer's score: " + computerScore);
                }
            } else if (choice == 2) {
                if (computerChoice == 1) {
                    System.out.println("Computer's choice: Rock\nResult: You won");
                    userScore++;
                    System.out.println("Your score: " + userScore + " Computer's score: " + computerScore);
                } else if (computerChoice == 2) {
                    System.out.println("Computer's choice: Paper\nResult: Tie");
                    System.out.println("Your score: " + userScore + " Computer's score: " + computerScore);
                } else {
                    System.out.println("Computer's choice: Scissors\nResult: You lost");
                    computerScore++;
                    System.out.println("Your score: " + userScore + " Computer's score: " + computerScore);
                }
            } else if (choice == 3) {
                if (computerChoice == 1) {
                    System.out.println("Computer's choice: Rock\nResult: You lost");
                    computerScore++;
                    System.out.println("Your score: " + userScore + " Computer's score: " + computerScore);
                } else if (computerChoice == 2) {
                    System.out.println("Computer's choice: Paper\nResult: You won");
                    userScore++;
                    System.out.println("Your score: " + userScore + " Computer's score: " + computerScore);
                } else {
                    System.out.println("Computer's choice: Scissors\nResult: Tie");
                    System.out.println("Your score: " + userScore + " Computer's score: " + computerScore);
                }
            } else {
                System.out.println("Invalid input, please try again.");
                continue;
            }

            if (userScore == 3) {
                System.out.println("You won the game " + userScore + "-" + computerScore);
                break;
            } else if (computerScore == 3) {
                System.out.println("You lost the game " + computerScore + "-" + userScore);
                break;
            }
        }
        s.close();
    }
}
