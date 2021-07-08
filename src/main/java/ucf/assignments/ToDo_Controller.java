/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Crystal Gagne
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.control.TableColumn.*;

public class ToDo_Controller {

    public void saveListOfToDo(ActionEvent clickSaveList)
    {
        // This will call UserInput to get a file name
        // Then will call SaveFile's writeListToDoExcel
    }

    public void loadListOfToDo(ActionEvent clickLoadList)
    {
        // This will call UserInput to get a file name
        // Then will call LoadFile's readListToDoExcel
    }


    public void createNewList(ActionEvent clickNewList)
    {
        // Create a new, empty, list of to do items.
            // User can edit title by double clicking on the field afterwards.
    }

    public void deleteList(ActionEvent clickDeleteList)
    {
        // This will delete an entire /selected/ list of to do items, title and all.
            // First we have to get the Observable List
                // Then we have to get all of the entries within the list
                    // We have to get what item is selected
                        // Then delete the selected item
    }


    public void changeTitleCellEvent(CellEditEvent editedCell)
    {
        // Get the selected table entry
            // Edit selected cell
                // Save new value
    }

    public void goToList(ActionEvent clickGoToList) {
        // This button changes scenes between the list of to do lists and a single to do list.
            // First, you have to select the title of the list of to do items you want to view/edit
                // Then hit this button to go into that list.
                // We have to make sure that data is maintained between views.

        // Basic functionality to verify both views work:
        // First we have to create the root...
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ToDoList.fxml"));
            // Then we have to create the stage
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) clickGoToList.getSource()).getScene().getWindow();

            stage.setScene(scene);
            // Then we show the stage
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
