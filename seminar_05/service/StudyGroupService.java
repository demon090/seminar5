package seminar_05.service;

import java.util.List;

import seminar_05.model.Student;
import seminar_05.model.Teacher;

public class StudyGroupService {
    public static StudyGroup Create_Study(Teacher teacher, List<Student> students){
        StudyGroup studyGroup = new StudyGroup();
        return studyGroup;
    }

    public List<Integer> getStudentID() {
        return null;
    }

    public int getTeacherID() {
        return 0;
    }

    public List<Integer> formStudyGroup() {
        return null;
    }
}
