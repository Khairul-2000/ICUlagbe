package sample;


import com.sun.security.jgss.GSSUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TableView;



public class PatientInfoController extends PaymentController {
    public ICULagba iculagba1;



    @FXML
    public Button Submitbutton;

    public TextField ptname;

    public TextField ptage;

    public TextField ptgender;

    public TextField ptbloodgroup;

    public TextField ptphone;

    public TextField ptaddres;

    @FXML
    public TableView patienttable;
    @FXML
    public Button previousButton;




    public void setIculagba1(ICULagba iculagba1)
    {
        this.iculagba1 = iculagba1;
    }




    @FXML
    void submitbuttonaction(ActionEvent event) {
          if(ptname.getText().isEmpty() || ptage.getText().isEmpty()|| ptgender.getText().isEmpty()|| ptbloodgroup.getText().isEmpty() || ptaddres.getText().isEmpty() ) {


              iculagba1.showAlert3();
          }

          else
          {
              try {
                  iculagba1.showPayment(code);
              } catch (Exception e) {
                  e.printStackTrace();
              }
          }

    }


    @FXML
    public void previousAction()
    {
        try {
            iculagba1.showHospitalList();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }









}
