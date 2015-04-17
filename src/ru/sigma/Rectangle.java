package ru.sigma;

/**
 * Created by Student08 on 17.04.2015.
 */
public class Rectangle extends Figure{

    private double widht;
    private double height;

    public Rectangle(double widht, double height) {
        this.widht = widht;
        this.height = height;
        square = widht*height;
    }


    public void print() {
        System.out.println("прямоугольник");
    }

}
