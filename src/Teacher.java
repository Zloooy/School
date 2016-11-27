/**
 * Created by student1 on 21.11.16.
 */
public class Teacher extends Man {
    Lesson[] Lessons;
    int lessonCnt;
    Teacher(){
        super();
       Lesson[] Lessons={};
        lessonCnt=0;
    }
    Teacher(String nm,String snm,int ag, Lesson[] les){
        super(nm,snm,ag);
        Lessons=new Lesson[les.length];
        int n=0;
        for(Lesson l:les){
            Lessons[n]=new Lesson(l.Lesson_name,l.Lesson_date);
            n++;
        }
        lessonCnt=Lessons.length;
    }
    public String toString(){
        String res=super.getName();
        for (Lesson le:Lessons){
            res+="\n"+le;
        }
        return res;
    }
    void AddMarkToStudent(Schooler st, int mar){
        st.addMark(new Mark(Lessons[0].Lesson_name,mar));
    }
}
