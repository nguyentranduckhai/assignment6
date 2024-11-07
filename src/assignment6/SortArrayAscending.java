package assignment6;

import java.util.Scanner;

public class SortArrayAscending {

    public static void sortArray() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of the elements in Array : ");//Nhap so luong phan tu trong mang
        int n = sc.nextInt();

        int[] array = new int[n]; //Khoi tao mang voi kich thuoc n

        System.out.println("Enter the elements to the Array : ");//Nhap cac phan tu vao mang
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value element " + i + " : ");
            array[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("Array before sort : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {// so sang cac phan tu lien ke
                    int temp = array[j];// Hoan doi neu array[j] > array[j+1]
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println();

        System.out.println("Array after sort : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " , ");
        }
    }

    public static void main(String[] args) {
        SortArrayAscending.sortArray();
    }

}
