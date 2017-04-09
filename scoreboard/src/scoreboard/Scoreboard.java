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
    @Override
    public void start(Stage stage) throws Exception {
        board_scene(stage);
        score_scene();
    }
//--------------------------------------------------------------
    public void board_scene(Stage stage) throws Exception {
        Parent board = 
            FXMLLoader.load(getClass().getResource("Board.fxml"));
        Scene sc_board = new Scene(board);
        
        stage.setScene(sc_board);
        stage.setTitle("VRAC-MAN High Scores");
        stage.show();
        
        sc_board.setOnKeyReleased(new KeyPressed());
    }
//--------------------------------------------------------------
    public void score_scene() throws Exception {
        Stage st_score = new Stage();
        Parent enter_score = 
            FXMLLoader.load(getClass().getResource("EnterScore.fxml"));
        Scene sc_score = new Scene(enter_score);
        
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
                System.out.println("Enter pressed.");
            default:
                 break;
            }
        }
    }
//--------------------------------------------------------------
}