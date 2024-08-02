package sandbox.modules;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Task {

    // ATTs
    private long idKey;
    private String title;
    private String description;                 // What this task is for
    private String priority;                    // <-- Enum: "low", "medium", "high"
    private boolean status;                     // Completed?
    private String progress;                    // <-- Enum: 1-100
    private String expectedTime;                // How long it should take

    // **DATES**
    private LocalDateTime creationDate;         // When created
    private LocalDateTime modifiedDate;         // When last modified
    private LocalDateTime dueDate;              // When to complete
    private LocalDateTime completionDate;       // When last completed

    // **REFS**
    private long checklistIdKey;

    // CONs


    // GETs & SETs


    // METHs
    public void test() {
        System.out.println("Task test");
    }

}
