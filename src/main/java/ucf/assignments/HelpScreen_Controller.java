/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Crystal Gagne
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class HelpScreen_Controller
{
    // All this class needs to do is go back to the to do list.

    public void goBack(ActionEvent clickedBackButton)
    {
        // This event will take you back to the todo list.
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ToDo.fxml"));
            // Then we have to create the stage
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) clickedBackButton.getSource()).getScene().getWindow();

            stage.setScene(scene);
            // Then we show the stage
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
