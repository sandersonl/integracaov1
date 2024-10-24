
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;
    ComboBox<String> comboBox;
    MyTreeView myTreeView;
    VBox treeViewModel;
    TitledPane titledPaneLine, titledPaneModel;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        comboBox = new ComboBox<>();
        comboBox.getItems().addAll("" + "Cronos", "Ares");

        myTreeView = new MyTreeView();
        myTreeView.createTreeView();
        treeViewModel = new VBox();

        Separator separator = new Separator();

        titledPaneLine = new TitledPane("Linhas", new HBox(new Label("Selecione uma linha"), comboBox));
        titledPaneModel = new TitledPane("Modelos", new HBox(new Label("Lista de Modelos"), treeViewModel));

        comboBox.setOnAction( e -> {
            String comboBoxSelected = comboBox.getValue();
            TreeItem<String> root = new TreeItem<>();
            root.setExpanded(true);

            if("Cronos".equals(comboBoxSelected)) {
                root.getChildren().clear();
                root.getChildren().add(myTreeView.getCronos());
            } else if ("Ares".equals(comboBoxSelected)) {
                root.getChildren().clear();
                root.getChildren().add(myTreeView.getAres());
            }

            TreeView<String> selectedTreeView = new TreeView<>(root);
            selectedTreeView.setShowRoot(false);

            treeViewModel.getChildren().clear();
            treeViewModel.getChildren().add(selectedTreeView);

            titledPaneModel.setExpanded(true);
        });

        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(titledPaneLine, titledPaneModel);

        VBox layout = new VBox(20);
        layout.setPadding(new Insets(40));
        layout.getChildren().addAll(new Label("Autor: [Lucas]"), separator, accordion);

        Scene scene = new Scene(layout, 800, 800);
        window.setTitle("Projeto Integração");
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}