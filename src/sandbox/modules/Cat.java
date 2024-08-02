package sandbox.modules;
import java.time.LocalDateTime;
import java.util.ArrayList;;

public class Cat {

    // ATTs
    private long idKey;
    private String title;
    private String description;                 // Purpose of checklist

    // **DATES**
    private LocalDateTime creationDate;         // When created
    private LocalDateTime modifiedDate;         // When last modified

    // **LISTS**
    private ArrayList<String> refs;             // List of all ref used for this category
    private ArrayList<String> tags;             // <-- Enums: "auto", "rv", "trip", "maintenance", "repair"


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

    public ArrayList<String> getRefs() {
        return refs;
    }
    public void setRefs(ArrayList<String> refs) {
        this.refs = refs;
    }

    public ArrayList<String> getTags() {
        return tags;
    }
    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    // METHs
    public void test() {
        System.out.println("Cat test");
    }


    // OVR
    @Override
    public String toString() {
        return "Cat{" +
                "idKey=" + idKey +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                ", modifiedDate=" + modifiedDate +
                ", refs=" + refs +
                ", tags=" + tags +
                '}';
    }



}

