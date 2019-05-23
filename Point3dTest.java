package Lession4;

public class Point3dTest {
    public static void main(String[] args)
    {
        Point3d point3d = new Point3d();
        point3d = new Point3d(3,4,6);
        System.out.println(point3d);
        float[] vitri  = point3d.getXYZ();
        System.out.println("("+ vitri[0]+","+vitri[1]+","+vitri[2]+")");
    }
}
