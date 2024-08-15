package sandbox.java;

import sandbox.modules.Cat;
import sandbox.modules.Checklist;
import sandbox.modules.Item;
import sandbox.modules.Task;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Checklist checklist = new Checklist();
        Task task = new Task();
        Item item = new Item();

        cat.setTitle("Test Title");

//        cat.test();
//        checklist.test();
//        task.test();
//        item.test();

        System.out.println(cat.getTitle());

    }
}