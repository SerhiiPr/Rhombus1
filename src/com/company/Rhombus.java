package com.company;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rhombus rhombus = (Rhombus) o;
        return Double.compare(rhombus.getLength(), getLength()) == 0 &&
                Double.compare(rhombus.getWidths(), getWidths()) == 0 &&
                Double.compare(rhombus.getDiagonal_1(), getDiagonal_1()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidths(), getDiagonal_1());
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "length=" + length +
                ", widths=" + widths +
                ", diagonal_1=" + diagonal_1 +
                '}';
    }
}
