package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DeleteMealController {
    public AnchorPane deleteMealContext;

    public void backToMealPageC(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) deleteMealContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealPage.fxml"))));
    }
}
