/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Crystal Gagne
 */

package ucf.assignments;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.CheckBox;

import java.time.LocalDate;

public class SingleToDo
{
    // This class needs to contain the fields that will be displayed
        // We need:
            // Boolean for status (for checkbox later)
                // *-- User needs to be able to click a checkbox (Controller Function)
            // LocalDate for due date
                // *-- User needs to be able to select/enter a date (Controller Function)
                    // -- Not in parameters; do not add: date entered
            // String description
                // *-- User needs to be able to type into the description box (Controller Function)

/*
    This class should only contain:
    SimpleBooleanProperty status; <-- allows for it to be edited
    LocalDate dueDate;
    SimpleStringProperty description; <-- allows the table to be editable

    As well as the setter, getter, and toString methods

 */

    private SimpleBooleanProperty status;
    private LocalDate dueDate;
    private SimpleStringProperty description;

    public SingleToDo(boolean status, LocalDate dueDate, String description)
    {
        this.status = new SimpleBooleanProperty(status);
        this.dueDate = dueDate;
        this.description = new SimpleStringProperty(description);
    }

    public boolean getStatus() { return status.get(); }
    public void setStatus(boolean status) {
        this.status.set(status);
    }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public String getDescription() {
        return description.get();
    }
    public SimpleStringProperty descriptionProperty() {
        return description;
    }
    public void setDescription(String description) {
        this.description = new SimpleStringProperty(description);
    }



}
