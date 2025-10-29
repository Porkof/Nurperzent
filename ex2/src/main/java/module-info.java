module com.example.circle {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.ex2 to javafx.fxml;
    exports com.example.ex2;
}