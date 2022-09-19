import java.util.ArrayList;

public class Module {
  public String name;
  public String id;
  public ArrayList<Student> students;
  public ArrayList<CourseProgramme> courseProgrammes;
  public Lecturer lecturer;

  public Module(String name, String id, Lecturer lecturer)
  {
    this.name = name;
    this.id = id;
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
    return courseProgrammes;
  }

  public Lecturer getLecturer()
  {
    return lecturer;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public void setLecturer(Lecturer lecturer)
  {
    this.lecturer = lecturer;
  }

  public void setCourses(ArrayList<CourseProgramme> courseProgrammes)
  {
    this.courseProgrammes = courseProgrammes;
  }

  public void setStudents(ArrayList<Student> students)
  {
    this.students = students;
  }

  public void addStudent(Student student)
  {
    students.add(student);
  }

  public void addCourseProgramme(CourseProgramme courseProgramme)
  {
    courseProgrammes.add(courseProgramme);
  }
}
