package book;

public class GenericClass {

    static class GenericClassTest<T>{
        private T xyz;

        public GenericClassTest(T t) {
            this.xyz = t;
        }

        T getXyz(){
            return xyz;
        }
    }

    public static void main(String[] args) {
        GenericClassTest<String> s = new GenericClassTest<String>("ABC");
        GenericClassTest<Integer> n = new GenericClassTest<Integer>(123);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());
    }
}
