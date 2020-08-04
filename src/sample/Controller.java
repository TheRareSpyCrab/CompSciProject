package sample;

import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Controller {
    //main buttons on homepage
    private Pane pnl_items,pnl_villagers,pnl_home,pnl_museum,pnl_settings;

    private JButton btn_items,btn_villagers,btn_home,btn_museum,btn_settings;

    private void handleButtonAction(ActionEvent event) {
        if(event.getSource() == btn_items)
        {
             pnl_items.toFront();
        }
        else
            if(event.getSource() == btn_items)
                pnl_items.toFront();
        else
            if(event.getSource() == btn_villagers)
                pnl_villagers.toFront();


        else
            if(event.getSource() ==  btn_home)
                 pnl_home.toFront();

        else
            if(event.getSource() ==  btn_museum)
                pnl_museum.toFront();

        else
            if(event.getSource() == btn_settings)
                pnl_settings.toFront();



    }


    public Controller(Pane pnl_items) {
        this.pnl_items = pnl_items;
    }
}
