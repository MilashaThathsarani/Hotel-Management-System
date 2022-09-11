package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RoomPageController {
    public AnchorPane roomContext;

    public void addNewRoom(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) roomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AddNewRoom.fxml"))));
    }

    public void modifyRoom(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) roomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ModifyRoom.fxml"))));
    }

    public void deleteRoom(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) roomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DeleteRoom.fxml"))));
    }

    public void backToRoom(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) roomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HotelPage.fxml"))));
    }
}
