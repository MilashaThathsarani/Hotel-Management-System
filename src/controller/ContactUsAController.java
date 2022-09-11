package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ContactUsAController {
    public AnchorPane contactAContext;

    public void backToReception(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) contactAContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Receptionist.fxml"))));
    }
}
