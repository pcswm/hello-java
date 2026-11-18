public class Temperature {
    public static void main(String[] args) {
        double c = 37.5;
        double f = ((c * 9) / 5) + 32;
        double f2 = 9 /5 * c + 32;
        System.out.println("输入：摄氏度：" + c);
        System.out.println("输出：华氏度：" + f);
        System.out.println("写法二：" + f2);
    }
}
