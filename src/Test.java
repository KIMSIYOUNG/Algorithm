import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws ParseException {
        int[][] arr_double_3 = new int[3][];
        for (int i = 0; i < arr_double_3.length; i++) {
            int rand = (int) (Math.random() * 10 + 1);
            //random함수입니다.0.0부터 0.9까지 난수를 생성합니다.
             arr_double_3[i]= new int[rand];//double_3[i]를 double[rand]만큼 크기를 주겠다.라는의미입니다.
             for (int j = 0; j < arr_double_3[i].length; j++) {
                 arr_double_3[i][j] = j; System.out.print(arr_double_3[i][j] + " ");
             }
             System.out.println();
        }
        //결과 화면
        //0 1 2
        //0 1 2 3
        //0 1 2 3 4 5 6 7
    }

}



