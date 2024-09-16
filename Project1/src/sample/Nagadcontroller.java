package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Random;


public class Nagadcontroller{

    public ICULagba icuLagba;
    private int code = 0;

    @FXML
    public TextField numberTextField;

    @FXML
    public TextField amountTextField;

    @FXML
    public Button paymentButton;

    @FXML
    public Button closeButton;

    @FXML
    public void paymentButton(ActionEvent event){

        if(numberTextField.getText().isEmpty() || amountTextField.getText().isEmpty())
        {
            icuLagba.showAlert3();
        }
        else
        {
            Random rnd = new Random();
            code = rnd. nextInt(999999)+1;
            System.out.println(code);
            icuLagba.showAlert2();
        }


    }

    @FXML
    public void closeAction(ActionEvent event)
    {
        try {
            icuLagba.showPayment(code);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setIcuLagba(ICULagba icuLagba)
    {
        this.icuLagba = icuLagba;
    }

    public int getCode()
    {
        return code;
    }
}
