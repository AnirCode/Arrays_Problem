import java.util.*;

public class Reverse_Array {

    static int[] Reverse(int arr[], int s) {
        int start = 0;
        int end = s - 1;
        int temp;
        while (start < end)

        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the element ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        Reverse(arr, s);
        System.out.println("After reverse: ");
        for (int i = 0; i < s; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
