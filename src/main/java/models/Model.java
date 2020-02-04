package models;

public class Model {

    private String firstAnswer;
    private String secondAnswer;


    public String connectMessage() {
        return firstAnswer += " " + secondAnswer;
    }

    public String getFirstAnswer() {
        return firstAnswer;
    }

    public void setFirstAnswer(String firstAnswer) {
        this.firstAnswer = firstAnswer;
    }

    public String getSecondAnswer() {
        return secondAnswer;
    }

    public void setSecondAnswer(String secondAnswer) {
        this.secondAnswer = secondAnswer;
    }
}
