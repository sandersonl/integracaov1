package models;

import java.util.ArrayList;
import java.util.List;

public class CategoryModel {
    private int id, lineId;
    private String name, lineName;

    public CategoryModel() {
    }

    public CategoryModel(int id, String name, LineModel lineModel) {
        this.id = id;
        this.name = name;
        lineId = lineModel.getId();
        lineName = lineModel.getName();
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLineId() {
        return lineId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    public List<CategoryModel> getCategories() {

        LineModel cronos = new LineModel(1, "Cronos");
        LineModel ares = new LineModel(2, "Ares");

        List<CategoryModel> categoryList = new ArrayList<>();
        categoryList.add(new CategoryModel(1, "Cronos Old", cronos));
        categoryList.add(new CategoryModel(2, "Cronos L", cronos));
        categoryList.add(new CategoryModel(3, "Cronos NG", cronos));
        categoryList.add(new CategoryModel(4, "Ares TB", ares));
        categoryList.add(new CategoryModel(5, "Ares THS", ares));
        return categoryList;
    }
}