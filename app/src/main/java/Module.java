import java.util.ArrayList;

public class Module {
  public String name;
  public String id;
  public ArrayList<Student> students;
  public ArrayList<CourseProgramme> courses;
  public Lecturer lecturer;

  public Module(String name, String id, ArrayList<Student> students, ArrayList<CourseProgramme> courses, Lecturer lecturer)
  {
    this.name = name;
    this.id = id;
    this.students = students;
    this.courses = courses;
    this.lecturer = lecturer;
  }

  public String getName() 
  {
    return name;
  }

  public String getId()
  {
    return id;
  }

  public ArrayList<Student> getStudents()
  {
    return students;
  }

  public ArrayList<CourseProgramme> getCourseProgramme()
  {
    return courses;
  }

  public Lecturer getLecturer()
  {
    return lecturer;
  }

  public void addStudent(Student student)
  {
    students.add(student);
  }

  public void addCourseProgramme(CourseProgramme courseProgramme)
  {
    courses.add(courseProgramme);
  }
}
