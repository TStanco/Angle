package main.zad_2;

public class Angle {


    private double x; //przechowuje miarê k¹ta w radianach

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

        System.out.println("Wartoœc zmiennej angle1 o wartoœci "+"x"+" w radianach: " + angle1.x + "\n");
        double sinValue = Math.sin(angle1.x);
        System.out.println("Sinus wartoœci x w radianach  = " + sinValue);
        double cosValue = Math.cos(angle1.x);
        System.out.println("Kosinus wartoœci x w radianach  = " + cosValue);
        double tanValue = Math.tan(angle1.x);
        System.out.println("Tangens wartoœci x w radianach  = " + tanValue);
        double cotValue = 1.0 / Math.tan(angle1.x);
        System.out.println("Kotangens wartoœci x w radianach  = " + cotValue);
        double secValue = 1 / cosValue;
        System.out.println("Secans wartoœci X w radianach  = " + secValue);
        double cosecValue = 1 / sinValue;
        System.out.println("Kosecans wartoœci X w radianach  = " + cosecValue + "\n ...oile dobrze wygoogla³em...");
    }

    public static double radian() {
        Angle angle3 = new Angle(360);
        double radianResult = Math.toRadians(angle3.x);
        System.out.println("\n Nowa wartoœæ angle3 w radianach: " + radianResult);
        return radianResult;
    }

    public static double degree() {
        Angle angle4 = new Angle(6.283185307179586);
        double degreeResult = Math.toDegrees(angle4.x);
        System.out.println("\n Nowa wartoœæ angle4 w stopniach: "+degreeResult );
        return degreeResult;
    }
}






