package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ReserveARoomController {
    public AnchorPane reserveRoomContext;

    public void addGuestDetail(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) reserveRoomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AddGuestDetail.fxml"))));
    }

    public void checkRoomAvailability(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) reserveRoomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/CheckAvailability.fxml"))));
    }

    public void selectMealPlan(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) reserveRoomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/SelectMealPlan.fxml"))));
    }

    public void backToReceptionA(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) reserveRoomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Receptionist.fxml"))));
    }
}
