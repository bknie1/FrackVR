/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreboard;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author brandon
 */
public class GUIController implements Initializable {
    
    @FXML
    private Label score_1;
    private Label score_2;
    private Label score_3;
    private Label score_4;
    private Label score_5;
    private Label score_6;
    private Label score_7;
    private Label score_8;
    private Label score_9;
    private Label score_10;
    
    ArrayList<Score> scores;

    public GUIController() {
        
    }
    
    @FXML
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    private void handleButtonAction(ActionEvent event) {

    }
    
    public void add_score(String initials, Integer score) {
        
    }
}