package dependencycomposotion;

public class course {

    //import encapsulation.*   encapsulation package'�nda ki b�t�n s�n�flar� course s�n�f�nda import etmi� oluyoruz.
    //import encasulation dataclass yazar isek sadece bu paketteki dataclass s�n�f�n� import etmi� oluyoruz.

    private String courseName;
    private String courseCode;

    private instructor instructor;
    private student student;



    public course(String courseName, String courseCode, student student, instructor instructor){
        this.courseName=courseName;
        this.courseCode=courseCode;
        this.student=student;
        this.instructor=instructor;
    }

    public String getCourseName(){
        return courseName;
    }

    public void setCourseName(String courseCode){
        this.courseCode=courseCode;
    }

    public String getCourseCode(){
        return this.courseCode;
    }

    public void setCourseCode(String courseCode){
        this.courseCode=courseCode;
    }

    //course s�n�f� student s�n�f�na ba�l�d�r.
    //Course uses aseralizationi�ingerekli student class some parameter or construct object. (DEPENDENCY)
    public double calcaverage(student[] students){
        double avarege=0.0;
        for (student student:students){
            avarege+=student.getNote();

        }   return avarege;
    }

    public instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(instructor instructor) {
        this.instructor = instructor;
    }

    public dependencycomposotion.student getStudent() {
        return student;
    }

    public void setStudent(dependencycomposotion.student student) {
        this.student = student;
    }
}
