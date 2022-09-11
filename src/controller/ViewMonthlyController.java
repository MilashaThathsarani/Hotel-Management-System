package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewMonthlyController {
    public AnchorPane viewMonthlyContext;

    public void backToIncomeReport(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) viewMonthlyContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/IncomeReports.fxml"))));
    }
}
