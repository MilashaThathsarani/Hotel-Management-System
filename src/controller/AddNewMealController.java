package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Meal;
import view.tm.MealTm;

import java.io.IOException;
import java.util.ArrayList;

public class AddNewMealController {
    public AnchorPane addNewMealContext;
    public TableView tblAddNewMeal;
    public TableColumn colMealNo;
    public TableColumn colMealType;
    public TableColumn colMealName;
    public TableColumn colMealPrice;
    public JFXTextField txtMealNumber;
    public JFXTextField txtMealType;
    public JFXTextField txtMealName;
    public JFXTextField txtPrice;

    static ArrayList<Meal>mealList = new ArrayList();

    public void initialize(){
        colMealNo.setCellValueFactory(new PropertyValueFactory<>("mealNumber"));
        colMealType.setCellValueFactory(new PropertyValueFactory<>("mealType"));
        colMealName.setCellValueFactory(new PropertyValueFactory<>("mealName"));
        colMealPrice.setCellValueFactory(new PropertyValueFactory<>("mealPrice"));
    }

    public void backToMealPageA(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) addNewMealContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealPage.fxml"))));
    }

    public void saveUpdateOnActionTwo(ActionEvent actionEvent) {
        Meal meal = new Meal(txtMealNumber.getText(),txtMealType.getText(),txtMealName.getText(),txtPrice.getText());
        if (mealList.add(meal)) {
            loadAllMeal();
            new Alert(Alert.AlertType.CONFIRMATION, "Saved", ButtonType.CLOSE).show();
        }else {
            new Alert(Alert.AlertType.WARNING,"Try Again",ButtonType.CLOSE).show();
        }
    }
    public void loadAllMeal(){
        ObservableList<MealTm>tmObservableList = FXCollections.observableArrayList();
        for (Meal temp:mealList){
            tmObservableList.add(new MealTm(temp.getMealNumber(),temp.getMealType(),temp.getMealName(),temp.getMealPrice()));
        }
        tblAddNewMeal.setItems(tmObservableList);
    }

    public void moveToMealType(ActionEvent actionEvent) {
        txtMealType.requestFocus();
    }

    public void moveToMealName(ActionEvent actionEvent) {
        txtMealName.requestFocus();
    }

    public void moveToPrice(ActionEvent actionEvent) {
        txtPrice.requestFocus();
    }
}
