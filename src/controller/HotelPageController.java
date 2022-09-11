package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class HotelPageController {
    public AnchorPane hotelPageContext;

    public void rooms(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) hotelPageContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RoomPage.fxml"))));
    }

    public void mealPackage(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) hotelPageContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealPage.fxml"))));
    }

    public void incomeReport(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) hotelPageContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/IncomeReports.fxml"))));
    }

    public void contactUs(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) hotelPageContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ContactUs.fxml"))));
    }

    public void backToDashBoard(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) hotelPageContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashBoard.fxml"))));
    }
}
