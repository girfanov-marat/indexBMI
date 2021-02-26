public class BMIService {
    double calculate(double bodyMassKg, double heightM) {
        double indexBMI = bodyMassKg / (heightM * heightM);
        return indexBMI;
    }
}
