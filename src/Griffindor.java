public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public Griffindor(String fullName, String faculty, int empower, int transgressionRange, int nobility, int honor, int bravery) {
        super(fullName, faculty, empower, transgressionRange);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
