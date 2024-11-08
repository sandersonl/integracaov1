package services;

import controllers.CategoryController;
import models.CategoryModel;

import java.util.List;

public class CategoryService {

    CategoryController categoryController = new CategoryController();

    public CategoryService() {
    }

    public List<CategoryModel> getAllCategory() {
        return categoryController.getAllCategory();
    }

    public List<CategoryModel> getCategoryByLineId(int id) {
        return categoryController.getCategoryByLineId(id);
    }

}
