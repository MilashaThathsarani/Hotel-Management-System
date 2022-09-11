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
import model.Room;
import view.tm.RoomTm;

import java.io.IOException;
import java.util.ArrayList;

public class AddNewRoomController {
    public AnchorPane addNewRoomContext;
    public TableView tblAddRoom;
    public TableColumn colRoomNumber;
    public TableColumn colRoomType;
    public TableColumn colRoomRate;
    public TableColumn colOccupancy;
    public JFXTextField txtRoomNumber;
    public JFXTextField txtRoomType;
    public JFXTextField txtRoomRate;
    public JFXTextField txtOccupancy;

    static ArrayList<Room>roomList = new ArrayList();

    public void initialize(){
        colRoomNumber.setCellValueFactory(new PropertyValueFactory<>("roomNumber"));
        colRoomType.setCellValueFactory(new PropertyValueFactory<>("roomType"));
        colRoomRate.setCellValueFactory(new PropertyValueFactory<>("roomRate"));
        colOccupancy.setCellValueFactory(new PropertyValueFactory<>("occupancy"));
    }

    public void BackRoomPageA(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) addNewRoomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RoomPage.fxml"))));
    }

    public void saveUpdateOnAction(ActionEvent actionEvent) {
        Room room = new Room(txtRoomNumber.getText(),txtRoomType.getText(),txtRoomRate.getText(),txtOccupancy.getText());
        if (roomList.add(room)) {
            loadAllRoom();
            new Alert(Alert.AlertType.CONFIRMATION, "Saved", ButtonType.CLOSE).show();
        }else {
            new Alert(Alert.AlertType.CONFIRMATION,"Try Again",ButtonType.CLOSE).show();
        }
    }

    public void loadAllRoom(){
        ObservableList<RoomTm>tmObservableList = FXCollections.observableArrayList();
        for (Room temp : roomList) {
            tmObservableList.add(new RoomTm(temp.getRoomNumber(), temp.getRoomType(), temp.getRoomRate(), temp.getOccupancy()));
        }
        tblAddRoom.setItems(tmObservableList);
        }
    public void moveToRoomType(ActionEvent actionEvent) {
        txtRoomType.requestFocus();
    }

    public void moveToRoomRate(ActionEvent actionEvent) {
        txtRoomRate.requestFocus();
    }

    public void moveToOccupancy(ActionEvent actionEvent) {
        txtOccupancy.requestFocus();
    }
}
