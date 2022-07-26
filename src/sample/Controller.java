package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class Controller {
    @FXML
    private Label label;

    @FXML
    private Button btn8;

    @FXML
    private Button btn7;

    @FXML
    private Button btn6;

    @FXML
    private Button btn5;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private TextField tf1;

    @FXML
    private TextField tf2;

    @FXML
    private AnchorPane pane;

    @FXML
    private Button btnmin;

    @FXML
    private Button btnmax;

    @FXML
    private Button btnclose;

    @FXML
    private Button btnclear;

    @FXML
    void calculateAddition(ActionEvent event) {
        String number1 = tf1.getText().trim();
        double num = Double.parseDouble(number1);
        String number2 = tf2.getText().trim();
        double num1 = Double.parseDouble(number2);
       double addition = num+num1;
        String add = Double.toString(addition);
        label.setText(add);

        tf2.setDisable(false);
    }


    @FXML
    void calculateDivision(ActionEvent event) {
        String number1 = tf1.getText().trim();
        double num = Double.parseDouble(number1);
        String number2 = tf2.getText().trim();
       double num1 = Double.parseDouble(number2);
        double division = num/num1;
        String div = Double.toString(division);
        label.setText(div);

        tf2.setDisable(false);
    }


    @FXML
    void calculateMultiplication(ActionEvent event) {
    String number1 = tf1.getText().trim();
       double num = Double.parseDouble(number1);
        String number2 = tf2.getText().trim();
        double num1 =Double.parseDouble(number2);
        double multiplication = num*num1;
        String multi = Double.toString(multiplication);
        label.setText(multi);

        tf2.setDisable(false);
    }

    @FXML
    void calculateSubtraction(ActionEvent event) {
    String number1 = tf1.getText().trim();
        double num = Double.parseDouble(number1);
        String number2 = tf2.getText().trim();
        double num1 = Double.parseDouble(number2);
        double subtraction = num-num1;
        String sub = Double.toString(subtraction);
        label.setText(sub);

        tf2.setDisable(false);
    }


    @FXML
    void calculateSine(ActionEvent event) {
        String number1 = tf1.getText().trim();
        double num = Double.parseDouble(number1);
        double valueRadians = Math.toRadians(Double.parseDouble(number1));
        double sineValue = Math.sin(valueRadians);
        String sine = Double.toString(sineValue);
        label.setText(sine);

        tf2.setDisable(true);
    }

    @FXML
    void calculateCosine(ActionEvent event) {
        String number1 = tf1.getText().trim();
        double num = Double.parseDouble(number1);
        double valueRadians = Math.toRadians(Double.parseDouble(number1));
        double cosineValue = Math.cos(valueRadians);
        String cos = Double.toString(cosineValue);
        label.setText(cos);

        tf2.setDisable(true);
    }

    @FXML
    void calculateTangent(ActionEvent event) {
        String number1 = tf1.getText().trim();
        double num = Double.parseDouble(number1);
        double valueRadians = Math.toRadians(Double.parseDouble(number1));
        double tanValue = Math.tan(valueRadians);
        String tan = Double.toString(tanValue);
        label.setText(tan);

        tf2.setDisable(true);
    }

    @FXML
    void calculateExponent(ActionEvent event) {
        String number1 = tf1.getText().trim();
        double num = Double.parseDouble(number1);
        double expValue = Math.exp(Double.parseDouble(number1));
        String exp = Double.toString(expValue);
        label.setText(exp);

        tf2.setDisable(true);
    }


    @FXML //minimize button
    void handleMinButtonAction(ActionEvent event) {
        Stage stage = null;
        stage = (Stage) pane.getScene().getWindow();
        stage.setIconified(true);
    }


    @FXML //maximize button
    void handleMaxButtonAction(ActionEvent event) {
        Stage stage = null;
        stage = (Stage) pane.getScene().getWindow();
        if(stage.isMaximized())
        stage.setMaximized(false);
        else
            stage.setMaximized(true);
    }

    @FXML//Close Button
    void handleCloseButtonAction(ActionEvent event) {
    Stage stage = (Stage) btnclose.getScene().getWindow();
    stage.close();
    }

    @FXML //clear button
    void actionPerformed(ActionEvent event) {
    tf1.clear();
    tf2.clear();
    label.setText("0.0");
    tf2.setDisable(false);
    }

    @FXML
    void initialize() {

    }
}
