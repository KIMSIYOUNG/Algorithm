package book.basic;

public class CardConvRev {

    static int cardConvR(int x, int r, char[] d){
        int count =0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        do{
            d[count++] = dchar.charAt(x%r);
            x /= r;
        }while(x!=0);
        return count;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
