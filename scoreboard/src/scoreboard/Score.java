/**
 * @author brandon
Hosts player data.
 */
package scoreboard;

public class Score {

    String initials = "TBD";
    Integer score = 0;

    public Score(String initials, Integer score) {
        this.initials = initials;
        this.score = score;
    }
}