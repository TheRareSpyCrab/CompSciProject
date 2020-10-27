package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import static java.lang.String.valueOf;

public class Controller {

    @FXML
    public javafx.scene.control.TextField textfield;
    public javafx.scene.control.CheckBox check1;
    public javafx.scene.control.CheckBox check2;
    public javafx.scene.control.CheckBox check3;
    public javafx.scene.control.CheckBox check4;
    public javafx.scene.control.CheckBox check5;
    public javafx.scene.control.CheckBox check6;
    public javafx.scene.control.CheckBox check7;
    public javafx.scene.control.CheckBox check8;
    public javafx.scene.control.CheckBox check9;
    public javafx.scene.control.CheckBox check10;
    public javafx.scene.control.CheckBox check11;
    public javafx.scene.control.CheckBox check12;
    public javafx.scene.control.CheckBox check13;
    public javafx.scene.control.CheckBox check14;
    public javafx.scene.control.CheckBox check15;
    public javafx.scene.control.CheckBox check16;
    public javafx.scene.control.CheckBox check17;
    public javafx.scene.control.CheckBox check18;
    public javafx.scene.control.CheckBox check19;
    public javafx.scene.control.CheckBox check20;
    public javafx.scene.control.CheckBox check21;
    public javafx.scene.control.CheckBox check22;
    public javafx.scene.control.CheckBox check23;
    public javafx.scene.control.CheckBox check24;
    public javafx.scene.control.CheckBox check25;
    public javafx.scene.control.CheckBox check26;
    public javafx.scene.control.CheckBox check27;
    public javafx.scene.control.CheckBox check28;
    public javafx.scene.control.CheckBox check29;
    public javafx.scene.control.CheckBox check30;
    static int ticksp1 = 0;

    public void PressButtonTicks(ActionEvent event){
        System.out.println("amount of ticks is: ");
        CountTheTicks();
    }
    public void CountTheTicks(){
        ticksp1 = 0;
        if (check1.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check2.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check3.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check4.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check5.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check6.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check7.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check8.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check9.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check10.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check11.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check12.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check13.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check14.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check15.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check16.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check17.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check18.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check19.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check20.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check21.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check22.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check23.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check24.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check25.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check26.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check27.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check28.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check29.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        if (check30.isSelected()) {
            ticksp1 = ticksp1 + 1;
        }
        countTotalTicks();
    }
    public void countTotalTicks(){
        int TotalTicks = ticksp1;
        System.out.println(TotalTicks);
        textfield.setText(valueOf(TotalTicks + "/43"));
    }


    // This controller is the main controller for switching windows, closing the program, and any other essential code that relates to each page
    @FXML
    public StackPane stackPane;
    public Pane MainPane;
    public Pane HomePane;
    public ScrollPane MuseumPane1;
    public ScrollPane MuseumPane2;
    public ScrollPane MuseumPane3;

    public void showPaneOne() {
        MainPane.setVisible(true);
        HomePane.setVisible(false);
        MuseumPane1.setVisible(false);
        MuseumPane2.setVisible(false);
        MuseumPane3.setVisible(false);
    }

    public void showPanetwo() {
        MainPane.setVisible(true);
        HomePane.setVisible(false);
        MuseumPane1.setVisible(false);
        MuseumPane2.setVisible(false);
        MuseumPane3.setVisible(false);
    }

    public void showPaneOnethree() {
        MainPane.setVisible(true);
        HomePane.setVisible(false);
        MuseumPane1.setVisible(false);
        MuseumPane2.setVisible(false);
        MuseumPane3.setVisible(false);
    }
    public void showPaneOnefour() {
        MainPane.setVisible(true);
        HomePane.setVisible(false);
        MuseumPane1.setVisible(false);
        MuseumPane2.setVisible(false);
        MuseumPane3.setVisible(false);
    }

    public void showPaneTwo() {
        MainPane.setVisible(false);
        HomePane.setVisible(true);
        MuseumPane1.setVisible(false);
        MuseumPane2.setVisible(false);
        MuseumPane3.setVisible(false);
    }

    public void showPaneThree() {
        MainPane.setVisible(false);
        HomePane.setVisible(false);
        MuseumPane1.setVisible(true);
        MuseumPane2.setVisible(false);
        MuseumPane3.setVisible(false);
    }

    public void showPaneOFour() {
        MainPane.setVisible(false);
        HomePane.setVisible(false);
        MuseumPane1.setVisible(false);
        MuseumPane2.setVisible(true);
        MuseumPane3.setVisible(false);
    }

    public void showPaneFive() {
        MainPane.setVisible(false);
        HomePane.setVisible(false);
        MuseumPane1.setVisible(false);
        MuseumPane2.setVisible(false);
        MuseumPane3.setVisible(true);
    }

    //close button

    @FXML
    private javafx.scene.control.Button closeButton;

    @FXML
    private void closeButtonAction() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }


}
