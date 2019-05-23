package Lession4;

public class PointTest {
    public static void main(String[] args){
        Point point2d = new Point();
        point2d = new Point(3,4);
        System.out.println(point2d);
        float[] vitri  = point2d.getXY();
        System.out.println("("+ vitri[0]+","+vitri[1]+")");
    }
}
