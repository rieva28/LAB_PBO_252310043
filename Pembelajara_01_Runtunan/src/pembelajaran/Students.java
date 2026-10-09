package pembelajaran;

public class Students {

    private Integer NPM;
    private String Fullname;
    private String ClassName;
    private Integer Semester;
    private Float GPA;

    public Integer getNPM(Integer value) {
        NPM = value;
        return NPM;
    }

    public String getFullname(String value) {
        Fullname = value;
        return Fullname;
    }

    public String getClassName(String value) {
        ClassName = value;
        return ClassName;
    }

    public Integer getSemester(Integer value) {
        Semester = value;
        return Semester;
    }

    public Float getGPA(Float value) {
        GPA = value;
        return GPA;
    }

    public Integer getNPM() {
        return NPM;
    }

    public String getFullname() {
        return Fullname;
    }

    public String getClassName() {
        return ClassName;
    }

    public Integer getSemester() {
        return Semester;
    }

    public Float getGPA() {
        return GPA;
    }
}