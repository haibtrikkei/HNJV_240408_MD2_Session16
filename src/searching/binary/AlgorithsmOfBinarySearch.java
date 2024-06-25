package searching.binary;

public class AlgorithsmOfBinarySearch {
    public boolean checkExist(int[] list, int value){
        int low = 0;
        int hight = list.length-1;

        while(hight>=low){
            int mid = (low+hight)/2;
            if(list[mid]==value){
                return true;
            }else if(list[mid]>value){
                hight = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }

    //Vi tri xuat hien dau tien cua phan tu co gia tri value trong mang list
    public int firstOccurPosition(int[] list, int value) {
        int low = 0;
        int hight = list.length-1;
        while(hight>=low){
            int mid = (hight+low)/2;
            if(list[mid]==value)
                return mid;
            else if(list[mid]>value){
                hight = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }

    //Tra ve tat ca vi tri xuat hien cua phan tu co gia tri value trong mang list
    public int[] allPositionOfValueInList(int[] list, int value) {
        int total = 0;

        int low = 0;
        int hight = list.length-1;
        int position = -1;
        while(hight>=low){
            int mid = (hight+low)/2;
            if(list[mid]==value){
                position = mid;
                total = 1;
                for(int i=mid-1;i>=0 && list[i]==list[mid]; i--)
                    total++;
                for(int i=mid+1;i<list.length-1 && list[i]==list[mid]; i++)
                    total++;
                break;
            }else if(list[mid]>value){
                hight = mid-1;
            }else{
                low = mid+1;
            }
        }

        int[] temp = new int[total];
        int index = 0;
        temp[index] = position;
        for(int i=position-1;i>=0 && list[i]==list[position]; i--){
            index++;
            temp[index] = i;
        }

        for(int i=position+1;i<list.length-1 && list[i]==list[position]; i++){
            index++;
            temp[index] = i;
        }

        return temp;
    }
}
