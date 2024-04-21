package org.launchcode;

public class Choice {

    private final String content;
    private final boolean correct;

//    public Choice(String content){  // had to add this constructor because leaving off of instance did not default to false as expected
//        this.content=content;
//        this.correct = false;
//    }

    public Choice(String content, boolean correct) {
        this.content = content;
        this.correct = correct;
    }

    public Choice (String content) {
        this(content, false);
    }

    public String getContent() {
        return content;
    }

    public boolean isCorrect() {
        return correct;
    }
}
