import javafx.geometry.Insets;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;

public class MyTreeView {

    private TreeItem<String> ares, aresTb, aresThs;
    private TreeItem<String> cronos, cronosOld, cronosL, cronosNG;

    public VBox createTreeView(){

        TreeItem<String> root;
        root = new TreeItem<>();
        root.setExpanded(true);

        cronos = makeBranch("Cronos", root);
        cronosOld = makeBranch("Cronos Old", cronos);
        makeBranch("Cronos 6001-A", cronosOld);
        makeBranch("Cronos 6003", cronosOld);
        makeBranch("Cronos 7023", cronosOld);

        cronosL = makeBranch("Cronos L", cronos);
        makeBranch("Cronos 6021L", cronosL);
        makeBranch("Cronos 6021L", cronosL);
        makeBranch("Cronos 7023L", cronosL);

        cronosNG = makeBranch("Cronos NG", cronos);
        makeBranch("Cronos 6001-NG", cronosNG);
        makeBranch("Cronos 6003-NG", cronosNG);
        makeBranch("Cronos 6021-NG", cronosNG);
        makeBranch("Cronos 6031-NG", cronosNG);
        makeBranch("Cronos 7021-NG", cronosNG);
        makeBranch("Cronos 7023-NG", cronosNG);

        ares = makeBranch("Ares", root);
        aresTb = makeBranch("Ares TB", ares);
        makeBranch("ARES 7021", aresTb);
        makeBranch("ARES 7031", aresTb);
        makeBranch("ARES 7023", aresTb);

        aresThs = makeBranch("Ares THS", ares);
        makeBranch("ARES 8023 15", aresThs);
        makeBranch("ARES 8023 200", aresThs);
        makeBranch("ARES 8023 2,5", aresThs);

        TreeView<String> tree = new TreeView<>(root);
        tree.setShowRoot(false);

        VBox vBox = new VBox(tree);
        vBox.setPadding(new Insets(10));

        return vBox;
    }

    public TreeItem<String> makeBranch(String title, TreeItem<String> parent){
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }

    public TreeItem<String> getCronos(){
        return cronos;
    }

    public TreeItem<String> getAres(){
        return ares;
    }

}
