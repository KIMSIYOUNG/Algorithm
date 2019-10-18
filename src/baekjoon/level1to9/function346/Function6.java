package baekjoon.level1to9.function346;

public class Function6 {
    public static void main(String[] args) {
        int input = 10;
        System.out.println(Function6.facotorial(input));
    }

    private static int facotorial(int input) {
        if(input ==1)
            return 1;
        else
            return facotorial(input-1)*input;

    }
}


