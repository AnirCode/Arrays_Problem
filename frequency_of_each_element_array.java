import java.util.*;

public class frequency_of_each_element_array {

    static void frequency(int[] arr, int s) {
        for (int i = 0; i < s; i++) {
            int count = 1;
            if (arr[i] == -1) {
                continue;
            }
            for (int j = i + 1; j < s; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                    count++;
                }
            }
            System.out.println("frequency of " + arr[i] + " is " + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the element: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        frequency(arr, s);
    }
}
