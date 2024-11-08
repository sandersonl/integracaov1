package models;

public class MeterModel {
    private int id, categoryId;
    private String name, categoryName;

    public MeterModel(){}

    public MeterModel(int id, String name, CategoryModel categoryModel) {
        this.id = id;
        this.name = name;
        categoryId = categoryModel.getId();
        categoryName = categoryModel.getCategoryName();
    }

    public int getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
