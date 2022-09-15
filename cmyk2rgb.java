public class CmykToRgb {

    public static void main(String args[]) {
        double c = 0.40;
        double k = 0.5;
        double m = 0.3;
        double y = 0.2;
        double r = 255 * (1 - c) * (1 - k);
        double g = 255 * (1 - m) * (1 - k);
        double b = 255 * (1 - y) * (1 - k);
        System.out.println("red " + r);
        System.out.println("green  " + g);
        System.out.println("blue " + b);
    }
}