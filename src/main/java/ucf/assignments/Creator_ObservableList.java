/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Crystal Gagne
 */

package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class Creator_ObservableList
{
    // This class will create and hold observable list values.
        // Dummy values have been made to test out the functions.

    public ObservableList<SingleToDo> genObservableList()
    {
        ObservableList<SingleToDo> createdObservableList = FXCollections.observableArrayList();
        createdObservableList.add(new SingleToDo( false, LocalDate.of(1852,11,25), "Promote workflows"));
        createdObservableList.add(new SingleToDo(true, LocalDate.of(1852,11,25), "Eat cake"));
        createdObservableList.add(new SingleToDo( false, LocalDate.of(1754,12,25), "Go to class"));

        return createdObservableList;
    }
}
