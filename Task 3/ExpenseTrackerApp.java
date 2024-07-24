import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ExpenseTrackerApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Expense Tracker");

        MainView mainView = new MainView();
        Scene scene = new Scene(mainView.createMainLayout(), 800, 600);
        scene.getStylesheets().add("styles.css");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
