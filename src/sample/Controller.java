
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

              //Items button
    @FXML
    public void addScene2(ActionEvent actionEvent) throws IOException {
        Parent view1 = (Parent) FXMLLoader.load(this.getClass().getResource("Items.fxml"));
        Scene scene1 = new Scene(view1);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
             //Museum button

    @FXML
    public void addScene1(ActionEvent actionEvent) throws IOException {
        Parent view2 = (Parent)FXMLLoader.load(this.getClass().getResource("Museum.fxml"));
        Scene scene2 = new Scene(view2);
        scene2.getStylesheets().add("/sample/CSS/stylesheet1.css");
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
              //villagers button

    @FXML
    public void addScene3(ActionEvent actionEvent) throws IOException{
        Parent view3 = (Parent)FXMLLoader.load(this.getClass().getResource("Villagers.fxml"));
        Scene scene3 = new Scene(view3);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }
                //home button

    @FXML
    public void addScene4(ActionEvent actionEvent) throws IOException{
        Parent view4 = (Parent)FXMLLoader.load(this.getClass().getResource("Home.fxml"));
        Scene scene4 = new Scene(view4);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene4);
        window.show();
    }
             //settings button
    @FXML
    public void addScene5(ActionEvent actionEvent) throws IOException{
        Parent view5 = (Parent)FXMLLoader.load(this.getClass().getResource("Settings.fxml"));
        Scene scene5 = new Scene(view5);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene5);
        window.show();
    }
              //back button

    @FXML
    public void back1(ActionEvent actionEvent) throws IOException{
        Parent home = (Parent)FXMLLoader.load(this.getClass().getResource("sample.fxml"));
        Scene home2 = new Scene(home);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(home2);
        window.show();
    }

    




    //media thingy lmao doesn't work

    //@FXML
    //private MediaView media;
    //private  static final  String media_url = "chew.mp4";
    //public void initialize(URL location, ResourceBundle resources) {
        //System.out.println(location.toString());
        //System.out.println(this.getClass().getResource(media_url).toExternalForm());
        //MediaPlayer mediaPlayer = new MediaPlayer(new Media(this.getClass().getResource(media_url).toExternalForm()));
       // mediaPlayer.setAutoPlay(true);
        //media.setMediaPlayer(mediaPlayer);
    //}
}

