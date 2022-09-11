package view.tm;

import javafx.scene.control.Button;

public class CustomerTm {
    private String fullName;
    private String nationalId;
    private String  telephoneNumber;
    private String email;
    private String address;
    private Button btn;

    public CustomerTm() {
    }


    public CustomerTm(String fullName, String nationalId, String telephoneNumber, String email, String address, Button btn) {
        this.setFullName(fullName);
        this.setNationalId(nationalId);
        this.setTelephoneNumber(telephoneNumber);
        this.setEmail(email);
        this.setAddress(address);
        this.setBtn(btn);
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
