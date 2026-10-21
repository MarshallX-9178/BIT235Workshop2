public class Exercise1_5 {
    public static void main(String[] args) {
        double pi = 3.14;

        double earthDiameter = 7600;
        double sunDiameter   = 865000;

        double earthRadius = earthDiameter / 2;
        double sunRadius   = sunDiameter / 2;

        double earthVolume = (4.0 / 3.0) * pi * Math.pow(earthRadius, 3);
        double sunVolume   = (4.0 / 3.0) * pi * Math.pow(sunRadius, 3);

        double ratio = sunVolume / earthVolume;

        System.out.printf("a.) Volume of the Earth : %.2f cubic miles%n", earthVolume);
        System.out.printf("b.) Volume of the Sun   : %.2f cubic miles%n", sunVolume);
        System.out.printf("c.) Ratio Sun/Earth     : %.2f%n", ratio);
    }
}