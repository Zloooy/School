/**
 * Created by student1 on 21.11.16.
 */
public class Teacher extends Man {
    String[] Lessons;
    Teacher(){
       Lesson[] Lessons={};
    }
    Teacher(String nm,String snm,int ag, Lesson[] les){
        super(nm,snm,ag);
        Lesson[] Lessons=new Lesson[les.length];
        int n=0;
        for(Lesson l:les){
            Lessons[n]=new Lesson(l.Lesson_name,l.Lesson_date);
            n++;
        }
    }
}
