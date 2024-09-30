import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;


public class Main {
    static int getGuess(String prompt) {
        int num = 0;
        boolean correctInput = false;

        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br =  new BufferedReader(sr);

        do {
            try {
                System.out.print(prompt);
                String raw_input = br.readLine();
                num = Integer.parseInt(raw_input);

                if (num > 0 && num < 11) {
                    correctInput = true;
                } else {
                    System.out.println("Must be between 1 and 10");
                }
            } catch (Exception e) {
                System.out.println("Invalid input, try again");
            }

        } while (!correctInput);

        return num;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int randNum = rand.nextInt(10) + 1;

        int userGuess = getGuess("Guess the random number between 1-10: ");

        System.out.println("The random number: " + randNum);
        if (userGuess == randNum) {
            System.out.println("Good job you got it correct");
        } else if (userGuess < randNum) {
            System.out.println("Your guess was too low");
        } else if (userGuess > randNum) {
            System.out.println("Your guess was too high");
        }

    }
}
