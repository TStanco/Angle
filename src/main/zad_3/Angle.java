package main.zad_3;

public class Angle {

    private double x;

    public Angle(double x) {
        this.x = x;
    }

    public static void main(String[] args) {
        Angle angle2 = new Angle(1.7);
        calculateFunctions();
        angle2.degree();
//        angle2.radian();
        countDecimalDegrees();
    }

    private static void calculateFunctions() {
        Angle angle1 = new Angle(Math.toRadians(3));

        System.out.println("Wartośc zmiennej angle1 o wartości " + "x" + " w radianach: " + angle1.x + "\n");
        double sinValue = Math.sin(angle1.x);
        System.out.println("Sinus wartości x w radianach  = " + sinValue);
        double cosValue = Math.cos(angle1.x);
        System.out.println("Kosinus wartości x w radianach  = " + cosValue);
        double tanValue = Math.tan(angle1.x);
        System.out.println("Tangens wartości x w radianach  = " + tanValue);
        double cotValue = 1.0 / Math.tan(angle1.x);
        System.out.println("Kotangens wartości x w radianach  = " + cotValue);
        double secValue = 1 / cosValue;
        System.out.println("Secans wartości X w radianach  = " + secValue);
        double cosecValue = 1 / sinValue;
        System.out.println("Kosecans wartości X w radianach  = " + cosecValue + "\n ...oile dobrze wygooglałem...");

    }

    public static double degree() {
        Angle angle4 = new Angle(6.283185307179586);
        double degreeResult = Math.toDegrees(angle4.x);
        System.out.println("\n Nowa wartość angle4 w stopniach: " + degreeResult);
        return degreeResult;
    }

    public static double radian() {
        Angle angle3 = new Angle(360);
        double radianResult = Math.toRadians(angle3.x);
        System.out.println("\n Nowa wartość angle3 w radianach: " +radianResult);
        return radianResult;
    }

    public static void countDecimalDegrees() {
        double decimalDegree = Angle.radian();
        double degrees = (decimalDegree - Math.floor(decimalDegree)) * 360.0;
        double minutes = (degrees - Math.floor(degrees)) * 60.0;
        double seconds = (minutes - Math.floor(minutes)) * 60.0;
        degrees = Math.floor(degrees);
        minutes = Math.floor(minutes);
        seconds = Math.floor(seconds);
        System.out.println("\n Kąt w stopniach po przetworzeniu z radianów(!): "+degrees+ "°" +minutes+"\"" +seconds+"'");
        return;
    }

    @Override
    public String toString() {
        return "\n Angle{" +
                "x=" + x +
                '}';
    }
}






