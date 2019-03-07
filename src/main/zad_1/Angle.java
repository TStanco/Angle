package main.zad_1;

public class Angle {


    private double x; //przechowuje miar� k�ta w radianach

    public Angle(double x) {
        this.x = x;
    }

    public static void main(String[] args) {
        calculateFunctions();
    }


    private static void calculateFunctions() {
        Angle angle = new Angle(Math.toRadians(3));
        double sinValue = Math.sin(angle.x);
        System.out.println("Sinus warto�ci x w radianach (" + angle.x + ") = " + sinValue);
        double cosValue = Math.cos(angle.x);
        System.out.println("Kosinus warto�ci x w radianach (" + angle.x + ") = " + cosValue);
        double tanValue = Math.tan(angle.x);
        System.out.println("Tangens warto�ci x w radianach (" + angle.x + ") = " + tanValue);
        double cotValue = 1.0/Math.tan(angle.x);
        System.out.println("Kotangens warto�ci x w radianach (" + angle.x + ") = " + cotValue);
        double secValue = 1/cosValue;
        System.out.println("Secans warto�ci X w radianach (" + angle.x + ") = " + secValue);
        double cosecValue = 1/sinValue;
        System.out.println("Kosecans warto�ci X w radianach (" + angle.x + ") = " + cosecValue+ ")+ \n ...oile dobrze wygoogla�em...") ;
    }
}





