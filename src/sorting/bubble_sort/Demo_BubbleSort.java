package sorting.bubble_sort;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Demo_BubbleSort {
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
        for(int i = 0;i<n;i++){
            list[i] = r.nextInt(100);
        }

        for(int i = 0;i<list.length;i++)
            for(int j = list.length-1;j>i;j--)
                if(list[j-1]>list[j]){
                    int temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }
        System.out.println("Mang sap xep tang dan theo thuat toan noi bot: ");
        for(int i = 0; i<list.length;i++){
            System.out.print(list[i]+"\t");
            if((i+1)%35==0)
                System.out.println();
        }
        System.out.println();

        long endTime = System.currentTimeMillis();
        Calendar cl = Calendar.getInstance();
        cl.setTimeInMillis(endTime-startTime);
        System.out.println("Thoi gian thuc hien chuong trinh: "+cl.get(Calendar.MINUTE)+":"+cl.get(Calendar.SECOND));
    }
}
