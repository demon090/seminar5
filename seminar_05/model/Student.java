package seminar_05.model;

public class Student extends User {
   private int studentID;

    public Student(String lastname, String firstname, String secondname, int studentID){
      super(lastname, firstname,secondname);  
      this.studentID = studentID;
      
   }

   public int getStudentID(){
    return studentID;
   }

   public void setStudentID(){
    this.studentID = studentID;
   }

   @Override
   public String toString(){
      return "student {" + "studentID = " + studentID + '}';
   }
}
