import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MainView {
    public BorderPane createMainLayout() {
        BorderPane mainLayout = new BorderPane();

        // Top section with a menu bar
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem exitMenuItem = new MenuItem("Exit");
        exitMenuItem.setOnAction(event -> System.exit(0)); // Close the application
        fileMenu.getItems().add(exitMenuItem);
        menuBar.getMenus().add(fileMenu);

        // Center section with a form for expense entry
        GridPane expenseForm = new GridPane();
        expenseForm.setPadding(new Insets(10, 10, 10, 10));
        expenseForm.setVgap(8);
        expenseForm.setHgap(10);

        Label dateLabel = new Label("Date:");
        GridPane.setConstraints(dateLabel, 0, 0);
        DatePicker datePicker = new DatePicker();
        GridPane.setConstraints(datePicker, 1, 0);

        Label categoryLabel = new Label("Category:");
        GridPane.setConstraints(categoryLabel, 0, 1);
        TextField categoryInput = new TextField();
        GridPane.setConstraints(categoryInput, 1, 1);

        Label amountLabel = new Label("Amount:");
        GridPane.setConstraints(amountLabel, 0, 2);
        TextField amountInput = new TextField();
        GridPane.setConstraints(amountInput, 1, 2);

        Button addButton = new Button("Add Expense");
        GridPane.setConstraints(addButton, 1, 3);

        // Event handler for the Add Expense button
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String date = datePicker.getValue().toString();
                String category = categoryInput.getText();
                double amount = Double.parseDouble(amountInput.getText());
                
                // For now, just print the entered values to the console
                System.out.println("Date: " + date);
                System.out.println("Category: " + category);
                System.out.println("Amount: " + amount);
                
                // Clear the inputs after adding
                datePicker.setValue(null);
                categoryInput.clear();
                amountInput.clear();
            }
        });

        expenseForm.getChildren().addAll(dateLabel, datePicker, categoryLabel, categoryInput, amountLabel, amountInput, addButton);

        // Bottom section with a status bar
        Label statusBar = new Label("Welcome to the Expense Tracker!");

        // Assemble the layout
        mainLayout.setTop(menuBar);
        mainLayout.setCenter(expenseForm);
        mainLayout.setBottom(statusBar);

        return mainLayout;
    }
}
