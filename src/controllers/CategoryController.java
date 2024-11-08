package controllers;

import models.CategoryModel;
import services.ICategoryService;
import services.impl.TempCategoryService;

import java.util.List;

public class CategoryController {

    private ICategoryService categoryService;

    public CategoryController() {
        categoryService = new TempCategoryService();
    }

    public List<CategoryModel> getAllCategory() {
        return categoryService.getCategoryList();
    }

    public List<CategoryModel> getCategoryByLineId(int id) {
        return categoryService.getCategoryByLineId(id);
    }

}
