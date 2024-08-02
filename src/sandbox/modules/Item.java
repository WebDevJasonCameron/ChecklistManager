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
    public long getIdKey() {
        return idKey;
    }
    public void setIdKey(long idKey) {
        this.idKey = idKey;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }
    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isVerified() {
        return verified;
    }
    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public long getTaskIdKey() {
        return taskIdKey;
    }
    public void setTaskIdKey(long taskIdKey) {
        this.taskIdKey = taskIdKey;
    }

    public LocalDateTime getRecordedDate() {
        return recordedDate;
    }
    public void setRecordedDate(LocalDateTime recordedDate) {
        this.recordedDate = recordedDate;
    }

    public ArrayList<String> getAttachments() {
        return attachments;
    }
    public void setAttachments(ArrayList<String> attachments) {
        this.attachments = attachments;
    }

    public ArrayList<String> getTags() {
        return tags;
    }
    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }


    // METHs


    // OVR
    public void test() {
        System.out.println("Item test");
    }


}