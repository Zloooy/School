/**
 * Created by student1 on 21.11.16.
 */
public class Main {
    public static void main(String[] args) {
        Teacher pl=new Teacher("Павел","Анухин",25,new Lesson[]{new Lesson("Физика",5)});
        Lesson les=new Lesson("Физика",22);
        Mark[] m=new Mark[]{new Mark(les,2),new Mark(les,3)};
        Schooler st=new Schooler("Полиграф","Шариков",10,m);
        st.addMark(new Mark("Алгебра",1));
        System.out.println(st.getAverageMark());
        System.out.println(pl);
        System.out.println(getAverageAge(new Man[]{st,pl}));
        Admin ad=new Admin("Авессалом","Изнурёнкин",40,new Teacher[]{pl},new Schooler[]{st});
        System.out.println(ad);
    }
    static int getAverageAge(Man[] Men){
        int sum=0;
        for(Man mn:Men){
            sum+=mn.getAge();
        }
        return sum/Men.length;
    }
}
