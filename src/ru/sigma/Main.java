package ru.sigma;

import java.util.ArrayList;

/**
 * Created by Student08 on 17.04.2015.
 */
public class Main {
    public static void main(String[] args){
        Rectangle r = new Rectangle(13,2);
        Triangle t = new Triangle();
        r.print();
        System.out.println(r.getSquare());

        ArrayList<Figure> figures = new ArrayList<Figure>();
        figures.add(r);
        figures.add(t);
        figures.get(0).print();
        figures.get(1).print();


    }

}
