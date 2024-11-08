package models;

public class LineModel {
    private int id;
    private String lineName;

    public LineModel() {}

    public LineModel(int id, String name) {
        this.id = id;
        this.lineName = name;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
