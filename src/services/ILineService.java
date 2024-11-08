package services;

import models.LineModel;

import java.util.List;

public interface ILineService {
    List<LineModel> getLineList();
    LineModel getLineById(int id);
}
