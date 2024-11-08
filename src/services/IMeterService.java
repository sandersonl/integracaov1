package services;

import models.MeterModel;

import java.util.List;

public interface IMeterService {
    List<MeterModel> getMeterList();
    List<MeterModel> getMeterByCategoryId(int id);
}
