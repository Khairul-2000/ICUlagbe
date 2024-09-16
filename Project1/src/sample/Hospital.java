package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Button;

public class Hospital {
    private  final SimpleStringProperty name;
    private final SimpleIntegerProperty price;
    private  final SimpleIntegerProperty seat;
    private final SimpleStringProperty email;
    private final SimpleLongProperty phone;
    private final Button button;
    private final Button button1;


    public ICULagba icuLagba;


    public Hospital(String name, Integer price, Integer seat, String email,Long phone, ICULagba icuLagba)
    {
        this.name = new SimpleStringProperty(name);
        this.price = new SimpleIntegerProperty(price);
        this.seat = new SimpleIntegerProperty(seat);
        this.email = new SimpleStringProperty(email);
        this.phone = new SimpleLongProperty(phone);


        this.button = new Button("Book");
        this.button1 = new Button("Review");
        button.setOnAction(e->{
            if(this.getSeat() == 0)
            {
                try {
                    icuLagba.showAlert();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

            }
            else {
                System.out.println("Button pressed");
                try {

                    icuLagba.showPatientInfo();

                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }


        });
        button1.setOnAction(e1->{
            System.out.println("Button pressed");
        });
        this.icuLagba = icuLagba;
    }
    public String getEmail()
    {
        return this.email.get();
    }
    public void setEmail(String fEmail)
    {
        this.email.set(fEmail);
    }

    public Integer getPrice() {
        return price.get();
    }
    public void setPrice(Integer fPrice)
    {
        this.price.set(fPrice);
    }
    public String getName()
    {
        return this.name.get();
    }
    public void setName(String fName)
    {
        this.name.set(fName);
    }

    public Integer getSeat() {
        return seat.get();
    }
    public void setSeat(Integer fSeat)
    {
        this.seat.set(fSeat);
    }
    public Long getPhone()
    {
        return this.phone.get();
    }
    public void setPhone(Long fphone)
    {
        this.phone.set(fphone);
    }


    public Button getButton()
    {
        return button;
    }
    public Button getButton1()
    {
        return button1;
    }



}
