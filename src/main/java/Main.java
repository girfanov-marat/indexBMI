public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();

        double indexBMI = service.calculate(77.0, 1.7);

        System.out.println(indexBMI);
    }
}
