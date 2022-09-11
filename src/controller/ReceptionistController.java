package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ReceptionistController {
    public AnchorPane receptionContext;

    public void reserveARoom(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) receptionContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReserveARoom.fxml"))));
    }

    public void maintenance(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) receptionContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Maintenance.fxml"))));
    }


    public void backToDashBoard(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) receptionContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashBoard.fxml"))));
    }

    public void contactUsR(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)receptionContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ContactUsA.fxml"))));
    }
}
