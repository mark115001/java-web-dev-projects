import org.launchcode.Choice;
import org.launchcode.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quiz {

    private final ArrayList<Question> questions = new ArrayList<>();

    private int numCorrect = 0;

    // default constructor is sufficient


    public int getNumCorrect() {
        return numCorrect;
    }

    public void addQuestions(Question[] questionArray) {
        Collections.addAll(questions, questionArray);   // takes the questions from the Questions array and put then in questionArray
    }
    public void run() {

        Scanner input = new Scanner(System.in);   // gets information from user
        Collections.shuffle((questions));


        for (Question question: questions) {
            // Print questions for the user
            System.out.println(question);

            // Get and evaluate responses
            ArrayList<Integer> userResponses = new ArrayList<>();
            int i=0;
            while (i < question.getMaxResponses()) {
                String userResponse;

                // validate
                do {
                    System.out.println("Please enter a number:" );
                    userResponse = input.nextLine();
                } while (question.isInvalid(userResponse));

                // Evaluate
                int userRespNum = Integer.parseInt(userResponse);
                if (userResponses.contains(userRespNum)) {
                    System.out.println("You already got that one!");
                } else if (!question.getChoiceMap().get(userRespNum).isCorrect()) {
                    System.out.println("'SOL'...the answer was: ");
                    for (Choice choice : question.getChoiceMap().values()) {
                        if (choice.isCorrect()) {
                            System.out.println(choice.getContent());
                        }
                    }
                    break;
                } else {
                    System.out.println("Correct!");
                    userResponses.add(userRespNum);
                    if (i == question.getMaxResponses() - 1) {
                        numCorrect++;
                    }
                    i++;
                }

            }
        }

        input.close();  // closes Scanner input
    }
}


