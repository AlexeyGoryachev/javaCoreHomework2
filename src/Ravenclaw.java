public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String fullName, String faculty, int empower, int transgressionRange, int intelligence, int wisdom, int wit, int creation) {
        super(fullName, faculty, empower, transgressionRange);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
}
