
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the scissor game!");
        System.out.println("Scissor (0), rock(1), paper(2): ");
        int user = scanner.nextInt(); //set user input 0/1/2


        int computer = new Random().nextInt(3); //0-2

        //change to the text

        String[] names = {"scissor", "rock", "paper"};
        String userChoice = names[user];
        String computerChoice = names[computer];


        //return the result

        String result;
        if (user == computer) {
            result = "It is a draw";
        } else if ((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1)) {
            result = "You won";

        } else {
            result = "You lost";
        }


        System.out.println("The computer" + computerChoice + " you are " + userChoice + "."+ result);
    }
}
