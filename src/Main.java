public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 1");
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 2");
        int maxExpenditure = 99000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxExpenditure) {
                maxExpenditure = arr[i];
            }
        }
        int minExpenditure = 201000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minExpenditure) {
                minExpenditure = arr[i];

            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpenditure + " рублей. Максимальная сумма трат за день составила " + maxExpenditure + " рублей");
    }
    public static void task3() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 3");
        float sum = 0;
        float averageAmountSpent = 0;
        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
        }
        averageAmountSpent = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmountSpent + " рублей");
    }
    public static void task4() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i] );
        }
    }
}
