package myarray;

import java.util.Scanner;

public class MyArray {

    public static void main(String[] args) {
        int n;
        System.out.println("Veri yapısının boyutunu giriniz:");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.println("------");
        LinkedList list = new LinkedList();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        list.show();
    }

}
