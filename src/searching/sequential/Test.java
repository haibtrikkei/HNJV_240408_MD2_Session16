package searching.sequential;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        AlgorithsmOfSequential obj = new AlgorithsmOfSequential();

        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int n;
        while(true) {
            System.out.println("Nhap so phan tu cua mang: ");
            n = scanner.nextInt();
            if(n<1 || n>50)
                System.out.println("So phan  tu gioi han tu 1 den 50");
            else
                break;
        }

        int[] list = new int[n];
        System.out.println("Mang khoi tao ban dau: ");
        for(int i = 0;i<n;i++){
            list[i] = r.nextInt(50); // Sinh so ngau nhien tu 0 den 49
            System.out.print(list[i]+"\t");
            if((i+1)%30==0)
                System.out.println();
        }

        int x;
        System.out.println("\nNhap phan tu can tim: ");
        x = scanner.nextInt();

        System.out.println("Phan tu "+x+(obj.checkExist(list, x)?" co":" khong")+" xuat hien trong danh sach");
        int position = obj.firstOccurPosition(list, x);
        if(position!=-1)
            System.out.println("Phan tu "+x+" xuat hien dau tien tai vi tri: "+position);

        int[] temp = obj.allPositionOfValueInList(list, x);
        System.out.println("\nCac vi tri xuat hien cua phan tu "+x);
        for(int pos : temp){
            System.out.print(pos+"\t");
        }
        System.out.println();

    }
}
