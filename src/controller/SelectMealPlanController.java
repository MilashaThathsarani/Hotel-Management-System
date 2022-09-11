package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SelectMealPlanController {
    public AnchorPane selectMealContext;
    public ComboBox<String> cmbMealPlans;
    public ComboBox<String> cmbTimes;
    public TextField txtMeals;
    public TextField txtTimes;

    public void backToReserveC(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) selectMealContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReserveARoom.fxml"))));
    }

    public void initialize(){
        cmbMealPlans.getItems().addAll(
                "Local Meals",
                "Chinese Meals",
                "French Meals",
                "Desserts",
                "Drinks"
        );
        cmbMealPlans.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->{
            System.out.println(oldValue);
            System.out.println(newValue);
           txtMeals.setText((String) newValue);
        });
        cmbTimes.getItems().addAll(
                "Breakfast",
                "Lunch",
                "Dinner",
                "Evening Time"
        );
        cmbTimes.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->{
            System.out.println(oldValue);
            System.out.println(newValue);
            txtTimes.setText((String) newValue);
        });
    }
}
