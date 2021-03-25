package task7;

import tools.DataScanner;

import java.awt.*;

public class Runner {
    public static void main(String[] agrs) {
        System.out.println("Введите координаты первой точки (x,y)");
        DataScanner dataScanner = new DataScanner();
        Point point1 = dataScanner.enterPointFromConsole();
        System.out.println("Введите координаты второй точки (x,y)");
        Point point2 = dataScanner.enterPointFromConsole();
        double distance1 = Distance.calcDistanceToXY(point1);
        double distance2 = Distance.calcDistanceToXY(point2);
        if (distance1 < distance2) {
            System.out.println("Расстояние от центра до первой точки меньше" +
                    "\nd1 = " + distance1 + "\nd2 = " + distance2);
        } else if (distance1 > distance2) {
            System.out.println("Расстояние от центра до второй точки меньше" +
                    "\nd1 = " + distance1 + "\nd2 = " + distance2);
        } else System.out.println("Расстояния до центра от точек равны\nd = " + distance1);
        dataScanner.close();
    }
}
