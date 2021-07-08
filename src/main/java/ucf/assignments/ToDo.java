/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Crystal Gagne
 */


package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/*
    The application shall be able to manage at least 100 unique todo lists
        // Should be inherit in Map + List

    A todo list shall have a title
        // We can create a Map where the Title is the Key, and the Value is the List of To Do items under that Key.
            // One will be List_Of_Entries (containing the Title and List)
                // The other will be Entry (Containing Completion Status, Due Date, and Description)
    A todo list shall have the capacity to store at least 100 unique items
        // This property should be inherit if we use a Map<String,List>

    An item shall have a description
        // Included in "Entry" as String description
    An item shall have a due date, formatted as YYYY-MM-DD
        // Included in "Entry" as LocalDate dueDate

    A user shall be able to add a new todo list
        // Included inside of ToDo_Controller
    A user shall be able to remove an existing todo list
        // Included in ToDo_Controller
    A user shall be able to edit the title of an existing todo list
        // Included in ToDo_Controller
    A user shall be able to add a new item to an existing todo list
            // Included in ToDoList_Controller
    A user shall be able to remove an item from an existing todo list
            // Included in ToDoList_Controller
    A user shall be able to edit the description of an item within an existing todo list
            // Included in ToDoList_Controller
    A user shall be able to edit the due date of an item within an existing todo list
            // Included in ToDoList_Controller
    A user shall be able to mark an item in a todo list as complete
            // Included in ToDoList_Controller
    A user shall be able to display all of the existing items in a todo list
            // Included in ToDoList_Controller
    A user shall be able to display only the incomplete items in a todo list
            // Included in ToDoList_Controller
    A user shall be able to display only the completed items in a todo list
            // Included in ToDoList_Controller
    A user shall be able to save all of the items in a single todo list to external storage
                // Included in SaveFile
    A user shall be able to save all of the items across all of the todo lists to external storage
                // Included in SaveFile
    A user shall be able to load a single todo list that was previously saved to external storage
                // Included in LoadFile
    A user shall be able to load multiple todo lists that were previous saved to external storage
                // Included in LoadFile
*/


public class ToDo extends Application {
    // This class should only contain main() and start()

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ToDo.fxml"));

            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.setTitle("To Do List");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
