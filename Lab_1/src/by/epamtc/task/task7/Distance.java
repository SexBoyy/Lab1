package by.epamtc.task.task7;

import java.awt.*;

public class Distance {
    public static double calcDistanceXY(Point point) {
        return Math.sqrt(1.0 * point.x * point.x + point.y * point.y);
    }
    public static int compare(Point x, Point y){
        int result = 0;
        if (calcDistanceXY(x)<calcDistanceXY(y)) result = -1;
        else if (calcDistanceXY(x)>calcDistanceXY(y)) result = 1;
        return result;
    }
}
