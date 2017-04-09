/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreboard;

import javafx.application.Application;
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
    
    static BoardController board_controller;
    static EnterScoreController score_controller;
    
    @Override
    public void start(Stage stage) throws Exception {
        board_scene(stage);
        score_scene();
    }
//--------------------------------------------------------------
    public void board_scene(Stage stage) throws Exception {
        //Set up instance instead of using static load() method.
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Board.fxml"));
        Parent root = loader.load();
        // Accessing getController() through the instance.
        // Don't forget the type cast.
        board_controller = (BoardController)loader.getController();

        board_controller.update();
        
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

        score_controller.get_score();

        Scene sc_score = new Scene(root);
        st_score.setScene(sc_score);
        st_score.setTitle("VRAC-MAN: Enter Score");
        st_score.initStyle(StageStyle.UNDECORATED); // Includes false resize.
        st_score.show();
        
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
                update_scores();
            default:
                 break;
            }
        }
//--------------------------------------------------------------
        private void update_scores() {
            System.out.println("Updating scores.");
        }
    }
//--------------------------------------------------------------
}