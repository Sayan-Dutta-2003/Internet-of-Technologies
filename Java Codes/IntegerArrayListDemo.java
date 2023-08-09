import java.util.*;

public class IntegerArrayListDemo {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of elements you want to insert: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element number " + (i + 1) + ": ");
            int inp = sc.nextInt();
            numbers.add(inp);
        }
        System.out.println("Before modification, ArrayList contains: " + numbers);
        for (int i = 0; i < n; i++) {
            numbers.set(i, (numbers.get(i) + 5));
        }
        System.out.println("After modification, ArrayList contains: " + numbers);
        sc.close();
    }
}
