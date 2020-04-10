import java.util.ArrayList;
import java.util.List;

public class Course {
    List<Student1> studentList=new ArrayList<Student1>();
    public boolean addStudent(Student1 student){
        if (student==null || studentList.contains(student)) {
            return false;
        }
        studentList.add(student);
        return true;
    }

    public void printStudents(){
        for(Student1 s : studentList)
            System.out.println(s.getFirstName() + ", with " + s.getLastName() + " year(s)");
    }
}
