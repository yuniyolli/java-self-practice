module com.example.javaself {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaself to javafx.fxml;
    exports com.example.javaself;
}