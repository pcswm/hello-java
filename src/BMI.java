public class BMI {
    public static void main(String[] args) {
        int a = 70;
        double b = 1.75;
        double bmi = a / (b * b);
        System.out.println("体重：" + a + "kg");
        System.out.println("身高：" + b+ "m");
        System.out.printf("BMI：%.2f%n", bmi);
    }
}




