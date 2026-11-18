public class BMI {
    public static void main(String[] args) {
        int a = 70;
        double b = 1.75;
        double bmi = a / (b * b);
        System.out.println("体重：" + a + "kg");
        System.out.println("身高：" + b+ "m");
        System.out.printf("BMI：%.2f%n", bmi);
        String level = bmi < 18.5 ? "偏瘦" : bmi < 24 ? "正常" : bmi < 28 ? "偏胖" : "肥胖";
        System.out.printf("BMI: %.2f，体型%s%n", bmi, level);

    }
}




