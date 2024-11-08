package models;

public class CategoryModel {
    private int id, lineId;
    private String categoryName, lineName;

    public CategoryModel() {
    }

    public CategoryModel(int id, String name, LineModel lineModel) {
        this.id = id;
        this.categoryName = name;
        lineId = lineModel.getId();
        lineName = lineModel.getLineName();
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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getLineId() {
        return lineId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }
}
