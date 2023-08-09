import java.util.*;

class DynamicArray {
    int size, n;
    int arr[];
    Scanner sc = new Scanner(System.in);

    public DynamicArray(int s) {
        size = s;
        arr = new int[size];
        n = 0;
    }

    void input() {
        do {
            System.out.print("\nEnter the total number of elements you want to insert into the array: ");
            n = sc.nextInt();
            if (n > size || n < 1) {
                System.out.println("The entered size is greater than the capacity, or the number of elements should be greater than zero.");
            }
        } while (n > size || n < 1);
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void insertion() {
        if (n == size) {
            System.out.println("Array is Full, Insertion operation is not Possible!");
            return;
        }

        System.out.print("Enter index number: ");

        int ind = sc.nextInt();
        while (ind < 0 || ind > n) {
            System.out.println("Please enter the appropriate index number.");
            ind = sc.nextInt();
        }
        if (ind >= n) {
            System.out.println("Sorry, Cannot insert element in this index");
            return;
        }

        for (int i = n; i > ind; i--) {
            arr[i] = arr[i - 1];
        }
        System.out.printf("Enter element you want insert at index %d: ", ind);
        arr[ind] = sc.nextInt();
        n++;

        System.out.println(arr[ind] + " succesfully entered into index " + ind);
    }

    void deletion() {
        if (n == 0) {
            System.out.println("Array is Empty, Deletion operation is not possible!");
            return;
        }
        System.out.print("Enter index number: ");
        int ind = sc.nextInt();
        if (ind < 0 || ind >= n) {
            System.out.println("Please enter the appropriate index number.");
            return;
        }

        for (int i = ind; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("Deletion at index " + ind + " is done successfully");
        n--;
    }

    void display() {
        if (n == 0) {
            System.out.println("Array is empty; there are no elements to display.");
            return;
        }
        System.out.print("Presently, the following are the array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class ArrayInsertionDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Array size must be greater than zero.");
            sc.close();
            return;
        }
        DynamicArray a = new DynamicArray(size);
        a.input();
        while (true) {
            System.out.println("\nEnter 1 to Insert an element in the array");
            System.out.println("Enter 2 to Delete an element in the array");
            System.out.println("Enter 3 to Display the elements present in the array");
            System.out.println("Enter 4 to Exit from the program");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    a.insertion();
                    break;
                case 2:
                    a.deletion();
                    break;
                case 3:
                    a.display();
                    break;
                case 4:
                    System.out.println("Program terminated Successfully!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Please enter the appropriate choice.");
                    break;
            }
        }
    }
}
