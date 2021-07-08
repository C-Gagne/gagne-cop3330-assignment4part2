/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Crystal Gagne
 */

package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.time.LocalDate;

public class LoadFile
{
    public ObservableList<SingleToDo> writeSingleToDoExcel(File selectedFile) {
        // Calls getUserInput to get the file name to load from
        // Get name of user file
              // Parse the csv
                // Display error if the csv is not found
        // Using an Observable List, that data will be read from a csv (...)
            // Read each row
                // for each row, add the data to the table
        ObservableList<SingleToDo> loadedList = FXCollections.observableArrayList();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(selectedFile.getAbsolutePath()));
            String newLine;
            while ((newLine = bufferedReader.readLine())!= null)
            {
                String[] fromCSV = newLine.split(",", -1);
                SingleToDo loadedToDo = new SingleToDo(Boolean.parseBoolean(fromCSV[0]), LocalDate.parse(fromCSV[1]), fromCSV[2]);
                loadedList.add(loadedToDo);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return loadedList;
    }
}
