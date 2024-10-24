import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TreeViewModelos extends Application {

    Stage window;
    TreeView<String> tree;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        TreeItem<String> root, categoria, modelo;

        root = new TreeItem<>();
        root.setExpanded(true);

        categoria = makeBranch("Ares TB", root);
        makeBranch("ARES 7021", categoria);
        makeBranch("ARES 7031", categoria);
        makeBranch("ARES 7023", categoria);

        modelo = makeBranch("Ares THS", root);
        makeBranch("ARES 8023 15", modelo);
        makeBranch("ARES 8023 200", modelo);
        makeBranch("ARES 8023 2.5", modelo);

        tree = new TreeView<>(root);
        tree.setShowRoot(false);

        StackPane layout = new StackPane();
        layout.getChildren().addAll(tree);
        Scene scene = new Scene(layout, 400, 300);

        window.setScene(scene);
        window.show();
    }

    public TreeItem<String> makeBranch(String title, TreeItem<String> parent){
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }

}