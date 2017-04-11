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
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author brandon
 */
public class BoardController implements Initializable {
    @FXML
    
    public Text initial_1;
    public Text initial_2;
    public Text initial_3;
    public Text initial_4;
    public Text initial_5;
    public Text initial_6;
    public Text initial_7;
    public Text initial_8;
    public Text initial_9;
    public Text initial_10;
    public Text initial_11;
    public Text initial_12;
    public Text initial_13;
    public Text initial_14;
    public Text initial_15;
    public Text initial_16;
    public Text initial_17;
    public Text initial_18;
    public Text initial_19;
    public Text initial_20;
    public Text initial_21;
    public Text initial_22;
    public Text initial_23;
    public Text initial_24;
    public Text initial_25;
    
    public Text score_1;
    public Text score_2;
    public Text score_3;
    public Text score_4;
    public Text score_5;
    public Text score_6;
    public Text score_7;
    public Text score_8;
    public Text score_9;
    public Text score_10;
    public Text score_11;
    public Text score_12;
    public Text score_13;
    public Text score_14;
    public Text score_15;
    public Text score_16;
    public Text score_17;
    public Text score_18;
    public Text score_19;
    public Text score_20;
    public Text score_21;
    public Text score_22;
    public Text score_23;
    public Text score_24;
    public Text score_25;
    // I would love to create an array of these.
//--------------------------------------------------------------
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Board Controller created.");
        
        initial_1.setText(" ");
        initial_2.setText(" ");
        initial_3.setText(" ");
        initial_4.setText(" ");
        initial_5.setText(" ");
        initial_6.setText(" ");
        initial_7.setText(" ");
        initial_8.setText(" ");
        initial_9.setText(" ");
        initial_10.setText(" ");
        initial_11.setText(" ");
        initial_12.setText(" ");
        initial_13.setText(" ");
        initial_14.setText(" ");
        initial_15.setText(" ");
        initial_16.setText(" ");
        initial_17.setText(" ");
        initial_18.setText(" ");
        initial_19.setText(" ");
        initial_20.setText(" ");
        initial_21.setText(" ");
        initial_22.setText(" ");
        initial_23.setText(" ");
        initial_24.setText(" ");
        initial_25.setText(" ");
        
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
        score_11.setText(" ");
        score_12.setText(" ");
        score_13.setText(" ");
        score_14.setText(" ");
        score_15.setText(" ");
        score_16.setText(" ");
        score_17.setText(" ");
        score_18.setText(" ");
        score_19.setText(" ");
        score_20.setText(" ");
        score_21.setText(" ");
        score_22.setText(" ");
        score_23.setText(" ");
        score_24.setText(" ");
        score_25.setText(" ");
        
    }
    public void update(ArrayList<Score> scores) {
        // Not happy with the redundancy but am otherwise
        // unsure how to iterate through each label.
        int i = 0;
        
        try {
            initial_1.setText(scores.get(i).get_initials());
            score_1.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_2.setText(scores.get(i).get_initials());
            score_2.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_3.setText(scores.get(i).get_initials());
            score_3.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_4.setText(scores.get(i).get_initials());
            score_4.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_5.setText(scores.get(i).get_initials());
            score_5.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_6.setText(scores.get(i).get_initials());
            score_6.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_7.setText(scores.get(i).get_initials());
            score_7.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_8.setText(scores.get(i).get_initials());
            score_8.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_9.setText(scores.get(i).get_initials());
            score_9.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_10.setText(scores.get(i).get_initials());
            score_10.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_11.setText(scores.get(i).get_initials());
            score_11.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_12.setText(scores.get(i).get_initials());
            score_12.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_13.setText(scores.get(i).get_initials());
            score_13.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_14.setText(scores.get(i).get_initials());
            score_14.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_15.setText(scores.get(i).get_initials());
            score_15.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_16.setText(scores.get(i).get_initials());
            score_16.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_17.setText(scores.get(i).get_initials());
            score_17.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_18.setText(scores.get(i).get_initials());
            score_18.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_19.setText(scores.get(i).get_initials());
            score_19.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_20.setText(scores.get(i).get_initials());
            score_20.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_21.setText(scores.get(i).get_initials());
            score_21.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_22.setText(scores.get(i).get_initials());
            score_22.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_23.setText(scores.get(i).get_initials());
            score_23.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_24.setText(scores.get(i).get_initials());
            score_24.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        ++i;
        
        try {
            initial_25.setText(scores.get(i).get_initials());
            score_25.setText(scores.get(i).get_score().toString());
        }
        catch (Exception e) {
            System.out.println("Skipping unavailable entry: " + i);
        }
        
        System.out.println("Scores updated.");
    }
}