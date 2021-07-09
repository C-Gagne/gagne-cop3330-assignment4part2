/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Crystal Gagne
 */

package ucf.assignments;

import javafx.collections.ObservableList;

import java.time.LocalDate;

public class Edit_ObservableList
{
    public ObservableList<SingleToDo> addItemToList(ObservableList<SingleToDo> baseList)
        {
            SingleToDo newEntry = new SingleToDo(false, LocalDate.now(),"N/a");
            baseList.add(newEntry);
            return baseList;
        }

}
