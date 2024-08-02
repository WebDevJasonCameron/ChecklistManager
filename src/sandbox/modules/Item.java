package sandbox.modules;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Item {
    private long idKey;
    private String title;
    private String description;               // Purpose of this Task Item
    private String value;                     // What value we find when we do this task item
    private String measurementUnit;           // <-- Enum: "inches", "feet", "miles", etc.
    private String note;                      // Identified issues with this task item
    private boolean status;                   // Completed?
    private boolean verified;                 // Verified by someone else (second look)
    private double cost;                      // Cost of this task item
    private long taskIdKey;                   // The task this item belongs to

    // **DATES**
    private LocalDateTime recordedDate;       // When this item was recorded

    // **LISTS**
    private ArrayList<String> attachments;    // List of all attachments for this task item (URLs)
    private ArrayList<String> tags;           // <-- Enums: "consumables", "repair"


    // CONs


    // GETs & SETs


}