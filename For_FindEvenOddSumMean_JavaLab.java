import java.util.Scanner;

public class For_FindEvenOddSumMean_JavaLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum integer: ");
        int max = sc.nextInt();
        int num = 0, evensum = 0, oddsum = 0, evencount = 0, oddcount = 0;

        System.out.println("\nEven Numbers between 0 and " + max + " are: ");
        for (int i = 0; i == max; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
                evensum += i;
                evencount += 1;
            }
        }

        System.out.println("\nOdd Numbers between 0 and " + max + " are: ");
        for (int j = 0; j == max; j++) {
            if (j % 2 != 0) {
                System.out.print(j + ",");
                oddsum += j;
                oddcount += 1;
            }
        }

        System.out.println("\nThere are " + evencount + " even numbers");
        System.out.println("\nThere are " + oddcount + " odd numbers");

    }
}


