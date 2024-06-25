package sorting.insertion_sort;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Demo_InsertionSort {
    public static void main(String[] args) {
        int[] list;
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap so phan tu cua mang: ");
        n = sc.nextInt();
        list = new int[n];

        //Dem thoi gian:
        long startTime = System.currentTimeMillis();

        Random r = new Random();
        for (int i = 0; i < n; i++) {
            list[i] = r.nextInt(100);
        }

        for (int i = 1; i < list.length; i++) {
            //can dua phan tu o vi tri i vao dung vi tri
            int k;
            int current = list[i];
            for(k = i-1;k>=0 && list[k]>current;k--)
                list[k+1] = list[k];
            list[k+1] = current;
        }
        System.out.println("Mang sap xep tang dan theo thuat toan chen: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
            if ((i + 1) % 35 == 0)
                System.out.println();
        }
        System.out.println();

        long endTime = System.currentTimeMillis();
        Calendar cl = Calendar.getInstance();
        cl.setTimeInMillis(endTime - startTime);
        System.out.println("Thoi gian thuc hien chuong trinh: " + cl.get(Calendar.MINUTE) + ":" + cl.get(Calendar.SECOND));
    }
}
