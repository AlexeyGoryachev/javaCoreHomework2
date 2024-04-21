public class Hogwarts {
    private final String fullName;
    private final String faculty;
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

    public String getFaculty() {
        return faculty;
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
