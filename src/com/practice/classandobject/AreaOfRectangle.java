package com.practice.classandobject;

public class AreaOfRectangle {
    Double heightOFRectangle;

    public Double getHeightOFRectangle() {
        return heightOFRectangle;
    }

    public void setHeightOFRectangle(Double heightOFRectangle) {
        this.heightOFRectangle = heightOFRectangle;
    }

    public Double getWithOfRectangle() {
        return withOfRectangle;
    }

    public void setWithOfRectangle(Double withOfRectangle) {
        this.withOfRectangle = withOfRectangle;
    }

    Double withOfRectangle;

    public AreaOfRectangle(Double heightOFRectangle, Double withOfRectangle) {
        this.heightOFRectangle = heightOFRectangle;
        this.withOfRectangle = withOfRectangle;
    }
    public double areaOfRectange(){
        return heightOFRectangle*withOfRectangle;
    }
    public double getPerimeter(){
        return 2*(heightOFRectangle+withOfRectangle);
    }

    public static void main(String[] args) {
        AreaOfRectangle areaOfRectangle=new AreaOfRectangle(4.32,7.2);
        System.out.println("Area of Rectangle is: "+ areaOfRectangle.areaOfRectange());

        System.out.println("Update height and width of rectangle");
        areaOfRectangle.setHeightOFRectangle(5.5);
        System.out.println("Updated rectangle hight is: "+areaOfRectangle.getHeightOFRectangle());
        System.out.println("Updated rectangle width is "+ areaOfRectangle.getWithOfRectangle());
        System.out.println("The perimeter of the rectangle is "+ areaOfRectangle.getPerimeter());

    }


}
