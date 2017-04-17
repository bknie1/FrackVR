/**
 * @author brandon
Hosts player data. Stored in 'scores' binary file. Delete to
* reset all player data.
 */
package scoreboard;

import java.io.Serializable;

public class Score implements Serializable {

    private String initials = "TBD";
    private Integer score = 0;

    public Score(String initials, Integer score) {
        this.initials = initials;
        this.score = score;
        
        System.out.println("Player created.");
    }
    
    protected String get_initials() {
        return initials;
    }
    
    protected Integer get_score() {
        return score;
    }
    
    protected void print() {
        System.out.println(initials + "\t" + score);
    }
}