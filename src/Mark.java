/**
 * Created by student1 on 21.11.16.
 */
public class Mark {
    String Lesson_name;
    int Value;
    Mark(Lesson less,int val){
        Value=val;
        Lesson_name=less.Lesson_name;
    }
    Mark(String lestr,int val){
        Value=val;
        Lesson_name=lestr;
    }
    public String toString(){
        return Lesson_name+"\t"+Value;
    }
}
