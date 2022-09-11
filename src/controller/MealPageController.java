package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MealPageController {
    public AnchorPane mealPageContext;

    public void addNewPackage(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) mealPageContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AddNewMeal.fxml"))));
    }

    public void modifyPackage(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) mealPageContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ModifyMeal.fxml"))));
    }

    public void deleteMealPackage(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) mealPageContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DeleteMeal.fxml"))));
    }

    public void backToRoomB(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) mealPageContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HotelPage.fxml"))));
    }
}
