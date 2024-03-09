public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // 공백 출력
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}