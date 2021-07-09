/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Crystal Gagne
 */

package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Creator_ObservableList
{


    // This class will create and hold observable list values.
    // Dummy values have been made to test out the functions.
    private ObservableList<SingleToDo> toDoItemsList = FXCollections.observableArrayList();

    public void setListOfToDoItems(ObservableList<SingleToDo> toDoItemsList)
    {
        this.toDoItemsList = toDoItemsList;
    }

    public ObservableList<SingleToDo> getToDoItemsList()
    {
        return toDoItemsList;
    }

    public void setToDoItemsList(SingleToDo toDoItem)
    {
        this.toDoItemsList.add(toDoItem);
    }



}