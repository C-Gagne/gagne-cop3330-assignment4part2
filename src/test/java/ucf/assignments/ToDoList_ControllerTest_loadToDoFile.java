/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Crystal Gagne
 */


package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.time.LocalDate;

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

    @Test
    void loadToDoFile_CheckStatusIsLoaded_AssertEquals()
    {
        // verify the file can be opened
        // This could instead test the Class LoadFile
        ObservableList<SingleToDo> listForTesting = FXCollections.observableArrayList();
        File loadedFile = new File("src/test/java/ucf/assignments/test/loadTest.csv");

        LoadFile loadFile = new LoadFile();
        listForTesting = loadFile.writeSingleToDoExcel(loadedFile);
        boolean expected = false;
        boolean actual = listForTesting.get(0).getStatus();
        assertEquals(expected,actual);
    }

    @Test
    void loadToDoFile_CheckDueDateIsLoaded_AssertEquals()
    {
        // verify the file can be opened
        // This could instead test the Class LoadFile
        ObservableList<SingleToDo> listForTesting = FXCollections.observableArrayList();
        File loadedFile = new File("src/test/java/ucf/assignments/test/loadTest.csv");

        LoadFile loadFile = new LoadFile();
        listForTesting = loadFile.writeSingleToDoExcel(loadedFile);
        LocalDate expected = LocalDate.of(2021,07,9);
        LocalDate actual = listForTesting.get(0).getDueDate();
        assertEquals(expected,actual);
    }
}