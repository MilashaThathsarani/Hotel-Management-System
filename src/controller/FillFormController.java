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

public class FillFormController {
    public AnchorPane signUpFormContext;
    public JFXTextField txtFullName;
    public JFXTextField txtPasswordM;
    public JFXTextField txtEmail;

    public void signIn(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) signUpFormContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Receptionist.fxml"))));
    }

    public void cancel(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) signUpFormContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashBoard.fxml"))));
    }

    public void moveToEmailAddress(ActionEvent actionEvent) {
        txtEmail.requestFocus();
    }

    public void moveToPassword(ActionEvent actionEvent) {
        txtPasswordM.requestFocus();
    }
}

