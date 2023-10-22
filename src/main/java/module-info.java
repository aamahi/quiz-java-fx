module com.example.easyquiz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.easyquiz to javafx.fxml;
    exports com.example.easyquiz;
}