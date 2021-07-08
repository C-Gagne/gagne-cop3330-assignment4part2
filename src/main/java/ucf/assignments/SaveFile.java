/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Crystal Gagne
 */

package ucf.assignments;

import javafx.collections.ObservableList;
import javafx.stage.FileChooser;

import java.io.*;

import static javafx.stage.FileChooser.*;

public class SaveFile
{
    public void writeSingleToDoExcel(File selectedFile, ObservableList<SingleToDo> listToBeSaved) {
        // Calls getUserInput to get the file name to save to
        // Using a writer, that data will be written to a csv (...)
            // (...) as a string, separated by commas
        Writer writer = null;
        try {
            File file = new File(selectedFile.getAbsolutePath());
            writer = new BufferedWriter(new FileWriter(file));
            for (SingleToDo toDoList : listToBeSaved) {
                String text = toDoList.getStatus() + "," + toDoList.getDueDate() + "," + toDoList.getDescription() + "\n";
                writer.write(text);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
