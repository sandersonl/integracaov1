package services.impl;

import models.LineModel;
import services.ILineService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class TempLineService implements ILineService {
    List<LineModel> lineList;

    public TempLineService() {
        lineList = new ArrayList<>();
        lineList.add(new LineModel(1, "Cronos"));
        lineList.add(new LineModel(2, "Ares"));
    }

    @Override
    public List<LineModel> getLineList() {
        return lineList;
    }

    @Override
    public LineModel getLineById(int id) {
        Optional<LineModel> first = lineList.stream().filter(lineModel -> lineModel.getId() == id).findFirst();
        return first.orElse(null);
    }

}
