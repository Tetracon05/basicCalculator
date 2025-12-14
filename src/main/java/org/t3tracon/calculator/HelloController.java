package org.t3tracon.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField txtField_firstNumber, txtField_secondNumber, txtField_result;

    @FXML
    private void handleOperateBtn(ActionEvent event) {
        String num1Str = txtField_firstNumber.getText();
        String num2Str = txtField_secondNumber.getText();

        Button btnOperator = (Button) event.getSource();

        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            txtField_result.setText("entries cannot be null");
            return;
        }

        try {
            Double num1 = Double.parseDouble(num1Str);
            Double num2 = Double.parseDouble(num2Str);

            switch (btnOperator.getId()) {
                case "btnAddition":
                    txtField_result.setText(String.valueOf(num1 + num2));
                    break;
                case "btnSubtract":
                    txtField_result.setText(String.valueOf(num1 - num2));
                    break;
                case "btnMultiply":
                    txtField_result.setText(String.valueOf(num1 * num2));
                    break;
                case "btnDivide":
                    txtField_result.setText(String.valueOf((num1 / num2)));
                    break;
                default:
                    txtField_result.setText("error!");
            }
        } catch (NumberFormatException e) {
            txtField_result.setText("enter valid numbers");
        }
    }
}
