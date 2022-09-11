package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Customer;
import view.tm.CustomerTm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

public class AddGuestDetailController {
    public AnchorPane addGuestContext;
    public JFXTextField txtFullName;
    public JFXTextField txtNational;
    public JFXTextField txtTelephone;
    public JFXTextField txtEmail;
    public JFXTextField txtAddress;
    public TableView tblCustomer;
    public TableColumn colFullName;
    public TableColumn colNationalId;
    public TableColumn colTelephone;
    public TableColumn colEmail;
    public TableColumn colAddress;
    public TableColumn colDelete;

    static ArrayList<Customer>customerList = new ArrayList();

    public void initialize(){
        colFullName.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        colNationalId.setCellValueFactory(new PropertyValueFactory<>("nationalId"));
        colTelephone.setCellValueFactory(new PropertyValueFactory<>("telephoneNumber"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colDelete.setCellValueFactory(new PropertyValueFactory<>("btn"));
    }

    public void backToReserveARoom(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) addGuestContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReserveARoom.fxml"))));
    }

    public void addCustomerOnAction(ActionEvent actionEvent) {

    }

    public void SaveUpdateOnAction(ActionEvent actionEvent) {
        Customer customer = new Customer(txtFullName.getText(),txtNational.getText(),txtTelephone.getText(),txtEmail.getText(),txtAddress.getText());
        if (customerList.add(customer)) {
            loadAllStudents();
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
        }else {
            new Alert(Alert.AlertType.WARNING,"Try Again", ButtonType.CLOSE).show();
        }
    }
    private void loadAllStudents() {
        ObservableList<CustomerTm> tmObservableList = FXCollections.observableArrayList();
        for (Customer temp : customerList) {
            Button btn = new Button("Delete");
            tmObservableList.add(new CustomerTm(temp.getFullName(), temp.getNationalId(), temp.getTelephoneNumber(), temp.getEmail(), temp.getAddress(), btn));

            btn.setOnAction((e) -> {
                ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
                ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);
                Alert alert = new Alert(Alert.AlertType.WARNING, "Are you sure whether you want to delete this customer?", yes, no);
                alert.setTitle("Confirmation Alert");
                Optional<ButtonType> result = alert.showAndWait();
                if (result.orElse(no) == yes) {
                    customerList.remove(temp);
                    loadAllStudents();
                } else {

                }
            });
        }

        tblCustomer.setItems(tmObservableList);
        }

    public void moveToNational(ActionEvent actionEvent) {
        txtNational.requestFocus();
    }

    public void moveToTelephone(ActionEvent actionEvent) {
        txtTelephone.requestFocus();
    }

    public void moveToEmail(ActionEvent actionEvent) {
        txtEmail.requestFocus();
    }

    public void moveToAddress(ActionEvent actionEvent) {
        txtAddress.requestFocus();
    }
}

