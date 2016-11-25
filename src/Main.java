/**
 * Created by student1 on 21.11.16.
 */
public class Main {
    public static void main(String[] args) {
        Man ak=new Man("Акакий","Башмачкин",33);
        Lesson les=new Lesson("Физика",22);
        Mark[] m=new Mark[]{new Mark(les,2),new Mark(les,3)};
        Student st=new Student("Полиграф","Шариков",10,m);
        System.out.println(st);
        System.out.println(st.getAverageMarkByLessonName("Физика"));
        st.addMark(new Mark("Алгебра",1));
        System.out.println(st.getAverageMark());
        System.out.println(st);
    }
    static int getAverageAge(Man[] Men){
        int sum=0;
        for(Man mn:Men){
            sum+=mn.getAge();
        }
        return sum/Men.length;
    }
}
