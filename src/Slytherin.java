public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int lustForPower;

    public Slytherin(String fullName, String faculty, int empower, int transgressionRange, int cunning, int determination, int ambition, int lustForPower) {
        super(fullName, faculty, empower, transgressionRange);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}
