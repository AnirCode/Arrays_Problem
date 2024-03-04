import java.util.*;

class smallest_element {

    static void Smallest(int arr[], int s) {
        int min = arr[0];
        for (int i = 1; i < s; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("smallest element is : " + min);
    }

    // Another method with inbuid function

    static void small(int arr[]) {
        Arrays.sort(arr);
        System.out.println("The smallest element is: " + arr[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the elements");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        Smallest(arr, s);
        small(arr);
    }

}