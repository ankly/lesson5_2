package ru.sigma;

/**
 * Created by Student08 on 17.04.2015.
 */
public class Figure {
    protected double square;
    private String color;
    private String lineWidht;

    public void print(){
        System.out.println("я фигура");
    }

    public double getSquare() {
        return square;
    }

    public String getColor() {
        return color;
    }

    public String getLineWidht() {
        return lineWidht;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLineWidht(String lineWidht) {
        this.lineWidht = lineWidht;
    }
}
