/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreboard;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author brandon
 */
public class BoardController implements Initializable {
    @FXML
    // These elements don't require interaction.
//  private AnchorPane main_anchor;
//  private Rectangle divider;
//  private Label lbl_title;
//  private Label lbl_one;
//  private Label lbl_two;
//  private Label lbl_three;
//  private Label lbl_four;
//  private Label lbl_five;
//  private Label lbl_six;
//  private Label lbl_seven;
//  private Label lbl_eight;
//  private Label lbl_nine;
//  private Label lbl_ten;
    public Label score_1;
    public Label score_2;
    public Label score_3;
    public Label score_4;
    public Label score_5;
    public Label score_6;
    public Label score_7;
    public Label score_8;
    public Label score_9;
    public Label score_10;
//--------------------------------------------------------------
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Board Controller created.");
        score_1.setText(" ");
        score_2.setText(" ");
        score_3.setText(" ");
        score_4.setText(" ");
        score_5.setText(" ");
        score_6.setText(" ");
        score_7.setText(" ");
        score_8.setText(" ");
        score_9.setText(" ");
        score_10.setText(" ");
    }
    public void update(ArrayList<Score> scores) {
        // Not happy with the redundancy but am otherwise
        // unsure how to iterate through each label.
        int i = 0;
        
        try {
            score_1.setText(scores.get(i).get_initials() + 
                   "\t  " + scores.get(i).get_score());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            score_2.setText(scores.get(i).get_initials() + 
                   "\t\t" + scores.get(i).get_score());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            score_3.setText(scores.get(i).get_initials() + 
                   "\t\t" + scores.get(i).get_score());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            score_4.setText(scores.get(i).get_initials() + 
                   "\t\t" + scores.get(i).get_score());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            score_5.setText(scores.get(i).get_initials() + 
                   "\t\t" + scores.get(i).get_score());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            score_6.setText(scores.get(i).get_initials() + 
                   "\t\t" + scores.get(i).get_score());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            score_7.setText(scores.get(i).get_initials() + 
                   "\t\t" + scores.get(i).get_score());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            score_8.setText(scores.get(i).get_initials() + 
                   "\t\t" + scores.get(i).get_score());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            score_9.setText(scores.get(i).get_initials() + 
                   "\t\t" + scores.get(i).get_score());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            score_10.setText(scores.get(i).get_initials() + 
                    "\t\t" + scores.get(i).get_score());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        
        System.out.println("Scores updated.");
    }
}