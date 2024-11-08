
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import views.MainView;


public class Main extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        MainView mainView = new MainView();

        Scene scene = new Scene(mainView.createMainView(), 800, 800);
        window.setTitle("Projeto Integração");
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}