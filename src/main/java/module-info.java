module com.github.sportsleaguemanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.github.sportsleaguemanagement to javafx.fxml;
    exports com.github.sportsleaguemanagement;
}