/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

/**
 *
 * @author mac
 */
public class FXMLDocumentController implements Initializable {
    
    double data = 0;
    double ans = 0;
    double memory = 0;
    int operation = -1;
    boolean hasOperated = false;
    
    @FXML
    private Button one;

    @FXML
    private Button zero;

    @FXML
    private Button zeroZero;

    @FXML
    private Button dot;

    @FXML
    private Button equal;

    @FXML
    private Button substract;

    @FXML
    private Button multiply;

    @FXML
    private Button memoryClear;

    @FXML
    private Button percent;

    @FXML
    private Button sqrt;

    @FXML
    private Button delete;

    @FXML
    private Button grandTotal;

    @FXML
    private Button memoryRecall;

    @FXML
    private Button plus_sub;

    @FXML
    private Button mSub;

    @FXML
    private Button mPlus;

    @FXML
    private Button divide;

    @FXML
    private Button seven;

    @FXML
    private Button clear;

    @FXML
    private Button allClear;

    @FXML
    private Button four;

    @FXML
    private Button eight;

    @FXML
    private Button five;

    @FXML
    private Button two;

    @FXML
    private Button nine;

    @FXML
    private Button six;

    @FXML
    private Button three;

    @FXML
    private Button plus;
    
    @FXML
    private TextField display;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if (event.getSource() == one){
            if (hasOperated == true){
                display.setText("");
                hasOperated = false;
            }
            display.setText(display.getText() + "1");
        }else if (event.getSource() == two){
            if (hasOperated == true){
                display.setText("");
                hasOperated = false;
            }
            display.setText(display.getText() + "2");
        }else if (event.getSource() == three){
            if (hasOperated == true){
                display.setText("");
                hasOperated = false;
            }
            display.setText(display.getText() + "3");
        }else if (event.getSource() == four){
            if (hasOperated == true){
                display.setText("");
                hasOperated = false;
            }
            display.setText(display.getText() + "4");
        }else if (event.getSource() == five){
            if (hasOperated == true){
                display.setText("");
                hasOperated = false;
            }
            display.setText(display.getText() + "5");
        }else if (event.getSource() == six){
            if (hasOperated == true){
                display.setText("");
                hasOperated = false;
            }
            display.setText(display.getText() + "6");
        }else if (event.getSource() == seven){
            if (hasOperated == true){
                display.setText("");
                hasOperated = false;
            }
            display.setText(display.getText() + "7");
        }else if (event.getSource() == eight){
            if (hasOperated == true){
                display.setText("");
                hasOperated = false;
            }
            display.setText(display.getText() + "8");
        }else if (event.getSource() == nine){
            if (hasOperated == true){
                display.setText("");
                hasOperated = false;
            }
            display.setText(display.getText() + "9");
        }else if (event.getSource() == zero){
            if (hasOperated == true){
                display.setText("");
                hasOperated = false;
            }
            display.setText(display.getText() + "0");
        }else if (event.getSource() == zeroZero){
            if (hasOperated == true){
                display.setText("");
                hasOperated = false;
            }
            display.setText(display.getText() + "00");
        }else if (event.getSource() == plus){
            data = Double.parseDouble(display.getText());
            operation = 1;
            display.setText("");
        }else if (event.getSource() == substract){
            data = Double.parseDouble(display.getText());
            operation = 2;
            display.setText("");
        }else if (event.getSource() == multiply){
            data = Double.parseDouble(display.getText());
            operation = 3;
            display.setText("");
        }else if (event.getSource() == divide){
            data = Double.parseDouble(display.getText());
            operation = 4;
            display.setText("");
        }else if (event.getSource() == percent){
            data = Double.parseDouble(display.getText()) * 0.01;
            display.setText(String.valueOf(data));
        }else if (event.getSource() == dot){
            data = Double.parseDouble(display.getText());
            display.setText(display.getText() + ".");
        }else if (event.getSource() == sqrt){
            data = Math.sqrt(Double.parseDouble(display.getText()));
            display.setText(Double.toString(data));
        }else if (event.getSource() == plus_sub){
            data = Double.parseDouble(display.getText()) * (-1);
            display.setText(Double.toString(data));
        }else if (event.getSource() == delete){
            data = Double.parseDouble(display.getText(0, display.getLength()-1));
            display.setText(Double.toString(data));
        }else if (event.getSource() == mPlus){
            memory += Double.parseDouble(display.getText());
            display.setText("");
        }else if (event.getSource() == mSub){
            memory -= Double.parseDouble(display.getText());
            display.setText("");
        }else if (event.getSource() == memoryClear){
            memory = 0;
            display.setText("");
        }else if (event.getSource() == memoryRecall){
            display.setText(Double.toString(memory));
            hasOperated = true;
        }else if (event.getSource() == grandTotal){
            display.setText(Double.toString(data));
            hasOperated = true;
        }else if (event.getSource() == equal){
            double secondOperand = Double.parseDouble(display.getText());
            switch(operation){
                case 1:
                    ans = data + secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 2:
                    ans = data - secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 3:
                    ans = data * secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 4:
                    try{
                        ans = data / secondOperand;
                    }catch(Exception e){
                        display.setText("Error");
                    }
                    display.setText(String.valueOf(ans));
                    break;
            }
            hasOperated = true;
        }else if (event.getSource() == clear){
            display.setText("");
        }else if (event.getSource() == allClear){
            ans = 0;
            display.setText("");
        }
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
