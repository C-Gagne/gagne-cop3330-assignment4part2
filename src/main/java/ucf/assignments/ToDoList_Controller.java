/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Crystal Gagne
 */

package ucf.assignments;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

public class ToDoList_Controller
{
    // The table has to be configured
        // We need to declare the tableView, and what it contains
            // This would be by using TableView<> tableView
                // As an added bonus, this has built in sorting functionality
        // Each column needs to be declared, along with what it contains.
            // We do this using TableColumn<>
        // Each row in the table needs to be selectable
        // Each entry editable, so a new input can be created.
            // Or we have an add item to list button that asks for the completion status, due date, and description
        // The "status" column needs to be quickly editable by clicking on the entry
            // A Checkbox object should allow for this
        // There needs to be a way to show only completed/only incomplete items
            // We can filter the table by the status column to get incomplete only or complete only items
                // Using a combo box, the use can select what view option they want
                    // The tableView should change from showing all of the Entries to showing a FilteredList
                        // The filtered list will be based on the selection made (complete, incomplete, all)


    // Basic definition for combo box
    @FXML public ComboBox<String> viewOptions;
    // Basic definitions of the columns in the table.
    @FXML private TableView<Entry> tableView;
    @FXML private TableColumn<Entry, Boolean> statusColumn;
    @FXML private TableColumn<Entry, LocalDate> dueDateColumn;
    @FXML private TableColumn<Entry, String> descriptionColumn;

    @FXML public void initialize()
    {
        // We have to make sure that the table is editable (table.View.setEditable(true));
        // Each column will have to be editable
        // We have to set a cellValueFactory for each column
            // status will be a boolean
                // this field will need to have an ObservableValue
                    // Its table cell will have to be set up as a checkbox
            // dueDate will be a Date or LocalDate
            // description will be a string

    }

    public void changeDescriptionCellEvent(CellEditEvent editedCell)
    {
        // To edit the description cell, first we have to get the selected cell from the tableView
        // Then we have to take the edited value
            // Convert it to string and get the new value.
    }

    public void changeDueDateCellEvent(CellEditEvent editedCell)
    {
        // When selected, the selected Due Date cell needs to open up a DatePicker
            // Once a date is selected within the date picker, the value needs to be updated.
                // This will use the Class DatePickerCell

    }


    public void saveToDoFile(ActionEvent clickedSaveFile)
    {
        // This will call UserInput to get a file name
        // Then will call SaveFile's writeSingleToDoExcel
    }

    public void loadToDoFile(ActionEvent clickedLoadFile)
    {
        // This will call UserInput to get a file name
        // Then will call LoadFile's readSingleToDoExcel
    }



    public void addItemToList(ActionEvent clickedAddItem)
    {
        // This event will create a new, empty, entry in the list.
            // The user can edit it after it is created.

        // This requires the creation of a new Entry into the list
            // We have to make sure we have the list
                // Then add an entry to it.
    }

    public void removeItemFromList(ActionEvent clickedRemoveItem)
    {
        // This even removes an item from the list.

        // Like adding and item, it requires we have the list.
            // Unlike adding items, we have to select the entry we want to delete, and only delete that entry
                // Once we getItems() we can remove(selectedEntry).

    }


    // We need a method to change the scene
    public void backToListOfToDo(ActionEvent clickedBackButton)
    {
        // This just changes views from this list, back to the list of to do lists.
        // We have to make sure that data is maintained between views.

        // To verify that both scenes display properly:
        // First we have to create the root...
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
