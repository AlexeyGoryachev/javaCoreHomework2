public class Hogwarts {
    private String fullName;
    private String faculty;
    private int empower;
    private int transgressionRange;

    public Hogwarts(String fullName, String faculty, int empower, int transgressionRange) {
        this.fullName = fullName;
        this.faculty = faculty;
        this.empower = empower;
        this.transgressionRange = transgressionRange;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getEmpower() {
        return empower;
    }

    public void setEmpower(int empower) {
        this.empower = empower;
    }

    public int getTransgressionRange() {
        return transgressionRange;
    }

    public void setTransgressionRange(int transgressionRange) {
        this.transgressionRange = transgressionRange;
    }
}
