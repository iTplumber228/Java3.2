public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi;
        {
            double weight = 70;
            double height = 180;
            bmi = weight / (height * height) * 10000;

        }
        System.out.println("BMI: " + bmi);
    }
}