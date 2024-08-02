public class Main {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += (1.0 / numbers[i]); // 1 yerine 1.0 kullanılıyor
        }

        System.out.println(sum / numbers.length);
    }
}
