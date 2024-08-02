package sandbox.modules;
import java.time.LocalDateTime;
import java.util.ArrayList;;

public class Cat {

    // ATTs
    private long idKey;
    private String title;
    private String descripton;                   // Purpose of chcklist

    // **DATES**
    private LocalDateTime creationDate;          // When created
    private LocalDateTime modifiedDate;          // When last modified

    // **LISTS**
    private ArrayList<String> refs;             // List of all ref used for this category
    private ArrayList<String> tags;             // <-- Enums: "auto", "rv", "trip", "maintenance", "repair"


    // CONs


    // GETs & SETs



    // METHs
    public void test() {
        System.out.println("Cat test");
    }

}

