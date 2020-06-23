package api;

import entity.Student;

public interface PersonalService {

    Student loginVerify(String stuName);

    void sign(Student stu);

    void change(Student stu);

}

