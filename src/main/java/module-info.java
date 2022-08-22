module com.kensoftph.colorpicker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kensoftph.colorpicker to javafx.fxml;
    exports com.kensoftph.colorpicker;
}