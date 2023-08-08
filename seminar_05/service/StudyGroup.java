package seminar_05.service;

import java.util.List;

import seminar_05.controller.Controller;
import seminar_05.model.Student;
import seminar_05.model.Teacher;

public class StudyGroup {
    private Controller controller;

    public StudyGroup(){
        this.controller = new Controller(null);
    }

    public void printStudentID(){
        List<Integer> studentID = controller.getStudentID();

        for (int students : studentID) {
            System.out.println("Student ID:     " + students);
        }

    }

    public void printTeacherID(){
        int teacherID = controller.getTeacherID();

        System.out.println("Teacher ID:     " + teacherID);
    }

    public void printStudyGroup(){
        List<Integer> studyGroup = controller.formStudyGroup();

        System.out.println("Study Group:    " + studyGroup.toString());
    }
}
    

