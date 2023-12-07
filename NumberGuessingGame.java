import java.util.Random;
import java.util.Scanner;

class Game {
    int random_number;
    int CorrectNumber = 1;
    int number;

    Game() {
        Random sc = new Random();
        random_number = sc.nextInt(100);
    }

    public void Take_User_Input() {
        System.out.print("Enter a number: ");

        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
    }

    public void IsCorrectNumber() {
        if (number == random_number) {
            System.out.printf("Game over!\nYou guessed the number in: %d time", CorrectNumber);
        } else {
            CorrectNumber++;
            if (number > random_number) {
                System.out.println("HIGH NUMBER!");

                Take_User_Input();
                IsCorrectNumber();
            } else {
                System.out.println("LOW NUMBER!");

                Take_User_Input();
                IsCorrectNumber();
            }
        }
    }
}

public class NumberGuessingGame {
    public static void main(String[] args) {
        Game obj = new Game();
        obj.Take_User_Input();
        obj.IsCorrectNumber();
    }
}