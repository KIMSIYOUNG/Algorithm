package book;

import java.util.Arrays;
import java.util.Scanner;

public class PhysExam {

    static class PhyscData{
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return "PhysExam{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }
        public static final Comparable<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparable<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2){
                return (d1.height>d2.height)? 1:
                        (d1.height<d2.height)?-1:0;
            }

            @Override
            public int compareTo(PhyscData o) {
                return 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhyscData[] arr = {
                new PhyscData("이나령",162,0.3),
                new PhyscData("유지훈",168,0.4),
                new PhyscData("김한결",169,0.8),
                new PhyscData("김시영",172, 1.0)
        };

        System.out.println("키가 몇 cm인 사람을 찾고 있나요?");
        int height = sc.nextInt();
//
//        int index = Arrays.binarySearch(
//                arr,
//                new PhyscData("",height,0.0),
//                PhyscData.HEIGHT_ORDER.compareTo()
//        );
//
//
//        if(index <0)
//            System.out.println("요소가 없습니다");
//        else {
//            System.out.println("index = "+index);
//            System.out.println("찾은 사람 : " + arr[index]);
//        }
    }
}
