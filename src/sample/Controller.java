package sample;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {
    public static void main(String[] args) {
        Map<String, String> Checkboxsave = new HashMap<String, String>();

        Checkboxsave.put("Trevor Storr", "Ford");
        Checkboxsave.put("John Doe", "Toyota");
        Checkboxsave.put("Jane Doe", "Subaru");


        for (Map.Entry me : Checkboxsave.entrySet()) {
            System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }

        String name = "Trevor Storr";
        String car = Checkboxsave.get(name);
        System.out.println (name + " owns a " + car  );

        try
        {
            FileOutputStream fos =
                    new FileOutputStream("ACNHsave.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Checkboxsave);
            oos.close();
            fos.close();
            System.out.printf("Saved");
        }catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
    // This controller is the main controller for switching windows, closing the program, and any other essential code that relates to each page

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
        Parent view2 = (Parent) FXMLLoader.load(this.getClass().getResource("Museum.fxml"));
        Scene scene2 = new Scene(view2);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    //villagers button

    @FXML
    public void addScene3(ActionEvent actionEvent) throws IOException {
        Parent view3 = (Parent) FXMLLoader.load(this.getClass().getResource("Villagers.fxml"));
        Scene scene3 = new Scene(view3);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
    }
    //home button

    @FXML
    public void addScene4(ActionEvent actionEvent) throws IOException {
        Parent view4 = (Parent) FXMLLoader.load(this.getClass().getResource("Home.fxml"));
        Scene scene4 = new Scene(view4);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene4);
        window.show();
    }

    //settings button
    @FXML
    public void addScene5(ActionEvent actionEvent) throws IOException {
        Parent view5 = (Parent) FXMLLoader.load(this.getClass().getResource("Settings.fxml"));
        Scene scene5 = new Scene(view5);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene5);
        window.show();
    }
    //back button

    @FXML
    public void back1(ActionEvent actionEvent) throws IOException {
        Parent home = (Parent) FXMLLoader.load(this.getClass().getResource("sample.fxml"));
        Scene home2 = new Scene(home);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(home2);
        window.show();
    }

    //close button

    @FXML
    private javafx.scene.control.Button closeButton;

    @FXML
    private void closeButtonAction() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    //museum tabs

    @FXML
    public void museumpaint1(ActionEvent actionEvent) throws IOException {
        Parent museum = (Parent) FXMLLoader.load(this.getClass().getResource("Museum.fxml"));
        Scene museum1 = new Scene(museum);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(museum1);
        window.show();
    }

    @FXML
    public void museumpaint2(ActionEvent actionEvent) throws IOException {
        Parent museum = (Parent) FXMLLoader.load(this.getClass().getResource("MuseumP2.fxml"));
        Scene museum2 = new Scene(museum);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(museum2);
        window.show();
    }

    @FXML
    public void museumpaint3(ActionEvent actionEvent) throws IOException {
        Parent museum = (Parent) FXMLLoader.load(this.getClass().getResource("MuseumP3.fxml"));
        Scene museum3 = new Scene(museum);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(museum3);
        window.show();
    }
}