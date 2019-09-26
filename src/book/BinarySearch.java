package book;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("배열의 요소 수");
        int num = scanner.nextInt();
        int[] arr= new int[num];

        System.out.println("오름차순으로 입력해주세요.");
        System.out.print("x[0] :");
        arr[0]=scanner.nextInt();

        for(int i=1; i<num; i++){
            do{
                System.out.print("x["+i+"]");
                arr[i]= scanner.nextInt();
            }while (arr[i]<arr[i-1]);
        }
        System.out.println("검색할 값은?");
        int key = scanner.nextInt();

        int index = binSearch(arr,num,key);
        if(index ==-1)
            System.out.println("그런 요소가 없습니다.");
        else
            System.out.println("그 값은 x["+index+"]에 있습니다.");
    }

    private static int binSearch(int[] arr, int num, int key) {

        int pl = 0;
        int pr = num -1;

        do{
            int pc = (pl+pr)/2;
            if(arr[pc]==key)
                return pc;
            else if(arr[pc]<key)
                pl = pc +1;
            else
                pr = pc-1;
        }while(pl<=pr);

        return -1;
    }

}
