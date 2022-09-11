package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ContactUsController {
    public AnchorPane contactContext;


    public void backToHotelPage(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) contactContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HotelPage.fxml"))));
    }
}
