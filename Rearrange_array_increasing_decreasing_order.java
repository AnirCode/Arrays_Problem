import java.util.*;

public class Rearrange_array_increasing_decreasing_order {

    static void Rearrange(int arr[], int s) {

        Arrays.sort(arr);
        System.out.println("After rearrange Array is : ");
        for (int i = 0; i < s; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the element of Array: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        Rearrange(arr, s);
    }
}
