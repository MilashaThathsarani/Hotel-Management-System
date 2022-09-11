package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class DashBoardController {
    public JFXTextField txtUserName;
    public JFXTextField txtPassword;
    public AnchorPane dashBoardContext;

    public void signUp(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) dashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/FillForm.fxml"))));
    }


    public void signIn(ActionEvent actionEvent) throws IOException {
        if (txtUserName.getText().equalsIgnoreCase("Admin")) {
            Stage window = (Stage) dashBoardContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HotelPage.fxml"))));
        }
         if(txtUserName.getText().equalsIgnoreCase("Reception")){
            Stage window = (Stage) dashBoardContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Receptionist.fxml"))));
        }

    }

    public void moveToAddress(ActionEvent actionEvent) {
        txtPassword.requestFocus();
    }
}

