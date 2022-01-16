/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlerectangle;

/**
 *
 * @author DELL
 */
public class Rectangle {
    private double width;
    private double height;
    private String color;

    public Rectangle(){this.width = 1; this.height = 1;}
    public Rectangle(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double findArea(){
        return getWidth()*getHeight();
    }
    public double findPerimeter(){
        return (getWidth() + getHeight()) * 2; 
    }
    private String chuanHoa(String color){
        String c = Character.toString(color.charAt(0));
        c = c.toUpperCase();
        return c.concat(color.substring(1).toLowerCase());
    }
    public void showProfile() {
        System.out.println((int)findPerimeter() + " " + (int)findArea()+ " " + chuanHoa(color));
    }
}
