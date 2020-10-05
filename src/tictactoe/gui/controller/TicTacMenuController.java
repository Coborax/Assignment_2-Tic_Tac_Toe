package tictactoe.gui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class TicTacMenuController
{
    public Button play;

    public void openGame(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../views/TicTacView.fxml"));
        Stage window = (Stage) play.getScene().getWindow();
        window.setScene(new Scene(root));
    }
}
