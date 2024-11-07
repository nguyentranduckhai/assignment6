package assignment6;

import java.util.Scanner;

public class SumAndAverageOfArrayElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of the elements in Array : ");//Nhap so luong phan tu trong mang
        int n = sc.nextInt();

        int[] array = new int[n]; //Khoi tao mang voi kich thuoc n

        System.out.println("Enter the elements to the Array : ");//Nhap cac phan tu vao mang
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + i;
        }
        float average = (float) sum / n;
        System.out.println("Sum of the elements in Array is : " + sum);
        System.out.println("Average of the elements in Array is : " + average);
    }

}
