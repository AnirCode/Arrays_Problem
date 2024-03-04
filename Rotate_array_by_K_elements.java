import java.util.Scanner;

public class Rotate_array_by_K_elements {

    static void Rotate(int arr[], int s, int k) {
        int temp[] = new int[k];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < s - k; i++) {
            arr[i] = arr[i + k];
        }
        for (int i = k + 1; i < s; i++) {
            arr[i] = temp[i - 1 - k];
        }

        for (int i = 0; i < s; i++) {
            System.out.print(arr[i] + " ");
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
        System.out.println(" Enter the kth element where want to rotate: ");
        int k = sc.nextInt();
        Rotate(arr, s, k);
    }
}
