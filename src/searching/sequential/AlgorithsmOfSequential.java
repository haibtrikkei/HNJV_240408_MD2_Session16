package searching.sequential;

public class AlgorithsmOfSequential {
    //Kiem tra phan tu co gia tri value co ton tai trong mang list hay khong?
    public boolean checkExist(int[] list, int value) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == value) {
                return true;
            }

        }
        return false;
    }

    //Vi tri xuat hien dau tien cua phan tu co gia tri value trong mang list
    public int firstOccurPosition(int[] list, int value) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == value) {
                return i;
            }

        }
        return -1;
    }

    //Tra ve tat ca vi tri xuat hien cua phan tu co gia tri value trong mang list
    public int[] allPositionOfValueInList(int[] list, int value) {
        int total = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == value) {
                total++;
            }
        }
        int[] temp = new int[total];
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == value) {
                temp[index] = i;
                index++;
            }
        }
        return temp;
    }

}
