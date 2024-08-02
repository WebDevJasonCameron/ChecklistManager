package sandbox.modules;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Checklist {

    // ATTs
    private long idKey;
    private String title;
    private String description;             // Purpose of chcklist
    private String priority;                // <-- Enum
    private boolean status;                 // Completed?
    private int progress;                   // 0-100
    private String note;                    // Future module upgrades

    // **DATES**
    private LocalDateTime dueDate;           // When to complete
    private LocalDateTime creationDate;      // When created
    private LocalDateTime modifiedDate;      // When last modified

    // **LISTS**
    private ArrayList<String> tags;          // <-- Enums: "condition driven", "event driven", "action driven"...
    private ArrayList<Long> tasks;           // All tasks in checklist
    private ArrayList<Long> subChecklists;   // All checklist in this module
    private ArrayList<String> gear;          // Gear needed for this checklist

    // **TRIGGERS**
    private String conditionEvent;           // "levels fall below a certain point"
    private String locationEvent;            // object with "lat long and radius"
    private String actionEvent;              // Enum: "user sends email", etc.
    private String behaviorEvent;            // Enum: "heavy use", "no use 30 days"
    private String systemEvent;              // Enum: "equipment error coder", etc.
    private String environmentEvent;         // Enum: "temperature", "humidity"
    private String event;                    // Something that triggers the checklist
    private int interval;                    // How the checklist should be completed a year

    // **REFS**
    private long catIdKey;                   // the category this checklist belongs to

    // CONs

    // GETs & SETs


    // METHs
    public void test() {
        System.out.println("Checklist test");
    }

}