
package sample;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {

    @FXML
    public void addScene2(ActionEvent actionEvent) throws IOException {
        Parent view1 = (Parent) FXMLLoader.load(this.getClass().getResource("sample.fxml"));
        Scene scene1 = new Scene(view1);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    public void addScene1(ActionEvent actionEvent) throws IOException {
        Parent view2 = (Parent)FXMLLoader.load(this.getClass().getResource("Museum.fxml"));
        Scene scene2 = new Scene(view2);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
}

