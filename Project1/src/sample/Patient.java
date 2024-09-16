package sample;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class Patient {
    private final SimpleStringProperty name;
    private final SimpleDoubleProperty age;
    private final SimpleStringProperty gender;
    private final SimpleStringProperty bloodgroup;
    private final SimpleDoubleProperty phone;
    private final SimpleStringProperty addres;

    public Patient(String name,Double age, String gender, String bloodgroup, Double phone, String addres){
       this.name= new SimpleStringProperty(name);
        this.age= new SimpleDoubleProperty(age);
        this.gender= new SimpleStringProperty(gender);
        this.bloodgroup= new SimpleStringProperty(bloodgroup);
        this.phone= new SimpleDoubleProperty(phone);
        this.addres= new SimpleStringProperty(addres);
    }


    public String getName() {
        return name.get();
    }
    public void setName(String fName) {
        name.set(fName);
    }

    public Double getAge() {
        return age.get();
    }
    public void setAge(Double dAge) {
        age.set(dAge);
    }

    public String getGender() {
        return gender.get();
    }
    public void setGender(String fGender) {
        gender.set(fGender);
    }

    public String getBloodgroup() {
        return bloodgroup.get();
    }
    public void setBloodgroup(String fBloodgroup) {
        bloodgroup.set(fBloodgroup);
    }

    public Double getPhone() {
        return phone.get();
    }
    public void setPhone(Double dPhone) {
        phone.set(dPhone);
    }

    public String getAddres() {
        return addres.get();
    }
    public void setAddres(String fAddres) {
        addres.set(fAddres);
    }
}
