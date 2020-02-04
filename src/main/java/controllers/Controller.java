package controllers;

import models.Model;
import views.View;

import java.util.Scanner;

public class Controller {
    private static final String HELLO = "Hello";
    private static final String JAVA = "Java";

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        view.printMessage(View.WELCOME_MESSAGE);

        model.setFirstAnswer(inputCheck(sc, HELLO));

        view.printMessage(View.MIDDLE_MESSAGE);

        model.setSecondAnswer(inputCheck(sc, JAVA));

        view.printMessage(model.connectMessage());
    }

    public String inputCheck(Scanner sc, String pattern) {

        while (!sc.hasNext(pattern)) {
            if (sc.hasNext("\\b[a-z]\\w*\\b")) {
                view.printMessage(View.NOT_CORRECT_REGISTER);
            } else {
                view.printMessage(View.WRONG_INPUT);
            }
            sc.next();
        }
        return sc.next();
    }
}
