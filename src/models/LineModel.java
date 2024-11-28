package models;

import java.util.ArrayList;
import java.util.List;

public class LineModel {
    private int id;
    private String name;

    public LineModel() {
    }

    public LineModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String lineName) {
        this.name = lineName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<LineModel> getLines() {
        List<LineModel> lineList = new ArrayList<>();
        lineList.add(new LineModel(1, "Cronos"));
        lineList.add(new LineModel(2, "Ares"));
        return lineList;
    }

}