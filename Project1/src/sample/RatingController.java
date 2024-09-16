package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

import javafx.scene.control.TextField;

public class RatingController {
    public ICULagba icuLagba;
    Double OverallRating = 4.8;

    @FXML
    private TextField ratingTextField;
    @FXML
    private Button submitButton;
    @FXML
    public RadioButton badButton;
    @FXML
    public RadioButton goodButton;
    @FXML
    public RadioButton excellentButton;


    void setIcuLagba(ICULagba icuLagba) {

        this.icuLagba = icuLagba;
    }

    public void submitButtonAction(ActionEvent event) {
        double userRating = Double.parseDouble(ratingTextField.getText());
        Double TotalRating = 0.0;
        if(userRating <= 5.0 && userRating >= 0.0 )
        {
            OverallRating = ((OverallRating * TotalRating) + userRating) / (TotalRating + 1);
            System.out.println(OverallRating);
            try {
                icuLagba.showLoginPage();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        else
        {
            icuLagba.showAlert5();
        }



    }

    public void closeAction(ActionEvent event)
    {
        try {
            icuLagba.showLoginPage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
