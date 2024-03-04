import java.util.*;

public class Largest_element {

    static void Largest(int arr[], int s) {
        int max = arr[0];
        for (int i = 1; i < s; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("largest element is : " + max);
    }
    // Another method

    static void biggest(int arr[]) {
        Arrays.sort(arr);
        System.out.println("Max element is : " + arr[arr.length - 1]);
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
        Largest(arr, s);
        biggest(arr);
    }
}
