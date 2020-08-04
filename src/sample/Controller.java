package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;


public class Controller {


    @FXML


    public void addScene(javafx.event.ActionEvent actionEvent)throws IOException {

        Parent view2 = FXMLLoader.load(getClass().getResource("Museum.fxml"));

        Scene scene2 =  new Scene(view2);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        window.setScene(scene2);

        window.show();

    }

}
