package sandbox.modules;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Checklist {

    // ATTs
    private long idKey;
    private String title;
    private String description;             // Purpose of checklist
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

    // **REFS**
    private long catIdKey;                   // the category this checklist belongs to

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

    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }

    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getProgress() {
        return progress;
    }
    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }
    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public ArrayList<String> getTags() {
        return tags;
    }
    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public ArrayList<Long> getTasks() {
        return tasks;
    }
    public void setTasks(ArrayList<Long> tasks) {
        this.tasks = tasks;
    }

    public ArrayList<Long> getSubChecklists() {
        return subChecklists;
    }
    public void setSubChecklists(ArrayList<Long> subChecklists) {
        this.subChecklists = subChecklists;
    }

    public ArrayList<String> getGear() {
        return gear;
    }
    public void setGear(ArrayList<String> gear) {
        this.gear = gear;
    }

    public long getCatIdKey() {
        return catIdKey;
    }
    public void setCatIdKey(long catIdKey) {
        this.catIdKey = catIdKey;
    }

    // METHs
    public void test() {
        System.out.println("Checklist test");
    }


    // OVR
    @Override
    public String toString() {
        return "Checklist{" +
                "idKey=" + idKey +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priority='" + priority + '\'' +
                ", status=" + status +
                ", progress=" + progress +
                ", note='" + note + '\'' +
                ", dueDate=" + dueDate +
                ", creationDate=" + creationDate +
                ", modifiedDate=" + modifiedDate +
                ", tags=" + tags +
                ", tasks=" + tasks +
                ", subChecklists=" + subChecklists +
                ", gear=" + gear +
                ", conditionEvent='" + conditionEvent + '\'' +
                ", locationEvent='" + locationEvent + '\'' +
                ", actionEvent='" + actionEvent + '\'' +
                ", behaviorEvent='" + behaviorEvent + '\'' +
                ", systemEvent='" + systemEvent + '\'' +
                ", environmentEvent='" + environmentEvent + '\'' +
                ", event='" + event + '\'' +
                ", interval=" + interval +
                ", catIdKey=" + catIdKey +
                '}';
    }
}