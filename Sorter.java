import java.util.Scanner;

public class Sorter {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        
        // ask how many numbers
        System.out.println("How many numeros?");
        int n = input1.nextInt();

        int[] numeros = new int[n];

        // input numeros
        for (int i =0; i < n; i++) {
            System.out.println("Enter numero " + (i + 1) + ": ");
            numeros[i] = input1.nextInt();
        }

        // ask order
        System.out.println("Sort ascending (asc) or descending (desc)?");
        String order = input1.next();

        // sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if ((order.equalsIgnoreCase("asc") && numeros[j] > numeros[j + 1]) || (order.equalsIgnoreCase("desc") && numeros[j] < numeros[j - 1])) {
                    // swap
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        // output
        System.out.println("Sorted numeros: ");
        for (int num : numeros) {
            System.out.println(num +" ");
        }
    }
}

