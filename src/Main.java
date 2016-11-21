/**
 * Created by student1 on 21.11.16.
 */
public class Main {
    public static void main(String[] args) {
        Man ak=new Man("Акакий","Башмачкин",33);
        Lesson les=new Lesson("Физика",22);
        Mark m=new Mark(les,2);
        System.out.println(m);
    }
}
