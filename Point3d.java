package Lession4;

public class Point3d extends Point {
    private float z = 0.0f;
    public Point3d(){
    }
    public Point3d(float z, float x,float y){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        x = getX();
        y = getY();
        this.z = z;
    }
    public float[] getXYZ(){
        float[] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = this.z;
        return arr;
    }
    public String toString() {
        return "(" + getX() + "," + getY() + "," + getZ() +")";
    }
}
