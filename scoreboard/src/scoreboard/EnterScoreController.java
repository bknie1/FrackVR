/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
// import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author brandon
 */
public class EnterScoreController implements Initializable {
    @FXML
    // These elements don't require interaction.
//  private HBox actionParent;
//  private HBox okParent;
    protected Button bt_enter;
    public TextField initials_entry;
    public TextField score_entry;
//--------------------------------------------------------------
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Enter Score Controller created.");
    }
//--------------------------------------------------------------
    public String get_initials() {
        String initials = "AAA";
        initials = initials_entry.getText(0, 3);
        initials = initials.trim();
        initials = initials.toUpperCase();
        return initials;
    }
//--------------------------------------------------------------
    public Integer get_score() {
        String score = "0";
        score = score_entry.getText();
        score = score.trim();
        if (isNumeric(score)) {
            return Integer.parseInt(score);
        }
        return 0;
    }
//--------------------------------------------------------------
    public boolean isNumeric(String str) {  
        try {
            Integer i = Integer.parseInt(str);  
        }
        catch(NumberFormatException nfe) {  
            return false;
        }
        return true;  
    }
//--------------------------------------------------------------
    void bt_enter(EventHandler<ActionEvent> eventHandler) {
        
    }
}