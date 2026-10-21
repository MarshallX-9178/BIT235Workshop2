public class Exercise1_6 {
    public static void main(String[] args) {
        double tank = 40.0;      
        double normalConsumption = 8.0; 
        double roughConsumption  = normalConsumption * 1.15; 

        double normalDistance = (tank / normalConsumption) * 100;
        double roughDistance  = (tank / roughConsumption) * 100;

        System.out.printf("Distance on normal roads : %.2f km%n", normalDistance);
        System.out.printf("Distance on rough roads  : %.2f km%n", roughDistance);
    }
}