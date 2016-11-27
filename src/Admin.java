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
}
