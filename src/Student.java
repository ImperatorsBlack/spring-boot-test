public class Student {

    int studentId;
    String studentName;
    int salary;
    String dept;

    public Student(int studentId, String studentName, int salary, String dept) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.salary = salary;
        this.dept = dept;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}
