package views;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import models.CategoryModel;
import models.LineModel;
import models.MeterModel;
import services.CategoryService;
import services.LineService;
import services.ModelService;

import java.util.List;

public class MainView {

    ComboBox<String> comboBox;
    List<LineModel> lineList;
    List<CategoryModel> categoryList;
    List<MeterModel> modelList;
    LineService lineService;
    CategoryService categoryService;
    ModelService modelService;
    TitledPane titledPaneLine, titledPaneModel;
    TreeView<String> treeView;
    TreeItem<String> root, lineSelected, categorySelected, modelSelected;

    public VBox createMainView() {

        lineService = new LineService();
        modelService = new ModelService();
        categoryService = new CategoryService();

        lineList = lineService.getAllLine();
        categoryList = categoryService.getAllCategory();
        modelList = modelService.getAllModel();

        comboBox = new ComboBox<>();
        root = new TreeItem<>();
        root.setExpanded(true);
        treeView = new TreeView<>(root);
        treeView.setShowRoot(false);

        for (LineModel lineModel: lineList) {
            comboBox.getItems().add(lineModel.getLineName());
        }

        titledPaneLine = new TitledPane("Linhas", new HBox(new Label("Selecione uma linha"), comboBox));
        titledPaneModel = new TitledPane("Modelos", new HBox(new Label("Lista de Modelos"), treeView));

        comboBox.setOnAction(event -> {
            String valueSelected = comboBox.getValue();
            root.getChildren().clear();
            lineSelected = makeBranch(valueSelected, root);
            categoryList.stream()
                    .filter(categoryModel -> categoryModel.getLineName().equals(valueSelected))
                    .forEach(categoryModel -> {
                        categorySelected = makeBranch(categoryModel.getCategoryName(), lineSelected);
                        modelList.stream()
                                .filter(meterModel -> meterModel.getCategoryName().equals(categoryModel.getCategoryName()))
                                .forEach(meterModel -> modelSelected = makeBranch(meterModel.getName(), categorySelected));
                    });
            titledPaneModel.setExpanded(true);
        });

        Separator separator = new Separator();
        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(titledPaneLine,titledPaneModel);

        VBox layout = new VBox(20);
        layout.setPadding(new Insets(40));
        layout.getChildren().addAll(new Label("Autor: [Lucas]"), separator, accordion);

        return layout;

    }

    public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }

}
