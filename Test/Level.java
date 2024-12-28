package Algorithm.Test;

public class Level {
    public boolean goalReach;
    public int getpoint;

    public boolean goalReached(boolean reach) {
        this.goalReach = reach;
        return reach;
    }

    public int getPoints(int point) {
        this.getpoint = point;
        return point;
    }
}