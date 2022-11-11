module org.thatsneekol {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires com.jfoenix;

    opens org.thatsneekol to javafx.fxml;
    exports org.thatsneekol;
}
