import java.util.ArrayList;

public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

        // Drop your getters and setters below for the Student class.
        public void setStudentName(String name) {
                this.name = name;
        }
        public void setStudentId(int studentId) {
                this.studentId = studentId;
        }
        private void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }
        private void setGpa(int gpa) {
                this.gpa = gpa;
        }
        public String getStudentName() {
                return name;
        }
        public int getStudentId() {
                return studentId;
        }
        public int getNumberOfCredits() {
                return numberOfCredits;
        }
        public double getGpa() {
                return gpa;
        }

public class Course {
       private String topic;
       private Teacher instructor;
       private ArrayList<Student> studentName;

}
public abstract class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private double yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, Double yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setSubject(String subject) {
        this.subject = subject;
    }

    private void setYearsTeaching(Double yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public Double yearsTeaching() {
        return yearsTeaching;
    }
}
//5. Private restricts access the most for what we need

//6. Yes. If it is a field we can restrict access to private and use getters setters

//7. Setters need to be given private but the getter can be se to public.

        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}
