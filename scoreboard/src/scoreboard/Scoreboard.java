/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreboard;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
//--------------------------------------------------------------
public class Scoreboard extends Application {
    // For GUI element interaction.
    static BoardController board_controller;
    static EnterScoreController score_controller;
    // Stores all player information.
    ArrayList<Score> scores = new ArrayList<>();
    
    @Override
    public void start(Stage stage) throws Exception {
        // Scene Setup
        board_scene(stage);
        score_scene();
        
        // Listeners: Must be AFTER Scene Setup/controller assignment.
        score_controller.bt_enter.setOnAction(new Add_Score() );
    }
//--------------------------------------------------------------
    public void board_scene(Stage stage) throws Exception {
        //Set up instance instead of using static load() method.
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Board.fxml"));
        Parent root = loader.load();
        // Accessing getController() through the instance.
        // Don't forget the type cast.
        board_controller = (BoardController)loader.getController();

        Scene sc_board = new Scene(root);
        stage.setScene(sc_board);
        stage.setTitle("VRAC-MAN High Scores");
        stage.show();
    }
//--------------------------------------------------------------
    public void score_scene() throws Exception {        
        Stage st_score = new Stage();
        
        //Set up instance instead of using static load() method.
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EnterScore.fxml"));
        Parent root = loader.load();
        // Accessing getController() through the instance.
        // Don't forget the type cast.
        score_controller = (EnterScoreController)loader.getController();
        
        Scene sc_score = new Scene(root);
        st_score.setScene(sc_score);
        st_score.setTitle("VRAC-MAN: Enter Score");
        st_score.initStyle(StageStyle.UNIFIED); // Includes false resize.
        st_score.show();
        
        read_scores();
        
        sc_score.setOnKeyReleased(new KeyPressed());
    }
//--------------------------------------------------------------
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
//--------------------------------------------------------------
    class KeyPressed implements EventHandler<KeyEvent> {
        @Override
        public void handle(KeyEvent e) {
            KeyCode kcKey = e.getCode();
            switch (kcKey) {
            case ENTER:
            Add_Score score = new Add_Score();
            score.handle();
            default:
                 break;
            }
        }
//--------------------------------------------------------------
    }
    class Add_Score implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            new_score();
        }
        public void handle() {
            new_score();
        }
    }
//--------------------------------------------------------------
    public void new_score() {
        String i;
        Integer s;
        i = score_controller.get_initials();
        s = score_controller.get_score();
        
        if(s == 0) {
            reset_entry();
            print("Error: Invalid entry.");
            return;
        }
        
        try {
            // Create entry, add to AL (vector), sort, display.
            Score entry = new Score(i, s);
            scores.add(entry);
            Collections.sort(scores, new player_comparator());
            Collections.reverse(scores);
            print(i + " " + s + " confirmed.");
            try {
                write_scores();

            }
            catch (IOException e) {
                reset_entry();
                print("Error: Input file stream.");
            }
        }
        catch (Exception e) {
            reset_entry();
            print("Error: Invalid entry.");
        }
        
        finally {
            print_scores();
            board_controller.update(scores);  // Update scoreboard.
            reset_entry();
        }
    }
//--------------------------------------------------------------
    class player_comparator implements Comparator<Score> {
	@Override
	public int compare(Score self, Score other) {
            return self.get_score().compareTo(other.get_score());
        }
    }
//--------------------------------------------------------------
    public void print(String str) {
        score_controller.ta_console.appendText("\n" + str);
    }
//--------------------------------------------------------------
    public void write_scores() throws IOException {
        // Creates file output stream, designates it as an object
        // output stream, writes scores array list to it.
        // Delete 'scores' binary file to 'reset' scoreboard.
        try {
            FileOutputStream fos = new FileOutputStream("scores");
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(scores);
            fos.close(); // Close the FOS regardless of use.
            print("Scores file updated.");
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(Scoreboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//--------------------------------------------------------------
    public void read_scores() throws IOException, ClassNotFoundException {
        try {
            FileInputStream fis = new FileInputStream("scores");
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                scores = (ArrayList<Score>) ois.readObject();
            }
            print("Scores file found. Loading scores.");
            board_controller.update(scores);
            print_scores();
        }
        catch (FileNotFoundException ex) {
            print("Scores file not found. Scoreboard reset.");
            Logger.getLogger(Scoreboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//--------------------------------------------------------------
    public void print_scores() {
        // Print updates to 'console'.
        scores.forEach((score) -> {
            print(
                score.get_initials() + "\t\t\t" +
                score.get_score().toString());
        });
    }
//--------------------------------------------------------------
    public void reset_entry() {
        score_controller.initials_entry.clear();
        score_controller.score_entry.clear();
        score_controller.initials_entry.requestFocus();
    }
//--------------------------------------------------------------
}