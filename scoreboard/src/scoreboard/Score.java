/**
 * @author brandon
Hosts player data.
 */
package scoreboard;

public class Score {

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
        System.out.println(initials + " " + score);
    }
}