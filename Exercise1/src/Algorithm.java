import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Algorithm {

    public static int findSmallestNonOccurringInteger(int[] array) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : array) {
            if (num > 0) {
                numbers.add(num);
            }
        }

        int smallestNonOccurring = 1;
        while (numbers.contains(smallestNonOccurring)) {
            smallestNonOccurring++;
        }

        return smallestNonOccurring;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        int result = findSmallestNonOccurringInteger(array);
        System.out.println("The smallest non-occurring integer is: " + result);
    }
//    public static void main(String[] args) {
//        int[] array = {3, 4, -1, 0,1,9,6,8,2,7,5,10};
//        System.out.println("The smallest non-occurring integer is: " + findSmallestNonOccurringInteger(array));
//
// }
//    public static int findSmallestNonOccurringInteger(int[] array) {
//        Set<Integer> numbers = new HashSet<>();
//        for (int num : array) {
//            numbers.add(num);
//        }
//
//        int smallestNonOccurring = 1;
//        while (numbers.contains(smallestNonOccurring)) {
//            smallestNonOccurring++;
//        }
//
//        return smallestNonOccurring;
//    }
}
