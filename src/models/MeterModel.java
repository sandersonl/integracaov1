package models;

import java.util.ArrayList;
import java.util.List;

public class MeterModel {
    private int id, categoryId;
    private String name, categoryName;

    public MeterModel(){}

    public MeterModel(int id, String name, CategoryModel categoryModel) {
        this.id = id;
        this.name = name;
        categoryId = categoryModel.getId();
        categoryName = categoryModel.getName();
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

    public List<MeterModel> getMeters() {

        LineModel cronos = new LineModel(1, "Cronos");
        LineModel ares = new LineModel(2, "Ares");

        CategoryModel categoryCronosOld = new CategoryModel(1, "Cronos Old", cronos);
        CategoryModel categoryCronosL = new CategoryModel(2, "Cronos L", cronos);
        CategoryModel categoryCronosNg = new CategoryModel(3, "Cronos NG", cronos);
        CategoryModel categoryAresTb = new CategoryModel(4, "Ares TB", ares);
        CategoryModel categoryAresThs = new CategoryModel(5, "Ares THS", ares);

        List<MeterModel> meterList = new ArrayList<>();
        meterList.add(new MeterModel(1, "Cronos 6001-A", categoryCronosOld));
        meterList.add(new MeterModel(2, "Cronos 6003", categoryCronosOld));
        meterList.add(new MeterModel(3, "Cronos 7023", categoryCronosOld));
        meterList.add(new MeterModel(4, "Cronos 6021", categoryCronosL));
        meterList.add(new MeterModel(5, "Cronos 6021L", categoryCronosL));
        meterList.add(new MeterModel(6, "Cronos 7023L", categoryCronosL));
        meterList.add(new MeterModel(7, "Cronos 6001-NG", categoryCronosNg));
        meterList.add(new MeterModel(8, "Cronos 6003-NG", categoryCronosNg));
        meterList.add(new MeterModel(9, "Cronos 6021-NG", categoryCronosNg));
        meterList.add(new MeterModel(10, "Cronos 6031-NG", categoryCronosNg));
        meterList.add(new MeterModel(11, "Cronos 7021-NG", categoryCronosNg));
        meterList.add(new MeterModel(12, "Cronos 7023-NG", categoryCronosNg));
        meterList.add(new MeterModel(13, "ARES 7021", categoryAresTb));
        meterList.add(new MeterModel(14, "ARES 7023", categoryAresTb));
        meterList.add(new MeterModel(15, "ARES 7031", categoryAresTb));
        meterList.add(new MeterModel(16, "ARES 8023 15", categoryAresThs));
        meterList.add(new MeterModel(17, "ARES 8023 200", categoryAresThs));
        meterList.add(new MeterModel(18, "ARES 8023 2,5", categoryAresThs));

        return meterList;
    }

}
