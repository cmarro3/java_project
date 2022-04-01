package tinyJava;
import java.util.Scanner;

public class challenge {
    public static void main(String[] args) {
        String question = "What is the name of the main character in the smash hit cartoon, Yu-gi-oh!?";
        String choice1 = "Pegesus";
        String choice2 = "Joey";
        String choice3 = "Yugi";
        String correctChoice = choice3.toLowerCase();
        System.out.println(question);
        System.out.println("Was it " + choice2 + " , " + choice1 + " or " + choice3);
        try (Scanner input = new Scanner(System.in)) {
            String answer = input.next();
                if(answer.equals(correctChoice)){
                    System.out.println("Correct!");
                } else{
                    System.out.println("Wrong! The correct answer is Yugi!");
                }
        }
        
    }
}
