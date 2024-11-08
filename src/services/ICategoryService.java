package services;

import models.CategoryModel;

import java.util.List;

public interface ICategoryService {
    List<CategoryModel> getCategoryList();
    List<CategoryModel> getCategoryByLineId(int id);
}
