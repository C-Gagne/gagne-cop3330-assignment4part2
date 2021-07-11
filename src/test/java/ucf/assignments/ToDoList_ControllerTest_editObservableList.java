/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Crystal Gagne
 */

package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToDoList_ControllerTest_editObservableList
{
    @Test
    void editStatus_SetToFalse_AssertTrue()
    {
        // Create list
        // add item to list using this function
        // verify list size is equal to original list, plus new item

        ObservableList<SingleToDo> listForTesting = FXCollections.observableArrayList();
        listForTesting.add(new SingleToDo(false, LocalDate.now(), "Difo was never a god."));
        listForTesting.add(new SingleToDo(true, LocalDate.now(), "Go to class"));

        SingleToDo actual = listForTesting.get(1);
        actual.setStatus(false);
        boolean expected = false;

        assertEquals(expected,actual.getStatus());

    }

    @Test
    void editStatus_SetToTrue_AssertTrue()
    {
        // Create list
        // add item to list using this function
        // verify list size is equal to original list, plus new item

        ObservableList<SingleToDo> listForTesting = FXCollections.observableArrayList();
        listForTesting.add(new SingleToDo(false, LocalDate.now(), "Difo was never a god."));
        listForTesting.add(new SingleToDo(true, LocalDate.now(), "Go to class"));

        SingleToDo actual = listForTesting.get(0);
        actual.setStatus(true);
        boolean expected = true;

        assertEquals(expected,actual.getStatus());

    }

}
