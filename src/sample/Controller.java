package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.HashMap;
import java.util.Map;
import java.util.prefs.Preferences;

import static java.lang.String.valueOf;

public class Controller {

    //all the check boxes and buttons etc
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

    //to saveeee


    public void saving()  {
        Preferences prefs = Preferences.userRoot().node(this.getClass().getName());




        prefs.putBoolean("check1", check1.isSelected());
        prefs.putBoolean("check2", check2.isSelected());
        prefs.putBoolean("check3", check3.isSelected());
        prefs.putBoolean("check4", check4.isSelected());
        prefs.putBoolean("check5", check5.isSelected());
        prefs.putBoolean("check6", check6.isSelected());
        prefs.putBoolean("check7", check7.isSelected());
        prefs.putBoolean("check8", check8.isSelected());
        prefs.putBoolean("check9", check9.isSelected());
        prefs.putBoolean("check10", check10.isSelected());
        prefs.putBoolean("check11", check11.isSelected());
        prefs.putBoolean("check12", check12.isSelected());
        prefs.putBoolean("check13", check13.isSelected());
        prefs.putBoolean("check14", check14.isSelected());
        prefs.putBoolean("check15", check15.isSelected());
        prefs.putBoolean("check16", check16.isSelected());
        prefs.putBoolean("check17", check17.isSelected());
        prefs.putBoolean("check18", check18.isSelected());
        prefs.putBoolean("check19", check19.isSelected());
        prefs.putBoolean("check20", check20.isSelected());
        prefs.putBoolean("check21", check21.isSelected());
        prefs.putBoolean("check22", check22.isSelected());
        prefs.putBoolean("check23", check23.isSelected());
        prefs.putBoolean("check24", check24.isSelected());
        prefs.putBoolean("check25", check25.isSelected());
        prefs.putBoolean("check26", check26.isSelected());
        prefs.putBoolean("check27", check27.isSelected());
        prefs.putBoolean("check28", check28.isSelected());
        prefs.putBoolean("check29", check29.isSelected());
        prefs.putBoolean("check30", check30.isSelected());


    }

    //to loaaadddd


    public void loading(){
        Preferences prefs = Preferences.userRoot().node(this.getClass().getName());
        boolean check1Saved = prefs.getBoolean("check1", false );
        boolean check2Saved = prefs.getBoolean("check2", false );
        boolean check3Saved = prefs.getBoolean("check3", false );
        boolean check4Saved = prefs.getBoolean("check4", false );
        boolean check5Saved = prefs.getBoolean("check5", false );
        boolean check6Saved = prefs.getBoolean("check6", false );
        boolean check7Saved = prefs.getBoolean("check7", false );
        boolean check8Saved = prefs.getBoolean("check8", false );
        boolean check9Saved = prefs.getBoolean("check9", false );
        boolean check10Saved = prefs.getBoolean("check10", false );
        boolean check11Saved = prefs.getBoolean("check11", false );
        boolean check12Saved = prefs.getBoolean("check12", false );
        boolean check13Saved = prefs.getBoolean("check13", false );
        boolean check14Saved = prefs.getBoolean("check14", false );
        boolean check15Saved = prefs.getBoolean("check15", false );
        boolean check16Saved = prefs.getBoolean("check16", false );
        boolean check17Saved = prefs.getBoolean("check17", false );
        boolean check18Saved = prefs.getBoolean("check18", false );
        boolean check19Saved = prefs.getBoolean("check19", false );
        boolean check20Saved = prefs.getBoolean("check20", false );
        boolean check21Saved = prefs.getBoolean("check21", false );
        boolean check22Saved = prefs.getBoolean("check22", false );
        boolean check23Saved = prefs.getBoolean("check23", false );
        boolean check24Saved = prefs.getBoolean("check24", false );
        boolean check25Saved = prefs.getBoolean("check25", false );
        boolean check26Saved = prefs.getBoolean("check26", false );
        boolean check27Saved = prefs.getBoolean("check27", false );
        boolean check28Saved = prefs.getBoolean("check28", false );
        boolean check29Saved = prefs.getBoolean("check29", false );
        boolean check30Saved = prefs.getBoolean("check30", false );

        check1.setSelected(check1Saved);
        check2.setSelected(check2Saved);
        check1.setSelected(check3Saved);
        check2.setSelected(check4Saved);
        check1.setSelected(check5Saved);
        check2.setSelected(check6Saved);
        check1.setSelected(check7Saved);
        check2.setSelected(check8Saved);
        check1.setSelected(check9Saved);
        check2.setSelected(check10Saved);
        check1.setSelected(check11Saved);
        check2.setSelected(check12Saved);
        check1.setSelected(check13Saved);
        check2.setSelected(check14Saved);
        check1.setSelected(check15Saved);
        check2.setSelected(check16Saved);
        check1.setSelected(check17Saved);
        check2.setSelected(check18Saved);
        check1.setSelected(check19Saved);
        check2.setSelected(check20Saved);
        check1.setSelected(check21Saved);
        check2.setSelected(check22Saved);
        check1.setSelected(check23Saved);
        check2.setSelected(check24Saved);
        check1.setSelected(check25Saved);
        check2.setSelected(check26Saved);
        check1.setSelected(check27Saved);
        check2.setSelected(check28Saved);
        check1.setSelected(check29Saved);
        check2.setSelected(check30Saved);

    }

    //So that the checkboxes count ye ye

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

    //prints out to the main menu yeeee yeee

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