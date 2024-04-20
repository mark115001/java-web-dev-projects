import org.launchcode.Choice;
import org.launchcode.MultipleChoice;
import org.launchcode.TrueOrFalse;


import java.awt.*;

public class QuizRunner {

    // Create quiz
    private static final Quiz quiz = new Quiz();

    public static void main(String[] args) {

        // Create questions
        String q1 = "Which of the following are books by Jane Austen?";
        Choice[] q1Choices = new Choice[]{
                new Choice("Jane Eyre"), // leaving off the boolean automatically defaults to false
                new Choice("Pride and Prejudice", true),
                new Choice("Wives and Daughters", false),
                new Choice("Jane Eyr")
        };

        Checkbox question1 = new Checkbox(q1, q1Choices);

        String q2 = "The most-published author or all time is Agatha Christa--True/False? ";
        Choice[] q2Choices = new Choice[] {
                new Choice("True", true),
                new Choice("False")
        };

        TrueOrFalse question2 = new TrueOrFalse(q2,q2choices);

        String q3 = "Which poem did history-making poet Amanda Gorman recite at the U.S. presidential inauguration in 2021? ";
        Choice[] q3Choices = new Choice[] {
                new Choice("The Hill Wed Climb", true),
                new Choice("the miracle of the Morning", false),
                new Choice("We Rise", false),
                new Choice("New Day's Lyric", false)
        };
        MultipleChoice question3 = new MultipleChoice(q3, q3Choices);

        // Add question to the quiz
        quiz.addQuestions(new Question[] { question1, question2, question3});

        // Interact with user (run quiz, provide results)

        quiz.run();

        String newLine = System.lineSeparator();
        System.out.println(newLine + "You answered " + quiz.getNumCorrect() +
                " of " + quiz.getQuestions().size() +
                " questions correctly. Thanks for playing!" + newLine);


    }

}
