# CODESOFT import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber
 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Random num= new Random();
        int maxAttempts=3;
        int min=1;
        int max=100;
        int RoundsWon=0;
        System.out.println("Welcome to Guess The Number Game!");
        boolean PlayAgain=true;
        while(PlayAgain){
            int secretNumber=num.nextInt(100)+1;
            int attempts=0;
            boolean correctguess=false;
            System.out.println("Guess the secret number between 1-100");
            System.out.println("you have "+maxAttempts+ " attempts.");
            while(attempts<maxAttempts){
            System.out.println("Enter you guess: ");
            int numGuess=sc.nextInt();
            attempts++;
            if(numGuess==secretNumber){
            System.out.println("Correct! number guessed correctly in"+attempts+"attempts.");
             RoundsWon++;
             correctguess=true;
             break;
            }else if (numGuess<secretNumber){
            System.out.println("Too low! Try a higher number. ");
            } else {
            System.out.println("Too high! Try a lower number. ");
            }
            System.out.println("Total Attempts left : "+(maxAttempts-attempts));
            }
            if(!correctguess){
            System.out.println("you're out of attempts :( The secret number was : "+secretNumber);
            }
            System.out.println("Do you wish to play another round? (yes/no): ");
            String answer= sc.next().toLowerCase();
            if(!answer.equals("yes")){
                PlayAgain=false;
            }
        }
        System.out.println("\nGAME OVER!");
        System.out.println("Total rounds won : " +RoundsWon);
    }
}
