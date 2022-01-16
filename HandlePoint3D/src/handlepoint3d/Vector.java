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
public class Vector {
    private int x, y, z;

    public Vector() {
    }

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public static Vector tichCoHuong(Vector v1, Vector v2){
        int x, y, z;
        x = v1.y * v2.z - v2.y * v1.z;
        y = v1.z * v2.x - v2.z * v1.x;
        z = v1.x * v2.y - v2.x * v1.y;
        return new Vector(x, y, z);
    }
    
    public static int tichVoHuong(Vector v1, Vector v2) {
        int ans;
        ans = v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
        return ans;
    }

    @Override
    public String toString() {
        return "Vector{" + "x = " + x + ", y = " + y + ", z = " + z + '}';
    }

    
    
    
}
