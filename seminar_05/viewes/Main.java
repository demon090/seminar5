package seminar_05.viewes;

import java.util.List;

import seminar_05.controller.Controller;
import seminar_05.model.Student;
import seminar_05.model.Teacher;
import seminar_05.service.StudyGroup;



public class Main {
    public static void main(String[] args) {
        StudyGroup studyGroup = new StudyGroup();

        studyGroup.printStudentID();
        studyGroup.printTeacherID();
        studyGroup.printStudyGroup();
    }
}
