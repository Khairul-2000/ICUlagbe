package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.image.ImageView;


public class LogInController extends  RatingController{

    public ICULagba icuLagba;


    @FXML
    private TextField numberTextField;
    @FXML
    private Button loginButton;
    @FXML
    private ImageView imageView1;
    @FXML
    public Button About;





    void setIcuLagba(ICULagba icuLagba) {

        this.icuLagba = icuLagba;


    }


    public void loginButtonAction(ActionEvent event) {
        String userNumber = numberTextField.getText();

        if (userNumber.length() == 11) {
            try {
                icuLagba.showHospitalList();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            icuLagba.showAlert4();
        }
    }

    public void Aboutcon(ActionEvent event) {
        try {
            icuLagba.showAbout(OverallRating);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
