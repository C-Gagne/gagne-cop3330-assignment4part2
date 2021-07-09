/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Crystal Gagne
 */

package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ToDoList_ControllerTest_addItemTo {

    @Test
    void addItemToList_AddNewItem_CheckNewListSizeIsCorrect_AssertTrue()
    {
        // Create list
        // add item to list using this function
        // verify list size is equal to original list, plus new item

        ObservableList<SingleToDo> listForTesting = FXCollections.observableArrayList();
        listForTesting.add(new SingleToDo(false, LocalDate.now(), "Difo was never a god."));
        listForTesting.add(new SingleToDo(true, LocalDate.now(), "Go to class"));

        Edit_ObservableList listEditor = new Edit_ObservableList();
        listForTesting = listEditor.addItemToList(listForTesting);

        int expected = 3;
        int actual = listForTesting.size();

        assertEquals(expected,actual);


    }
}