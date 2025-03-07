//write a a java code that sort the elements of array in ascending order
//and then print the sorted array
public class cloudHomeWork {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 2, 9, 4, 6, 8};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
        }
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
