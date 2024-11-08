package services.impl;

import models.CategoryModel;
import models.LineModel;
import services.ICategoryService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TempCategoryService implements ICategoryService {

    List<CategoryModel> categoryList;
    LineModel cronos = new LineModel(1, "Cronos");
    LineModel ares = new LineModel(2, "Ares");

    public TempCategoryService() {
        categoryList = new ArrayList<>();
        categoryList.add(new CategoryModel(1, "Cronos Old", cronos));
        categoryList.add(new CategoryModel(2, "Cronos L", cronos));
        categoryList.add(new CategoryModel(3, "Cronos NG", cronos));
        categoryList.add(new CategoryModel(4, "Ares TB", ares));
        categoryList.add(new CategoryModel(5, "Ares THS", ares));
    }

    @Override
    public List<CategoryModel> getCategoryList() {
        return categoryList;
    }

    @Override
    public List<CategoryModel> getCategoryByLineId(int id) {
        return categoryList.stream()
                .filter(categoryModel -> categoryModel.getLineId() == id)
                .collect(Collectors.toList());
    }
}