package classes;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class GenFeald {
    private List <CoordDot> points = new ArrayList<CoordDot>();

    public GenFeald(){
        Scanner scaner = new Scanner(System. in );

        System.out.println("Введите количество точек:");
        int numIteration = scaner.nextInt();
        for(int i = 0 ; i < numIteration; i++ ){
            System.out.println("Введите координаты точки " + i);
            points.add(new CoordDot(scaner.nextDouble(), scaner.nextDouble()));
        }
    }

    public double getBorderDotX(int index){
        return points.get(index).getX();
    }
    public double getBorderDotY(int index){
        return points.get(index).getY();
    }

    public int getLen(){
        return points.size();
    }
}
