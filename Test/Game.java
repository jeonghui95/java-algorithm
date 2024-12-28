package Algorithm.Test;

import javax.swing.plaf.TreeUI;
import Algorithm.Test.Level;

public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private int totalScore = 0;
    private boolean indicator = true;

    public Game() {
        return;
    }

    public boolean isBonus(boolean bonus) {
        if (bonus == true) {
            return true;
        } else {
            return false;
        }
    }

    public void play(Level level) {
        totalScore = totalScore + getScore(level);
    }

    public int getScore(Level level) {
        if (indicator == true && level.goalReach == true) {
            return  level.getpoint;
        } else {
            indicator = false;
            return 0;
        }
    }

    public int playManyTimes(int num) {
        return 0;
    }

}