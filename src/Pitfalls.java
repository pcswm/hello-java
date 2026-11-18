public class Pitfalls {
    public static void main(String[] args) {
        System.out.println(5 / 2);
        System.out.println(5.0 / 2);
        System.out.println(0.1 + 0.2);
        System.out.println(2147483647 + 1);
        System.out.println(10 % 3);
        System.out.println(-10 % 3);
        int i = 1;
        System.out.println(i++ + ++i);
    }
}
