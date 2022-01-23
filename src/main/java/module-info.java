module com.mycompany.plantillainterfaces {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.plantillainterfaces to javafx.fxml;
    exports com.mycompany.plantillainterfaces;
}
