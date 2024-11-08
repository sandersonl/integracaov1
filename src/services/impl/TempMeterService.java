package services.impl;

import models.LineModel;
import models.MeterModel;
import services.IMeterService;
import models.CategoryModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TempMeterService implements IMeterService {

    List<MeterModel> modelList;

    LineModel cronos = new LineModel(1, "Cronos");
    LineModel ares = new LineModel(2, "Ares");

    CategoryModel categoryCronosOld = new CategoryModel(1, "Cronos Old", cronos);
    CategoryModel categoryCronosL = new CategoryModel(2, "Cronos L", cronos);
    CategoryModel categoryCronosNg = new CategoryModel(3, "Cronos NG", cronos);
    CategoryModel categoryAresTb = new CategoryModel(4, "Ares TB", ares);
    CategoryModel categoryAresThs = new CategoryModel(5, "Ares THS", ares);

    public TempMeterService() {
        modelList = new ArrayList<>();

        modelList.add(new MeterModel(1, "Cronos 6001-A", categoryCronosOld));
        modelList.add(new MeterModel(2, "Cronos 6003", categoryCronosOld));
        modelList.add(new MeterModel(3, "Cronos 7023", categoryCronosOld));
        modelList.add(new MeterModel(4, "Cronos 6021", categoryCronosL));
        modelList.add(new MeterModel(5, "Cronos 6021L", categoryCronosL));
        modelList.add(new MeterModel(6, "Cronos 7023L", categoryCronosL));
        modelList.add(new MeterModel(7, "Cronos 6001-NG", categoryCronosNg));
        modelList.add(new MeterModel(8, "Cronos 6003-NG", categoryCronosNg));
        modelList.add(new MeterModel(9, "Cronos 6021-NG", categoryCronosNg));
        modelList.add(new MeterModel(10, "Cronos 6031-NG", categoryCronosNg));
        modelList.add(new MeterModel(11, "Cronos 7021-NG", categoryCronosNg));
        modelList.add(new MeterModel(12, "Cronos 7023-NG", categoryCronosNg));
        modelList.add(new MeterModel(13, "ARES 7021", categoryAresTb));
        modelList.add(new MeterModel(14, "ARES 7023", categoryAresTb));
        modelList.add(new MeterModel(15, "ARES 7031", categoryAresTb));
        modelList.add(new MeterModel(16, "ARES 8023 15", categoryAresThs));
        modelList.add(new MeterModel(17, "ARES 8023 200", categoryAresThs));
        modelList.add(new MeterModel(18, "ARES 8023 2,5", categoryAresThs));
    }

    @Override
    public List<MeterModel> getMeterList() {
        return modelList;
    }

    @Override
    public List<MeterModel> getMeterByCategoryId(int id) {
        return modelList.stream().filter(meterModel -> meterModel.getCategoryId() == id).collect(Collectors.toList());
    }
}
