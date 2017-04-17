/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreboard;

import static java.lang.Math.abs;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
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
    public TextArea ta_console;
//--------------------------------------------------------------
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ta_console.setText("Enter Score Controller created.");
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
        // Convert to int, remove neg values, check for excess.
        if (isNumeric(score)) {
            Integer num_score = Integer.parseInt(score);
            if(num_score >= 0 && num_score <= 9999) {
                return Integer.parseInt(score);
            }
        }
        else {
            System.out.println("Error: Invalid score entry.");
            return 0; // Number unrealistic or invalid.
        }
        return 0; // Due diligence.
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

//--------------------------------------------------------------
    void bt_enter(EventHandler<ActionEvent> eventHandler) {
        
    }
}