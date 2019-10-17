import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}};
        System.out.println(arr[0][0]);
        int[][] ints = Arrays.copyOfRange(arr, arr[0][0], arr[0][1]);

    }


}
