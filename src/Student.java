/**
 * Created by student1 on 21.11.16.
 */
public class Student extends Man {
    Mark[] Marks[];
    Student(String nm,String snm,int ag, Mark[] mar){
        super(nm,snm,ag);
        Mark[] Marks=new Mark[mar.length];
        int n=0;
        for(Mark m:mar){
            Marks[n]=new Mark(m.Lesson_name,m.Value);
            n++;
        }
    }
}
