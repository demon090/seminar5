package seminar_05.model;

public class Teacher extends User {
    private int teacherID;

    public  Teacher(String lastname, String firstname, String secondname, int teacherID){
        super(lastname, firstname, secondname);
        this.teacherID = teacherID;
    }

    public int getTeacherID(){
        return teacherID;
    }

    public void setTeacherID(int teacherID){
        this.teacherID = teacherID;
    }
}
