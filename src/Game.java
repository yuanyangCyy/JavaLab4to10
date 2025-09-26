
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randome = new Random();


        String[] names = {"scissor", "rock", "paper", "lizard", "spock"};


        int userScore = 0;
        int computerScore = 0;



        while (true) {
            System.out.println("Scissor (0), rock(1), paper(2), lizard (3), spock (4), exit(8) :");
            int user = scanner.nextInt();
            if (user == 8) break;
            if (user < 0 || user > 4) {
                System.out.println("Invalid user choice. Try again.");
                continue;

            }

            int computer = randome.nextInt(5);

            boolean userWin =
                    (user == 0 && (computer == 2 || computer == 3))
                            || (user == 1 && (computer == 0 || computer == 3))
                            || (user == 2 && (computer == 1 || computer == 4))
                            || (user == 3 && (computer == 2 || computer == 4))
                            || (user == 4 && (computer == 0 || computer == 1));

            String result;
            if (user == computer) {
                result = "It is a draw";
            } else if (userWin) {
                result = "You win";
                userScore++;
            } else {
                result = "You lose";
                computerScore++;
            }


            System.out.println("The computer is " + names[computer] +
                    ".You are" + names[user] + ". " + result);

            System.out.println("Youre Score: " + userScore + "| Computer Score: " + computerScore);

        }

System.out.println("Final Score: " + userScore + "| Computer Score: " + computerScore);
        System.out.println("over");

    }
}