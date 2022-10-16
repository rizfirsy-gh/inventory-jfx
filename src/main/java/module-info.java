module com.rizfirsy.inventory {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.rizfirsy.inventory to javafx.fxml;
    exports com.rizfirsy.inventory;
}
