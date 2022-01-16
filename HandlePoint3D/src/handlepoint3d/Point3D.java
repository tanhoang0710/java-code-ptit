/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlepoint3d;

/**
 *
 * @author DELL
 */
public class Point3D {
    private int x, y, z;

    public Point3D() {
    }

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4){
        Vector v1 = new Vector(p2.x - p1.x, p2.y - p1.y, p2.z - p1.z);
        Vector v2 = new Vector(p3.x - p1.x, p3.y - p1.y, p3.z - p1.z);
        Vector v3 = new Vector(p4.x - p1.x, p4.y - p1.y, p4.z - p1.z);
        
        Vector tichCoHuong = Vector.tichCoHuong(v1, v2);
        if(Vector.tichVoHuong(tichCoHuong, v3) == 0)
            return true;
        else return false;
    }
}
