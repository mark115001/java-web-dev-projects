import org.launchcode.*;

import java.util.ArrayList;
import java.util.Scanner;
import questions.Question;

public class Survey extends Quiz {

    private final ArrayList<String> allResponses = new ArrayList<>();

    ArrayList<String> getAllResponses() {
        return allResponses;
    }

    @Override
    public void run() {
        Scanner input = new Scanner(System.in);

        for (Question question : getQuestions()) {
            int i=0;
            System.out.println(question);

            do {
                String userResponse = input.nextLine();
                if (userResponse.equalsIgnoreCase("done")) {
                    break;
                } else {
                    while (question.isInvalid(userResponse)) {
                        System.out.println(System.lineSeparator() + "That response is invalid...Please try again:");
                        userResponse = input.nextLine();
                    }
                    System.out.println("Got it!");

                    String content;
                    if(question instanceof ShortAnswer || question instanceof Paragraph || question instanceof LinearScale) {
                        content = userResponse;
                    } else {
                        int userResponseNum = Integer.parseInt(userResponse);
                        content = question.getChoiceMap().get(userResponseNum).getContent();
                    }
                    String resp = question.getQuestion() + ": " + content;
                    getAllResponses().add(resp);
                    i++;

                    if (question instanceof CheckBox && i < question.getMaxResponses()) {
                        System.out.println("(Select another by number or enter 'DONE'");
                    }
                }
            } while (i < question.getMaxResponses());

        }
        input.close();
    }

}
