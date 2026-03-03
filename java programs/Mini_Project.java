import java.util.Scanner;

public class Mini_Project {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int my_number = (int)(Math.random()*100);
        int user_guess = 0;

        do {
            System.out.println("Enter your guess (negative number to stop): ");
            user_guess = s.nextInt();

            if (user_guess < 0) {
                System.out.println("Game stopped by user.");
                break;
            }

            if (user_guess == my_number) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } 
            else if (user_guess > my_number) {
                System.out.println("Too high! Try again.");
            } 
            else {
                System.out.println("Too low! Try again.");
            }

        } while (true);   // infinite until break

        System.out.println("My number was: " + my_number);
        s.close();
    }
}
