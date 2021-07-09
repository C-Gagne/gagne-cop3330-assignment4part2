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

class ToDoList_ControllerTest_saveToDoFile {

    @Test
    void saveToDoFile_CheckFileIsMade_assertTrue()
    {
        // Verify file is created
            // see if the file can be opened
                // This could instead test the Class SaveFile
        ObservableList<SingleToDo> listForTesting = FXCollections.observableArrayList();
        listForTesting.add(new SingleToDo(false, LocalDate.now(), "Difo was never a god."));
        listForTesting.add(new SingleToDo(true, LocalDate.now(), "Go to class"));

        File selectedFile = new File("src/test/java/ucf/assignments/test/saveTest.csv");

        SaveFile saveFile = new SaveFile();
        saveFile.writeSingleToDoExcel(selectedFile, listForTesting);
        boolean exists = selectedFile.exists();
        assertTrue(exists);

    }
}