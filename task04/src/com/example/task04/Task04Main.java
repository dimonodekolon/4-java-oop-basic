package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);
        Point p3 = new Point(5,6);
        Line line = new Line(p1,p2);
        System.out.println(line);
        System.out.println(line.getP1().toString() + " " + line.getP2().toString());
        System.out.println(line.isCollinearLine(p3));
    }
}
