import java.util.Scanner;

public class numberGuessingGame {

    public static void main(String[]args) {

        Scanner keyboard = new Scanner(System.in);
        int systemNumber;
        int playerGuess;
        boolean wonGame;
        int numberOfGuesses;

        wonGame = false;
        numberOfGuesses = 6;



        systemNumber = (int)(Math.random()*100);

        System.out.println("System has given you a number, between 1-100");
        System.out.println(systemNumber);


        while (!wonGame && numberOfGuesses>0) {
            System.out.println("try and guess it.");
            playerGuess = keyboard.nextInt();
            if (playerGuess > systemNumber){
                System.out.println("That's too high go lower ");
            }
            else if (playerGuess < systemNumber){
                System.out.println("That's too low go higher");
            }
            else if (playerGuess == systemNumber){
                System.out.println("Good job you chose the correct number!");
                wonGame = true;
            }

            numberOfGuesses --;
        }

        System.out.println("Thanks for playing");
        System.out.println("You had "+ numberOfGuesses + " guess/es left" );


        }



    }