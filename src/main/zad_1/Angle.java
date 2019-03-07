package main.zad_1;

public class Angle {


    private double x; //przechowuje miarê k¹ta w radianach

    public Angle(double x) {
        this.x = x;
    }

    public static void main(String[] args) {
        calculateFunctions();
    }


    private static void calculateFunctions() {
        Angle angle = new Angle(Math.toRadians(3));
        double sinValue = Math.sin(angle.x);
        System.out.println("Sinus wartoœci x w radianach (" + angle.x + ") = " + sinValue);
        double cosValue = Math.cos(angle.x);
        System.out.println("Kosinus wartoœci x w radianach (" + angle.x + ") = " + cosValue);
        double tanValue = Math.tan(angle.x);
        System.out.println("Tangens wartoœci x w radianach (" + angle.x + ") = " + tanValue);
        double cotValue = 1.0/Math.tan(angle.x);
        System.out.println("Kotangens wartoœci x w radianach (" + angle.x + ") = " + cotValue);
        double secValue = 1/cosValue;
        System.out.println("Secans wartoœci X w radianach (" + angle.x + ") = " + secValue);
        double cosecValue = 1/sinValue;
        System.out.println("Kosecans wartoœci X w radianach (" + angle.x + ") = " + cosecValue+ ")+ \n ...oile dobrze wygoogla³em...") ;
    }
}





