package task7;

import java.awt.*;

public class Distance {
    public static double calcDistanceToXY(Point point) {
        return Math.sqrt(1.0 * point.x * point.x + point.y * point.y);
    }
}
