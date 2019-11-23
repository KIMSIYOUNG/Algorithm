package aboutjava.javautilStudy;

public class GenericTest12 {

    public static void main(String[] args) {
        /*
         * Generic을 사용하지 않은 경우.
         * 각각의 값을 가져와 형 변환하여 사용한다.
         */
//        GenericTest gt = new GenericTest();
//        gt.setObj(new Object());
//        gt.getObj();
//        GenericTest gt1 = new GenericTest();
//        gt1.setObj("String class");
//        String obj = (String) gt1.getObj();
//        GenericTest gt2 = new GenericTest();
//        gt2.setObj(1);
//        int v = (int)gt2.getObj();

        /*
         Generic을 사용하는 경우 사용하고자 하는 형태로 받아와 사용할 수 있다.
         */
        GenericTest<Object> gt = new GenericTest();
        gt.setObj(new Object());
        gt.getObj();
        GenericTest<String> gt1 = new GenericTest();
        gt1.setObj("String class");
        String obj = gt1.getObj();
        GenericTest<Integer> gt2 = new GenericTest();
        gt2.setObj(1);
        int v = gt2.getObj();

        System.out.println(obj);
        System.out.println(v);






    }
}
