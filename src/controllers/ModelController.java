package controllers;

import models.MeterModel;
import services.IMeterService;
import services.impl.TempMeterService;

import java.util.List;

public class ModelController {

    private IMeterService meterService;

    public ModelController() {
        meterService = new TempMeterService();
    }

    public List<MeterModel> getAllModel() {
        return meterService.getMeterList();
    }

    public List<MeterModel> getModelByCategoryId(int id) {
        return meterService.getMeterByCategoryId(id);
    }
}
