/**
 * Created by student1 on 21.11.16.
 */
public class Student extends Man {
    Mark[] Marks;
    int markCnt;
    Student(String nm,String snm,int ag, Mark[] mar){
        super(nm,snm,ag);
        markCnt=mar.length;
        Marks=new Mark[markCnt];
        int n=0;
        for(Mark m:mar){
            Marks[n]=new Mark(m.Lesson_name,m.Value);
            n++;
        }
    }
    void addMark(Mark m){
        int n=0;
        Mark[] Maks=new Mark[Marks.length+1];
        for(Mark ma:Marks){
            Maks[n]=new Mark(ma.Lesson_name,ma.Value);
            n++;
        }
        n=0;
        Maks[Marks.length]=new Mark(m.Lesson_name,m.Value);
        Marks=new Mark[Marks.length+1];
        for(Mark ma:Maks){
            Marks[n]=new Mark(ma.Lesson_name,ma.Value);
            n++;
        }
        markCnt=Marks.length;
    }
    public String toString(){
        String res=super.toString();
        for (Mark m:Marks){
        res+="\n"+m;
       }
        return res;
    }
    int getAverageMarkByLessonName(String lname){
        int sum=0;
        int cont=0;
        for(Mark m:Marks){
            if (m.Lesson_name==lname){
                sum+=m.Value;
                cont+=1;
            }
        }
        return sum/cont;
    }
    int getAverageMark(){
        int sum=0;
        for(Mark m:Marks){
                sum+=m.Value;
        }
        return sum/markCnt;}
}
