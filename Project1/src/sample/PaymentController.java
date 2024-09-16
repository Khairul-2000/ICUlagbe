package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class PaymentController {
    public ICULagba icuLagba;
    int code = 0;
    public void setCode(int code)
    {
        this.code = code;
    }




    @FXML
    public RadioButton nagadRationButton;
    @FXML
    public RadioButton bkashRationButton;
    @FXML
    public TextField veriField;

    @FXML
    public Button payButton;
    @FXML
    public Button preButton;

    public void nagadAction(ActionEvent event)
    {
        try {
            icuLagba.showNagad();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
    public void bkashAction(ActionEvent event)
    {
        try {
            icuLagba.showBkash();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void paymentAction(ActionEvent event)
    {
        System.out.println(code);
        if(!veriField.getText().equals(String.valueOf(code)))
        {
            icuLagba.showAlert3();

        }
        else
        {
            try {
                icuLagba.showRating();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    public void preAction(ActionEvent event)
    {
        try {
            icuLagba.showPatientInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void setIcuLagba(ICULagba icuLagba)
    {
        this.icuLagba = icuLagba;
    }
}
