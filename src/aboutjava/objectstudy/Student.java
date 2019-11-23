package aboutjava.objectstudy;

import java.util.Objects;

public class Student {
    private static Character NEXT_LINE = '\n';

    String name;
    String number;
    int birthYear;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return birthYear == student.birthYear &&
                name.equals(student.name) &&
                number.equals(student.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, birthYear);
    }

    @Override
    public String toString() {
        return "Student{" +NEXT_LINE +
                "name=" + name + NEXT_LINE +
                "number=" + number + NEXT_LINE +
                "birthYear=" + birthYear + NEXT_LINE +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "김시영";
        student.number = "1994";
        student.birthYear = 94;
        Student student1 = new Student();
        student1.name = "김시영";
        student1.number = "1994";
        student1.birthYear = 94;


        if(student.equals(student1))
            System.out.println("둘은 같다.");
        if(!student.equals(student1))
            System.out.println("둘은 다르다.");
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());

        System.out.println(student);
        System.out.println(student.toString());
    }

}
