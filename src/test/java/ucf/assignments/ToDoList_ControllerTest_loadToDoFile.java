/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Crystal Gagne
 */


package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class ToDoList_ControllerTest_loadToDoFile {

    @Test
    void loadToDoFile_CheckDescriptionIsLoaded_AssertEquals()
    {
        // verify the file can be opened
        // This could instead test the Class LoadFile
        ObservableList<SingleToDo> listForTesting = FXCollections.observableArrayList();
        File loadedFile = new File("src/test/java/ucf/assignments/test/loadTest.csv");

        LoadFile loadFile = new LoadFile();
        listForTesting = loadFile.writeSingleToDoExcel(loadedFile);
        String expected = "Difo was never a god.";
        String actual = listForTesting.get(0).getDescription();
        assertEquals(expected,actual);
    }
}