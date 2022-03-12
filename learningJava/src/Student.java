public class Student {

  String firstName;
  String lastName;
  int graduateYear;
  double GPA;
  String declaredMajor;

  public Student(String firstName, String lastName, int graduateYear, double GPA, String declaredMajor) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.graduateYear = graduateYear;
    this.GPA = GPA;
    this.declaredMajor = declaredMajor;
  }

  public  int increaseGraduateYear() {
    return (this.graduateYear + 1);
  }

}
