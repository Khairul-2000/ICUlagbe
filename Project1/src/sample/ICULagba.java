package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;


public class ICULagba extends Application {
    private Stage stage;

    public Stage getStage() {
        return stage;
    }
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        showLoginPage();
    }

    public ObservableList<Hospital> data = FXCollections.observableArrayList(
            new Hospital("Ad-din Medical Collage Hospital",1500,3,"ad@gmail.com",9353391L,this),
            new Hospital("250 Bed Sheikh RaselGastroliver Institute & Hospital",600,25," info@asgaralihospital.com",1711307069L,this),
            new Hospital("Bangladesh Kuwait Moitree Hospital",680,16,"bkmh@gmail.com",33333883388L ,this),
            new Hospital("Railway Hospital",900,4,"railwayhos@gmail.com",444444444L,this),
        new Hospital("Mohanagar General Hospita",750,5,"mgH@gmail.com",83883338844L ,this),
        new Hospital("Mirpur Lalkuthi Hospital",1000,0,"Mirpurlalkuthi@gmail.com",3896344557L ,this),
        new Hospital("Kurmitola General hospita",1200,27,"kgh@gmail.com",363633868899L ,this),
            new Hospital("Regent Hospital",1800,8,"Regenthospital@gmail.com",3363631010L ,this),
            new Hospital("Sajida Foundation Hospital",600,8,"sajidaFoundation@gmail.com",583333788L ,this)

    );
    public void showLoginPage() throws Exception
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("login.fxml"));
        Parent root = loader.load();

        LogInController controller = loader.getController();

        controller.setIcuLagba(this);

        stage.setTitle("Login Page");
        stage.setScene(new Scene(root,600,400));
        stage.show();


    }

    public void showAbout(Double ra) throws Exception{

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("About.fxml"));
        Parent root = loader.load();

        AboutController controller = loader.getController();
        controller.rating(ra);
        controller.setIcuLagba(this);

        stage.setTitle("Information");
        stage.setScene(new Scene(root,600,400));
        stage.show();
    }

    public void showHospitalList() throws  Exception{

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("hospitallist.fxml"));
        Parent root = loader.load();

        HospitalListController controller = loader.getController();
        controller.setIcuLagba(this);

        stage.setTitle("Hospital List");
        stage.setScene(new Scene(root,900,400));
        stage.show();

    }

    public void showPatientInfo() throws  Exception{

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("PatientInfo.fxml"));
        Parent root = loader.load();

        PatientInfoController controller = loader.getController();

        controller.setIculagba1(this);

        stage.setTitle("PatientInfo Section");
        stage.setScene(new Scene(root,800,600));
        stage.show();

    }
    public void showRating() throws Exception{

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("rating.fxml"));
        Parent root = loader.load();

        RatingController controller = loader.getController();

        controller.setIcuLagba(this);

        stage.setTitle("Review section");
        stage.setScene(new Scene(root,600,400));
        stage.show();
    }
    public void showNagad() throws Exception{

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("nagad.fxml"));
        Parent root = loader.load();

        Nagadcontroller controller = loader.getController();

        controller.setIcuLagba(this);

        stage.setTitle("Payment Section");
        stage.setScene(new Scene(root,600,400));
        stage.show();
    }
    public void showBkash() throws Exception{

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("bkash.fxml"));
        Parent root = loader.load();

        BkashController controller = loader.getController();
        controller.setIcuLagba(this);

        stage.setTitle("Payment Section");
        stage.setScene(new Scene(root,630,440));
        stage.show();
    }
    public void showPayment(int code) throws Exception{

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("payment.fxml"));
        Parent root = loader.load();

        PaymentController controller = loader.getController();
        controller.setCode(code);
        controller.setIcuLagba(this);

        stage.setTitle("Payment Section");
        stage.setScene(new Scene(root,630,440));
        stage.show();
    }



    public void showAlert(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Some thing wrong");
        alert.setHeaderText("Some thing wrong");
        alert.setContentText("There no seat remain please try another Hospital");
        alert.showAndWait();
    }
    public void showAlert3(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Some thing wrong");
        alert.setHeaderText("Some thing wrong");
        alert.setContentText("Fill up all the section in this page");
        alert.showAndWait();
    }

    public void showAlert2(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Payment Verification");
        alert.setHeaderText("Payment Verification code");
        alert.setContentText("Check your phone for Verification code");
        alert.showAndWait();
    }
    public void showAlert4(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Some thing Wrong");
        alert.setHeaderText("Invalid phone Number");
        alert.setContentText("Invalid Phone Number");
        alert.showAndWait();
    }
    public void showAlert5(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Some thing Wrong");
        alert.setHeaderText("Invalid Rating");
        alert.setContentText("Invalid Rating");
        alert.showAndWait();
    }


    public static void main(String[] args)
    {

        launch(args);
    }
}

