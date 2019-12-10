package study;

public class hello {
    public static void main(String[] args) {
        String str = "[1575090000000,230000],[1572494400000,450000],[1569816000000,725015],[1567224000000,1385519]";

        String replace = str.replace("[", "");
        String replace1 = replace.replace("]", "");
        String[] split = replace1.split(",");
        for(int i=split.length-1; i>=0; i=i-2){
            System.out.println(split[i]);
        }

    }
}
