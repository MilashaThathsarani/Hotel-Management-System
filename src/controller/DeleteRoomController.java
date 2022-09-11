package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DeleteRoomController {
    public AnchorPane deleteRoomContext;

    public void backToRoomPageC(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) deleteRoomContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RoomPage.fxml"))));
    }
}
