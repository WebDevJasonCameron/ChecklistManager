package sandbox.builders;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import sandbox.modules.Cat;

import java.io.FileWriter;
import java.io.IOException;

public class Builder {

    public void buildCat(String catTitle) {
        Cat cat = new Cat();
        cat.setTitle(catTitle);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("testOutput.json")) {
            writer.write(gson.toJson(cat));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }






}
