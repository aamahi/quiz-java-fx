package com.example.easyquiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class QuizController {

    @FXML
    public Label question;

    @FXML
    public Button opt1, opt2, opt3, opt4;

    static int counter = 0;
    static int correct = 0;
    static int wrong = 0;

    @FXML
    private void initialize() {
        loadQuestions();
    }

    private void loadQuestions() {

        if (counter == 0) { //Question 1
            question.setText("1. What is the capital of Bangladesh??");
            opt1.setText("Sylhet");
            opt2.setText("Dhaka");
            opt3.setText("Rajshahi");
            opt4.setText("Chittagong");
        }
        if (counter == 1) { //Question 2
            question.setText("2. In which year did Bangladesh become a member of the United Nations (UN)?");
            opt1.setText("1970");
            opt2.setText("1972");
            opt3.setText("1980");
            opt4.setText("1990");
        }
        if (counter == 2) { //Question 3
            question.setText("3. Who is the national poet of Bangladesh?");
            opt1.setText("Kazi Nazrul Islam");
            opt2.setText("Rabindranath Tagore");
            opt3.setText("Jasim Uddin");
            opt4.setText("Shamsur Rahman");
        }
        if (counter == 3) { //Question 4
            question.setText("4. In which year Bangladesh got independence from Pakistan?");
            opt1.setText("1970");
            opt2.setText("1971");
            opt3.setText("1972");
            opt4.setText("1973");
        }
        if (counter == 4) {//Question 5
            question.setText("5. In Java, which data structure follows the Last-In-First-Out (LIFO) principle?");
            opt1.setText("Array");
            opt2.setText("Queue");
            opt3.setText("Stack");
            opt4.setText("Linked List");
        }
        if (counter == 5) { //Question 6
            question.setText("6. What is Bangladeshi local time zone?");
            opt1.setText("GMT +6");
            opt2.setText("GMT +5");
            opt3.setText("GMT +7");
            opt4.setText("UTC +2");
        }
        if (counter == 6) { //Question 7
            question.setText("7. Who is the current captain of the Bangladesh national cricket team in ODIs?");
            opt1.setText("Mashrafe Mortaza");
            opt2.setText("Mushfiqur Rahim");
            opt3.setText("Tamim Iqbal");
            opt4.setText("Shakib Al Hasan");
        }
        if (counter == 7) { //Question 8
            question.setText("8. Who is the highest run-scorer for Bangladesh in T20 Internationals?");
            opt1.setText("Tamim Iqbal");
            opt2.setText("Mushfiqur Rahim");
            opt3.setText("Shakib Al Hasan");
            opt4.setText("Mahmudullah");
        }
        if (counter == 8) { //Question 9
            question.setText("9. What is the keyword in Java used to create a new instance of a class? ");
            opt1.setText("new");
            opt2.setText("instance");
            opt3.setText("create");
            opt4.setText("instantiate");
        }
        if (counter == 9) { //Question 10
            question.setText("10. Which Java data type is used to represent single characters?  ");
            opt1.setText("char");
            opt2.setText("string");
            opt3.setText("int");
            opt4.setText("float");
        }

    }


    @FXML
    public void opt1clicked(ActionEvent event) {
        checkAnswer(opt1.getText().toString());
        if (checkAnswer(opt1.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }

    }

    boolean checkAnswer(String answer) {

        if (counter == 0) {
            if (answer.equals("Dhaka")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 1) {
            if (answer.equals("1972")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (answer.equals("Kazi Nazrul Islam")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (answer.equals("1971")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (answer.equals("Stack")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 5) {
            if (answer.equals("GMT +6")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 6) {
            if (answer.equals("Tamim Iqbal")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 7) {
            if (answer.equals("Tamim Iqbal")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 8) {
            if (answer.equals("new")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 9) {
            if (answer.equals("char")) {
                return true;
            } else {
                return false;
            }
        }
        return false;


    }

    @FXML
    public void opt2clicked(ActionEvent event) {
        checkAnswer(opt2.getText().toString());
        if (checkAnswer(opt2.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

    @FXML
    public void opt3clicked(ActionEvent event) {
        checkAnswer(opt3.getText().toString());
        if (checkAnswer(opt3.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

    @FXML
    public void opt4clicked(ActionEvent event) {
        checkAnswer(opt4.getText().toString());
        if (checkAnswer(opt4.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

}

