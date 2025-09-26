
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the scissor game!");
        System.out.println("Scissor (0), rock(1), paper(2), lizard (3), spock (4) : ");
        int user = scanner.nextInt(); //set user input 0/1/2 add 3 4


        int computer = new Random().nextInt(5); //0-2

        //change to the text

        String[] names = {"scissor", "rock", "paper", "lizard", "spock"};
        String userChoice = names[user];
        String computerChoice = names[computer];


        //return the result

        String result;
        if (user == computer) {
            result = "It is a draw";
        } else if ((user == 0 &&  (computer == 2 || computer == 3))
        || (user == 1 && ( computer == 0 || computer == 3 ))
        || (user == 2 && (computer == 1 || computer == 4))
        || (user == 3 && (computer == 2 || computer == 4))
        || (user == 4 && (computer == 0 || computer == 1)))

        {
            result = "You won";

        } else {
            result = "You lost";
        }


        System.out.println("The computer is " + computerChoice + " you are " + userChoice + "."+ result);
    }
}
