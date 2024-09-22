module qut.group83.cab302_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.net.http;
    requires com.google.gson;


    opens qut.group83.cab302_project to javafx.fxml;
    exports qut.group83.cab302_project;
}