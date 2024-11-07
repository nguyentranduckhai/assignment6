package assignment6;

import java.util.Scanner;

public class CountTheOccurences {

    public static void countOccurences() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of the elements in Array : ");//Nhap so luong phan tu trong mang
        int n = sc.nextInt();

        int[] array = new int[n]; //Khoi tao mang voi kich thuoc n

        System.out.println("Enter the elements to the Array : ");//Nhap cac phan tu vao mang
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value element " + i + " : ");
            array[i] = sc.nextInt();
        }
        System.out.print("Enter a int number to count : ");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {//Dem so lan xuat hien cua x
            if (array[i] == x) {
                count++;
            }
        }
        System.out.println("The numbers of time " + x + " appears in Array is : " + count);

    }

    public static void main(String[] args) {
        CountTheOccurences.countOccurences();
    }
}
