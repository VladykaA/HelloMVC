package views;

public class View {

    public static final String WELCOME_MESSAGE = "Say Hello and after say Java";

    public static final String MIDDLE_MESSAGE = "Well done! Now say Java";

    public static final String WRONG_INPUT = "Try again";

    public static final String NOT_CORRECT_REGISTER = "The first letter should be in the upper register only, others not";

    public void printMessage(String message){
        System.out.println(message);
    }

}
