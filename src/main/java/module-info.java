module com.example.bankmanagment_version {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;
    opens com.example.bankmanagment_version02 to javafx.fxml;
    exports com.example.bankmanagment_version02;
    exports com.example.bankmanagment_version02.utils;
    opens com.example.bankmanagment_version02.utils to javafx.fxml;
    exports com.example.bankmanagment_version02.ui.screens;
    opens com.example.bankmanagment_version02.ui.screens to javafx.fxml;
    exports com.example.bankmanagment_version02.ui.viewmodel;
    opens com.example.bankmanagment_version02.ui.viewmodel to javafx.fxml;
    exports com.example.bankmanagment_version02.data;
    opens com.example.bankmanagment_version02.data to javafx.fxml;
    exports com.example.bankmanagment_version02.data.model;
    opens com.example.bankmanagment_version02.data.model to javafx.fxml;
    exports library;
    opens library to javafx.fxml;
    exports library.inputype;
    opens library.inputype to javafx.fxml;
    exports library.outputfield;
    opens library.outputfield to javafx.fxml;
    exports library.layouts;
    opens library.layouts to javafx.fxml;

}