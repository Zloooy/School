/**
 * Created by student1 on 21.11.16.
 */
public class Lesson {
    String Lesson_name;
    int Lesson_date;
    Lesson(String name,int date){
        Lesson_name=name;
        Lesson_date=date;
    }
    public String toString(){
        return Lesson_date+"\t"+Lesson_name;
    }
}
