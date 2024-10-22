import classes.*;

public class Main {
    public static void main(String[] args) {
        GenFeald Feald = new GenFeald();
        for(int i = 0; i < 10; i++)
            System.out.println(Feald.getBorderDotX(i) + Feald.getBorderDotY(i));
    }
}