package assignment6;

import java.util.Scanner;

public class LargestAndSmallestElementsArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of the elements in Array : ");//Nhap so luong phan tu trong mang
        int n = sc.nextInt();

        int[] array = new int[n]; //Khoi tao mang voi kich thuoc n

        System.out.println("Enter the elements to the Array : ");//Nhap cac phan tu vao mang
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int largest = array[0];
        int smallest = array[0];
        // Khoi tao 2 bien lon nhat va nho nhat

        for (int i = 1; i < n; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        System.out.println("The largest elements in Array is : " + largest);
        System.out.println("The largest elements in Array is : " + smallest);

    }

}
