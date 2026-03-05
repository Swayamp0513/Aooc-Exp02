// Problem 5:
// Arrange 10 names in alphabetical order.

import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names[] = new String[10];

        System.out.println("Enter 10 names:");
        for(int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
        }

        for(int i = 0; i < 9; i++) {
            for(int j = i+1; j < 10; j++) {
                if(names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("Sorted Names:");
        for(String n : names)
            System.out.println(n);
    }
}