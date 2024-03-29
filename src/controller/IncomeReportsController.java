package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class IncomeReportsController {
    public AnchorPane incomeContext;

    public void viewMonthly(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) incomeContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ViewMonthly.fxml"))));
    }

    public void viewAnnually(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)incomeContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ViewAnnually.fxml"))));
    }

    public void backToRoomC(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)incomeContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HotelPage.fxml"))));
    }
}
