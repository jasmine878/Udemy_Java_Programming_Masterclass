public class Sum3And5 {
    public static void main (String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                if (count == 5) break;

                System.out.println(i + " is evenly divisible by 3 or 5");
                count++;
                sum += i;
            }
        }

        System.out.println("The sum of numbers divisible by 3 or 5 is " + sum);
    }
}
