package sample;

import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

public class HospitalListController  {

    public ICULagba icuLagba;

    @FXML
    public TextField searchField;

    @FXML
    public TableView tableView;

    @FXML
    public Button clickButton;

    @FXML
    public ImageView imageView2;

    @FXML
    public Button previousButton;





    private void initializeColumn()
    {
        TableColumn<Hospital, String> name = new TableColumn<>("Hospital");
        name.setMinWidth(80);
        name.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Hospital, Integer> price = new TableColumn<>("Seat price");
        price.setMinWidth(80);
        price.setCellValueFactory(new PropertyValueFactory<>("price"));

        TableColumn<Hospital, Integer> seat = new TableColumn<>("Seat");
        seat.setMinWidth(80);
        seat.setCellValueFactory(new PropertyValueFactory<>("seat"));

        TableColumn<Hospital, String>  email = new TableColumn<>("Email ID");
        email.setMinWidth(80);
        email.setCellValueFactory(new PropertyValueFactory<>("email"));

        TableColumn<Hospital, Long> phone = new TableColumn<>("Phone");
        phone.setMinWidth(80);
        phone.setCellValueFactory(new PropertyValueFactory<>("phone"));


        TableColumn<Hospital, Button> button = new TableColumn<>("Press");
        button.setMinWidth(80);
        button.setCellValueFactory(new PropertyValueFactory<>("button"));


        tableView.getColumns().addAll(name,price,seat,email,phone,button);



        FilteredList<Hospital> filteredData = new FilteredList<>(icuLagba.data, b-> true);
        searchField.textProperty().addListener((observable, oldValue,newValue)->{
            filteredData.setPredicate(hospital -> {
                if(newValue == null || newValue.isEmpty()){
                    return true;
                }
                String lowerCaseFilter = newValue.toLowerCase();
                if(hospital.getName().toLowerCase().contains(lowerCaseFilter)){
                    return true;
                }
                // Integer to String convert by valueOf() method

                else if(String.valueOf(hospital.getPrice()).contains(lowerCaseFilter))
                    return true;
                else
                    return false;
            });
        });
        SortedList<Hospital> sortedDate = new SortedList<>(filteredData);
        sortedDate.comparatorProperty().bind(tableView.comparatorProperty());
        tableView.setItems(sortedDate);


    }
    @FXML
    public void clickAction(ActionEvent event)
    {
        tableView.setEditable(true);
        initializeColumn();
        tableView.refresh();
    }
    @FXML
    public void previousAction(ActionEvent event)
    {
        try {
            icuLagba.showLoginPage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public void setIcuLagba(ICULagba icuLagba) {
        this.icuLagba = icuLagba;
    }

}
