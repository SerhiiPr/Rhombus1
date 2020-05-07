package com.company;

/*
* Class Rhombus

* created by Pryshchenko Serhii

* 07 May 2020

 */
public class Rhombus {
    private double length;
    private double widths;
    private double diagonal_1;


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidths() {
        return widths;
    }

    public void setWidths(double widths) {
        this.widths = widths;
    }

    public double getDiagonal_1() {
        return diagonal_1;
    }

    public void setDiagonal_1(double diagonal_1) {
        this.diagonal_1 = diagonal_1;
    }

    public Rhombus(double length, double widths, double diagonal_1) {
        this.length = length;
        this.widths = widths;
        this.diagonal_1 = diagonal_1;
    }

    public double getArea(){
        return (this.getLength()*this.getWidths());
    }

    public double getPerimeter(){
        return 4*(this.getWidths());
    }

    public double getRadius(){
        return (getArea()/(2*this.widths));
    }

    public double getSinAngle(){
        double x=((getArea())/((this.widths)*(this.widths)));
        return x;
    }

    public double getDiagonal_2(){
        return (2*getArea()/(this.diagonal_1));
    }

}
