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
    void editStatus_SetToFalse_AssertEquals()
    {

        ObservableList<SingleToDo> listForTesting = FXCollections.observableArrayList();
        listForTesting.add(new SingleToDo(false, LocalDate.now(), "Difo was never a god."));
        listForTesting.add(new SingleToDo(true, LocalDate.now(), "Go to class"));

        SingleToDo actual = listForTesting.get(1);
        actual.setStatus(false);
        boolean expected = false;

        assertEquals(expected,actual.getStatus());

    }

    @Test
    void editStatus_SetToTrue_AssertEquals()
    {

        ObservableList<SingleToDo> listForTesting = FXCollections.observableArrayList();
        listForTesting.add(new SingleToDo(false, LocalDate.now(), "Difo was never a god."));
        listForTesting.add(new SingleToDo(true, LocalDate.now(), "Go to class"));

        SingleToDo actual = listForTesting.get(0);
        actual.setStatus(true);
        boolean expected = true;

        assertEquals(expected,actual.getStatus());

    }

    @Test
    void editDueDate_CheckIsToday_AssertEquals()
    {

        ObservableList<SingleToDo> listForTesting = FXCollections.observableArrayList();
        listForTesting.add(new SingleToDo(false, LocalDate.now(), "Difo was never a god."));
        listForTesting.add(new SingleToDo(true, LocalDate.now(), "Go to class"));

        SingleToDo actual = listForTesting.get(1);
        LocalDate expected = LocalDate.now();

        assertEquals(expected,actual.getDueDate());

    }

    @Test
    void editDueDate_SetTo_July162021_AssertEquals()
    {
        LocalDate newDate = LocalDate.of(2021,07,16);

        ObservableList<SingleToDo> listForTesting = FXCollections.observableArrayList();
        listForTesting.add(new SingleToDo(false, LocalDate.now(), "Difo was never a god."));
        listForTesting.add(new SingleToDo(true, LocalDate.now(), "Go to class"));

        SingleToDo actual = listForTesting.get(1);
        actual.setDueDate(newDate);
        LocalDate expected = LocalDate.of(2021,07,16);

        assertEquals(expected,actual.getDueDate());

    }

    @Test
    void editDueDate_CheckDescription_AssertEquals()
    {

        ObservableList<SingleToDo> listForTesting = FXCollections.observableArrayList();
        listForTesting.add(new SingleToDo(false, LocalDate.now(), "Difo was never a god."));
        listForTesting.add(new SingleToDo(true, LocalDate.now(), "Go to class"));

        SingleToDo actual = listForTesting.get(1);
        String expected = "Go to class";

        assertEquals(expected,actual.getDescription());

    }

    @Test
    void editDueDate_ChangeDescription_AssertEquals()
    {

        ObservableList<SingleToDo> listForTesting = FXCollections.observableArrayList();
        listForTesting.add(new SingleToDo(false, LocalDate.now(), "Difo was never a god."));
        listForTesting.add(new SingleToDo(true, LocalDate.now(), "Go to class"));

        SingleToDo actual = listForTesting.get(1);
        actual.setDescription("This is a small change");
        String expected = "This is a small change";

        assertEquals(expected,actual.getDescription());

    }
}
