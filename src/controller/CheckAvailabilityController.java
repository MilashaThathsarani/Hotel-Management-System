package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CheckAvailabilityController {
    public AnchorPane availabilityContext;

    public void backToReserveB(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) availabilityContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReserveARoom.fxml"))));

    }
}
