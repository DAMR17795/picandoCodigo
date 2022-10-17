module com.example.picandocodigo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.picandocodigo to javafx.fxml;
    exports com.example.picandocodigo;
}