/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Crystal Gagne
 */

package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ToDo_ControllerTest_changeDescription {

    @Test
    void changeDescriptionCellEvent_VerifyExpectedDescription_AssertTrue()
    {
        ObservableList<SingleToDo> listForTesting = FXCollections.observableArrayList();
        listForTesting.add(new SingleToDo(false, LocalDate.now(), "Difo was never a god."));
        listForTesting.add(new SingleToDo(true, LocalDate.now(), "Go to class"));

        ToDo_Controller testController = new ToDo_Controller();
        testController.tableView.setItems(listForTesting);


    }

    @Test
    void changeDescriptionCellEvent_VerifyEditedDescription_AssertTrue()
    {
        // Populate the table
            // Select and edit cell index 1 (actual)
        // Verify the description @ index (1) is edited correctly (expected)
        // assert true

    }
}