package tictactoe.gui.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class TicTacMenuController {
    @FXML
    public Button multiplayer;

    /*@FXML
    public void openMultiplayer() throws IOException
    {
        FXMLLoader.load(getClass().getResource("views/TicTacView.fxml"));
        Parent root1 = (Parent) FXMLLoader.load();
        Scene scene = new Scene(root1);
        Stage stage = new Stage();

        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Tic Tac Toe");
        stage.centerOnScreen();


        stage.show();
    }*/
}
