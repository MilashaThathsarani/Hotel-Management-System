package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MaintenanceController {
    public AnchorPane markMaintenanceContext;

    public void backToReceptionB(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) markMaintenanceContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Receptionist.fxml"))));
    }
}
