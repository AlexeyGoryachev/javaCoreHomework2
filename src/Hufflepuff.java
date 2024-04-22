public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String fullName, String faculty, int empower, int transgressionRange, int hardWork, int loyalty, int honesty) {
        super(fullName, faculty, empower, transgressionRange);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
