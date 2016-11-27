/**
 * Created by Николай on 27.11.2016.
 */
public class Admin extends Man{
    Teacher[] Teachers;
    Schooler[] Schoolers;
    int teachersCnt;
    int schoolersCnt;
    Admin(String nm,String snm,int ag,Teacher[] te, Schooler[] sc){
        super(nm,snm,ag);
        teachersCnt=te.length;
        schoolersCnt=sc.length;
        Teachers=new Teacher[teachersCnt];
        Schoolers=new Schooler[schoolersCnt];
        int n=0;
        for (Teacher tc:te) {
            Teachers[n]=new Teacher(tc.getStringParams()[0],tc.getStringParams()[1],tc.getAge(),tc.Lessons);
            n++;
        }
        n=0;
        for (Schooler sch:sc) {
            Schoolers[n]=new Schooler(sch.getStringParams()[0],sch.getStringParams()[1],sch.getAge(),sch.Marks);
            n++;
        }
    }
    public String toString(){
        String res=super.toString();
        for (Teacher tc:Teachers){
            res+="\n"+tc;
        }
        for (Schooler sch:Schoolers){
            res+="\n"+sch;
        }
        return res;
    }
    void addTeacher(Teacher tchr){
        int n=0;
        Teacher[] Teachs=new Teacher[teachersCnt+1];
        for(Teacher te:Teachers){
            Teachs[n]=new Teacher(te.getStringParams()[0],te.getStringParams()[1],te.getAge(),te.Lessons);
            n++;
        }
        n=0;
        Teachs[Teachs.length-1]=new Teacher(tchr.getStringParams()[0],tchr.getStringParams()[1],tchr.getAge(),tchr.Lessons);
        Teachers=new Teacher[teachersCnt+1];
        for(Teacher te:Teachs){
            Teachers[n]=new Teacher(te.getStringParams()[0],te.getStringParams()[1],te.getAge(),te.Lessons);
            n++;
        }
       teachersCnt++;
    }
    void addSchooler(Schooler scu){
        int n=0;
        Schooler[] Schols=new Schooler[schoolersCnt+1];
        for(Schooler sc:Schoolers){
            Schols[n]=new Schooler(sc.getStringParams()[0],sc.getStringParams()[1],sc.getAge(),sc.Marks);
            n++;
        }
        n=0;
        Schols[Schols.length-1]=new Schooler(scu.getStringParams()[0],scu.getStringParams()[1],scu.getAge(),scu.Marks);
        Schoolers=new Schooler[schoolersCnt+1];
        for(Schooler sc:Schols){
            Schoolers[n]=new Schooler(sc.getStringParams()[0],sc.getStringParams()[1],sc.getAge(),sc.Marks);
            n++;
        }
        schoolersCnt++;
    }
    void addLessonToTeacher(Teacher te,Lesson les){
       int n=0;
for (Teacher tch:Teachers){
    if (tch.getFullName().equals(te.getFullName())){
        break;
    }
    n++;
}
        int en=0;
        Lesson[] Less=new Lesson[Teachers[n].lessonCnt+1];
        for(Lesson le:Teachers[n].Lessons){
            Less[en]=new Lesson(le.Lesson_name,le.Lesson_date);
            en++;
        }
        en=0;
        Less[Teachers[n].Lessons.length]=new Lesson(les.Lesson_name,les.Lesson_date);
        Teachers[n].Lessons=new Lesson[Less.length];
        for(Lesson le:Less){
            Teachers[n].Lessons[en]=new Lesson(le.Lesson_name,le.Lesson_date);
            en++;
        }
        Teachers[n].lessonCnt=Teachers[n].Lessons.length;
    }
    void addLessonToAllTeachers(Lesson les){
        int n=0;
        for (Teacher tch:Teachers) {
            int en=0;
            System.out.println("\t"+Teachers[n]);
            Lesson[] Less=new Lesson[Teachers[n].lessonCnt+1];
            for(Lesson le:Teachers[n].Lessons){
                Less[en]=new Lesson(le.Lesson_name,le.Lesson_date);
                en++;
            }
            en=0;
            Less[Teachers[n].Lessons.length]=new Lesson(les.Lesson_name,les.Lesson_date);
            Teachers[n].Lessons=new Lesson[Less.length];
            for(Lesson le:Less){
                Teachers[n].Lessons[en]=new Lesson(le.Lesson_name,le.Lesson_date);
                en++;
            }
            Teachers[n].lessonCnt=Teachers[n].Lessons.length;
        }
            n++;
        }
        }

