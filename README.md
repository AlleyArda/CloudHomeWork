# Sorting Array in Ascending Order - Java

This program sorts the elements of an array in ascending order using a basic sorting algorithm and prints the sorted array.

## Project Structure

- **Java File**: `cloudHomeWork.java`
  - This file contains the Java code to sort the array in ascending order and print the result.

## How It Works

The program uses a simple nested `for` loop to compare each element of the array with the others and swap them if necessary. This results in the elements being sorted in ascending order.

### Steps of the Algorithm

1. **Initialize the Array**: An array of integers `arr` is initialized with predefined values.
2. **Sorting Logic**:
   - Use two nested loops. 
   - The outer loop picks one element, and the inner loop compares it with the subsequent elements.
   - If the current element is greater than the compared element, they are swapped using a temporary variable (`temp`).
3. **Print the Sorted Array**: After sorting, the array is printed with all its elements in ascending order.

## Code Example

```java
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
```

## How to run

1. Install Java: Make sure Java is installed on your system. You can download it from the official Oracle website.

2. Compile the Program: Open the terminal and navigate to the directory where cloudHomeWork.java is saved.

3.  Run the following command to compile the program:
```bash
javac cloudHomeWork.java
```

4.	Run the Program: After successful compilation, run the program using this command:
```bash
java cloudHomeWork
```

5.	Output: The program will print the sorted array in ascending order as follows:
```bash
Elements of array sorted in ascending order:
1 2 3 4 5 6 7 8 9
```
