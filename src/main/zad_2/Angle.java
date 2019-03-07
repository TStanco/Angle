package main.zad_2;

public class Angle {


    private double x; //przechowuje miar� k�ta w radianach

    public Angle(double x) {
        this.x = x;
    }

    public static void main(String[] args) {
        Angle angle2 = new Angle(1.7);
        calculateFunctions();
        angle2.radian();
        angle2.degree();
    }

    private static void calculateFunctions() {
        Angle angle1 = new Angle(Math.toRadians(3));

        System.out.println("Warto�c zmiennej angle1 o warto�ci "+"x"+" w radianach: " + angle1.x + "\n");
        double sinValue = Math.sin(angle1.x);
        System.out.println("Sinus warto�ci x w radianach  = " + sinValue);
        double cosValue = Math.cos(angle1.x);
        System.out.println("Kosinus warto�ci x w radianach  = " + cosValue);
        double tanValue = Math.tan(angle1.x);
        System.out.println("Tangens warto�ci x w radianach  = " + tanValue);
        double cotValue = 1.0 / Math.tan(angle1.x);
        System.out.println("Kotangens warto�ci x w radianach  = " + cotValue);
        double secValue = 1 / cosValue;
        System.out.println("Secans warto�ci X w radianach  = " + secValue);
        double cosecValue = 1 / sinValue;
        System.out.println("Kosecans warto�ci X w radianach  = " + cosecValue + "\n ...oile dobrze wygoogla�em...");
    }

    public static double radian() {
        Angle angle3 = new Angle(360);
        double radianResult = Math.toRadians(angle3.x);
        System.out.println("\n Nowa warto�� angle3 w radianach: " + radianResult);
        return radianResult;
    }

    public static double degree() {
        Angle angle4 = new Angle(6.283185307179586);
        double degreeResult = Math.toDegrees(angle4.x);
        System.out.println("\n Nowa warto�� angle4 w stopniach: "+degreeResult );
        return degreeResult;
    }
}






