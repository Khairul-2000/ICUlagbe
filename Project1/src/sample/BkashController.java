package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class BkashController {
    public ICULagba icuLagba;
    int code = 0;

    @FXML
    public TextField myNumberField;

    @FXML
    public Button confirmButton;
    @FXML
    public Button closeButton;
   @FXML
   public TextField billField;



   @FXML
   public void confirmAction(ActionEvent event)
   {
       if(billField.getText().isEmpty() || myNumberField.getText().isEmpty())
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




    public void setIcuLagba(ICULagba icuLagba) {
        this.icuLagba = icuLagba;
    }
}
