package sorting.selection_sort;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Demo_SelectionSort {
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

        for(int i = 0;i<list.length-1;i++){
            int k = i;
            for(int j=i+1;j<list.length;j++)
                if(list[k]>list[j])
                    k=j;
            if(k!=i){
                int temp = list[k];
                list[k] = list[i];
                list[i] = temp;
         }
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
