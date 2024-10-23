package classes;

import classes.GenFeald;

public class CalcArea {
    private double mainS = 0;

    private double triangleArea(double x1, double y1, double x2, double y2,double x3, double y3){
        double s = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return s;
    }

    public CalcArea() {
        GenFeald Feald = new GenFeald();
        for(int i = 0; i < Feald.getLen() - 2; i++) {
            mainS += triangleArea(Feald.getBorderDotX(0), Feald.getBorderDotY(0), Feald.getBorderDotX(i+1),Feald.getBorderDotY(i+1), Feald.getBorderDotX(i+2),Feald.getBorderDotY(i+2));
        }
    }

    public double getArea(){
        return mainS;
    }

}
