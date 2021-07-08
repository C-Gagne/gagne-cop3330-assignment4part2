/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Crystal Gagne
 */

package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelpScreen_Controller
{
    // All this class needs to do is go back to the to do list and be able to maintain values form the previous controller (and pass them back in).

    ObservableList<SingleToDo> heldObservableList = FXCollections.observableArrayList();

    public void holdObservableListData(ObservableList<SingleToDo> passedObservableList)
    {
        heldObservableList = passedObservableList;
    }

    public void goBack(ActionEvent clickedBackButton)
    {
        // This event will take you back to the todo list.
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("ToDo.fxml"));
            Parent root = loader.load();

            // We need to get the controller for the HelpScreen information.
            ToDo_Controller toDoController = loader.getController();

            //Then we need to pass data (otherwise the table resets after hitting the help button)
            toDoController.tableView.setItems(heldObservableList);


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
