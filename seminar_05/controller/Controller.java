package seminar_05.controller;

import java.util.List;

import seminar_05.model.Student;
import seminar_05.model.Teacher;
import seminar_05.service.StudyGroup;
import seminar_05.service.StudyGroupService;

public class Controller {
    private StudyGroupService studyGroupService;

    public Controller(StudyGroupService studyGroupService){
        this.studyGroupService = new StudyGroupService();
    }

    public List<Integer> getStudentID() {
        return studyGroupService.getStudentID();
    }

    public int getTeacherID(){
        return studyGroupService.getTeacherID();
    }

    public List<Integer> formStudyGroup(){
        return studyGroupService.formStudyGroup();
    }
}
