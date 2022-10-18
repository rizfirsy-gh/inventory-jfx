module com.rizfirsy.inventory {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires javafx.graphics;

    opens com.rizfirsy.inventory to javafx.fxml;
    exports com.rizfirsy.inventory;
}
