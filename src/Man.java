/**
 * Created by student1 on 21.11.16.
 */
public class Man {
    private String Name,secondName;
    private int Age;
    Man(){
        Name="Иван";
        secondName="Иванов";
        Age=0;
    }
    Man(String nm,String snm,int ag){
        Name=nm;
        secondName=snm;
        Age=ag;
    }
    int getAge(){
        return Age;
    }
    String getName(){
        return Name;
    }
    String getFullName(){
        return Name+" "+secondName;
    }
    public String toString(){
        return Name+" "+secondName+" "+Age;
    }
    String[] getStringParams(){
        return new String[]{Name,secondName};
    }
void setFullName(String n,String sn){
    Name=n;
    secondName=sn;
}
void setName(String n) {
    Name = n;
}
}
