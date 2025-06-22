import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class scramble {

    public static void main(String[] args) {
        System.out.println("Welcome to Scrumble Game!");
        System.out.println("______Rules of Scrumble Game______");
        System.out.println("1. The Game consists of 3 attempts.");
        System.out.println("2. Each round you should try to guess the word correctly.");
        System.out.println("3. If you guess the correctly then the game ends otherwise you can try again to guess the word.");
        Scanner sc = new Scanner(System.in);

        String[] wordsList = {"hacker","programming","python","laptop","desktop","management",
        "language","system","profession","engineering","science","professor","students","chairman","principal"};
        Random random = new Random();
        int chances = 3;
        String word = wordsList[random.nextInt(wordsList.length)];
        ArrayList<Character> characters = new ArrayList<>();
        for(int i = 0; i < word.length(); i++){
            characters.add(word.charAt(i));
        }

        java.util.Collections.shuffle(characters);
        StringBuilder scrambled = new StringBuilder();
        for (char c : characters) {
            scrambled.append(c);
        }
        System.out.println("\nScrambled word is: " + scrambled.toString());

        while (chances > 0) {
            System.out.println("Guess the word:");
            String guess = sc.nextLine();
            if (word.equals(guess)) {
                System.out.println("Perfect! Your guess is correct");
                break;
            } else {
                chances--;
                if (chances > 0) {
                    System.out.println("Sorry you Guessed wrong! You have " + chances + " chance(s) left. Try again:");
                } else {
                    System.out.println("Sorry you Guessed wrong!");
                    System.out.println("Game Over! The correct word is " + word);
                }
            }
        }
        System.out.println("Thanks for playing!");
        sc.close();
    }

}