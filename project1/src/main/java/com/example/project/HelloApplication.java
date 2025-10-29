package com.example.project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    private ListView<String> notesListView = new ListView<>();
    private TextArea noteTextArea = new TextArea();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Заметки");

        Button addButton = new Button("Добавить");
        Button deleteButton = new Button("Удалить");
        Button saveButton = new Button("Сохранить");
        HBox controls = new HBox(10, addButton, deleteButton, saveButton);

        BorderPane root = new BorderPane();
        root.setLeft(notesListView);
        root.setCenter(noteTextArea);
        root.setBottom(controls);

        root.setPrefSize(1000, 800);
        notesListView.setPrefWidth(200);
        noteTextArea.setWrapText(true);

        // Button Actions
        addButton.setOnAction(e -> addNote());
        deleteButton.setOnAction(e -> deleteNote());
        saveButton.setOnAction(e -> saveNote());

        // Listener for ListView selection
        notesListView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> loadNote());

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addNote() {
        String newNote = generateUniqueNoteTitle();
        notesListView.getItems().add(newNote);
        notesListView.getSelectionModel().select(newNote);
        noteTextArea.setText("");
    }

    private void deleteNote() {
        int selectedIndex = notesListView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            notesListView.getItems().remove(selectedIndex);
            noteTextArea.clear(); // Clear the TextArea when a note is deleted
        } else {
            showAlert("Ошибка", "Выберите заметку для удаления.");
        }
    }

    private void saveNote() {
        int selectedIndex = notesListView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            String updatedNote = noteTextArea.getText();
            if (!updatedNote.isEmpty()) {
                notesListView.getItems().set(selectedIndex, updatedNote);
            } else {
                showAlert("Ошибка", "Заметка не может быть пустой.");
            }
        } else {
            showAlert("Ошибка", "Выберите заметку для сохранения.");
        }
    }

    private void loadNote() {
        int selectedIndex = notesListView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            String selectedNote = notesListView.getItems().get(selectedIndex);
            noteTextArea.setText(selectedNote);
        } else {
            noteTextArea.clear(); // Clear when no note is selected
        }
    }

    // Helper method to generate unique note titles
    private String generateUniqueNoteTitle() {
        int count = 1;
        String baseTitle = "Новая заметка";
        String newTitle = baseTitle;
        while (notesListView.getItems().contains(newTitle)) {
            newTitle = baseTitle + " " + count++;
        }
        return newTitle;
    }

    // Helper method to show an alert dialog
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
