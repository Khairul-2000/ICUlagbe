package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import javafx.scene.text.Text;

public class AboutController extends RatingController  {
    public ICULagba icuLagba;

    @FXML
    public TextArea Textarea;

    @FXML
    public Text text;

    @FXML
    public Button Backbutton;

    @FXML
    public Label ratingLabel;
    public void rating(Double ad)
    {
        ratingLabel.setText(String.valueOf(ad));
    }

    public void BackAction(ActionEvent event) {
        try {
            icuLagba.showLoginPage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setIcuLagba(ICULagba icuLagba)
    {
        this.icuLagba = icuLagba;
    }
}
