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
    protected Label score_1;
    protected Label score_2;
    protected Label score_3;
    protected Label score_4;
    protected Label score_5;
    protected Label score_6;
    protected Label score_7;
    protected Label score_8;
    protected Label score_9;
    protected Label score_10;
//--------------------------------------------------------------
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Board Controller created.");
    }
    public void update(ArrayList<Score> scores) {
        System.out.println("Updating scores.");
    }
}