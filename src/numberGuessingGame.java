import java.util.Scanner;

public class numberGuessingGame {

    public static void main(String[]args) {

        Scanner keyboard = new Scanner(System.in);
        int systemNumber;
        int playerGuess;
        int playerChoice;
        boolean wonGame;
        int numberOfGuesses;
        boolean playAgain;

        playAgain = false;


        while (playAgain==false) {

            wonGame = false;
            numberOfGuesses = 10;


            systemNumber = (int) (Math.random() * 100);

            System.out.println("System has given you a number, between 1-100");


            while (!wonGame && numberOfGuesses > 0) {
                System.out.println("try and guess it.");
                playerGuess = keyboard.nextInt();
                if (playerGuess > systemNumber) {
                    System.out.println("That's too high go lower ");
                } else if (playerGuess < systemNumber) {
                    System.out.println("That's too low go higher");
                } else if (playerGuess == systemNumber) {
                    wonGame = true;
                }

                numberOfGuesses--;
            }

            if (wonGame == true) {
                System.out.println("You won! Great job.");
                System.out.println("You had " + numberOfGuesses + " guess/es left");
            }

            else if (wonGame == false) {
                System.out.println("How could you not even guess a number?");
                System.out.println("Your number was " + systemNumber);
            }
            System.out.println("Would you like to play again? 1=Yes 2=No");
            playerChoice = keyboard.nextInt();


            if (playerChoice == 2) {
                System.out.println("Thanks for playing!");
                playAgain = true;

            }
            if (playerChoice == 1){
                playAgain = false;
            }

        }

    }



}