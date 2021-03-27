package by.epamtc.task.task7;

import by.epamtc.util.tool.DataScanner;

import java.awt.*;

public class Runner {
    public static void main(String[] agrs) {
        System.out.println("Введите координаты первой точки (x,y)");
        Point point1 = DataScanner.enterPointFromConsole();
        System.out.println("Введите координаты второй точки (x,y)");
        Point point2 = DataScanner.enterPointFromConsole();
        int compare = Distance.compare(point1,point2);
        if (compare<0) {
            System.out.println("Расстояние от центра до первой точки меньше" +
                    "\nd1 = " + Distance.calcDistanceXY(point1) + "\nd2 = "
                    + Distance.calcDistanceXY(point2));
        } else if (compare > 0) {
            System.out.println("Расстояние от центра до второй точки меньше" +
                    "\nd1 = " + Distance.calcDistanceXY(point1) + "\nd2 = "
                    + Distance.calcDistanceXY(point2));
        } else System.out.println("Расстояния до центра от точек равны\nd = " + Distance.calcDistanceXY(point1));
    }
}
