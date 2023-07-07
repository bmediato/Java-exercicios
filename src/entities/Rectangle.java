package entities;

public class Rectangle {
    public double width;
    public double heidht;

    public double Area(){
        return width * heidht;
    }

    public double Perimeter(){
        return (width * 2) + (heidht * 2);
    }

    public double Diagnoal() {
        double sum = (Math.pow(width, 2) + Math.pow(heidht, 2));
        return Math.sqrt(sum);
    }
}
