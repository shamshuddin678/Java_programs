import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); //system.in is used for taking input from user. {
            System.out.println("Enter your name: ");
            /*
            ->here if we use s.next() it returns the first word of the input.
            ->if we use s.nextLine() it returns the whole line of the input.
            */
            String name = s.next();
            System.out.println(name);
            //java it automatically closes the scanner class.
            s.close();
        }
    }
    
