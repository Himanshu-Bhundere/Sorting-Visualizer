module com.sortvisualizer.sortingvisualizer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.sortvisualizer.sortingvisualizer to javafx.fxml;
    exports com.sortvisualizer.sortingvisualizer;
}