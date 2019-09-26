package book;

public class Id {
    private static int counter =0;
    private int id;

    public Id() {
        id = ++counter;
    }
    public int getId(){
        return id;
    }
    public static int getCounter(){
        return counter;
    }

    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();

        System.out.println(a.getId());
        System.out.println(b.getId());

        System.out.println(Id.getCounter());
    }
}
