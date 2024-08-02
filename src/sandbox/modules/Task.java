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

    public String getProgress() {
        return progress;
    }
    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getExpectedTime() {
        return expectedTime;
    }
    public void setExpectedTime(String expectedTime) {
        this.expectedTime = expectedTime;
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

    public LocalDateTime getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDateTime getCompletionDate() {
        return completionDate;
    }
    public void setCompletionDate(LocalDateTime completionDate) {
        this.completionDate = completionDate;
    }

    public long getChecklistIdKey() {
        return checklistIdKey;
    }
    public void setChecklistIdKey(long checklistIdKey) {
        this.checklistIdKey = checklistIdKey;
    }

    // METHs
    public void test() {
        System.out.println("Task test");
    }

    // OVR
    @Override
    public String toString() {
        return "Task{" +
                "idKey=" + idKey +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priority='" + priority + '\'' +
                ", status=" + status +
                ", progress='" + progress + '\'' +
                ", expectedTime='" + expectedTime + '\'' +
                ", creationDate=" + creationDate +
                ", modifiedDate=" + modifiedDate +
                ", dueDate=" + dueDate +
                ", completionDate=" + completionDate +
                ", checklistIdKey=" + checklistIdKey +
                '}';
    }
}
