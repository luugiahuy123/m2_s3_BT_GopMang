package ss3;

import java.util.Scanner;

public class BT_GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai mang 1");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];
        System.out.println("nhap do dai cua mang 2");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            System.out.println("nhap phan tu" + (i + 1) + " cua mang 1:");
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            System.out.println("nhap phan tu" + (i + 1) + " cua mang 2");
            array2[i] = scanner.nextInt();
        }
        int[] array3 = new int[n1 + n2];
        System.arraycopy(array1, 0, array3, 0, n1);
        System.arraycopy(array2, 0, array3, 0 + n1, n2);
        System.out.println(" mang da gop la ");
        for (int i = 0; i < n1 + n2; i++) {
            System.out.println(array3[i]);
        }


    }

}




