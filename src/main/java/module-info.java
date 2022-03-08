module com.example.projectbackpack {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.projectbackpack to javafx.fxml;
    exports com.example.projectbackpack;
    exports com.example.projectbackpack.controllers;
    opens com.example.projectbackpack.controllers to javafx.fxml;
}