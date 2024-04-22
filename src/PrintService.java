public class PrintService {
    public void print(Griffindor[] griffindorStudents) {
        for (int i = 0; i < griffindorStudents.length; i++) {
            Griffindor griffindor = griffindorStudents[i];
            System.out.println("Name - " + griffindor.getFullName() +
                    ", faculty - " + griffindor.getFaculty() +
                    ", empower - " + griffindor.getEmpower() +
                    ", transgression range - " + griffindor.getTransgressionRange());
            System.out.println("nobility = " + griffindor.getNobility() +
                    ", honor = " + griffindor.getHonor() +
                    ", bravery = " + griffindor.getBravery());
        }
        System.out.println("______________________________________________");
    }
    public void print(Slytherin[] slytherinStudents) {
        for (int i = 0; i < slytherinStudents.length; i++) {
            Slytherin slytherin = slytherinStudents[i];
            System.out.println("Name - " + slytherin.getFullName() +
                    ", faculty - " + slytherin.getFaculty() +
                    ", empower - " + slytherin.getEmpower() +
                    ", transgression range - " + slytherin.getTransgressionRange());
            System.out.println("cunning = " + slytherin.getCunning() +
                    ", determination = " + slytherin.getDetermination() +
                    ", ambition = " + slytherin.getAmbition() +
                    ", the lust For Power = " + slytherin.getLustForPower());
        }
        System.out.println("______________________________________________");
    }
    public void print(Hufflepuff[] hufflepuffStudents) {
        for (int i = 0; i < hufflepuffStudents.length; i++) {
            Hufflepuff hufflepuff = hufflepuffStudents[i];
            System.out.println("Name - " + hufflepuff.getFullName() +
                    ", faculty - " + hufflepuff.getFaculty() +
                    ", empower - " + hufflepuff.getEmpower() +
                    ", transgression range - " + hufflepuff.getTransgressionRange());
            System.out.println("hard work = " + hufflepuff.getHardWork() +
                    ", loyalty = " + hufflepuff.getLoyalty() +
                    ", honesty = " + hufflepuff.getHonesty());
        }
        System.out.println("______________________________________________");
    }
    public void print(Ravenclaw[] ravenclawStudents) {
        for (int i = 0; i < ravenclawStudents.length; i++) {
            Ravenclaw ravenclaw = ravenclawStudents[i];
            System.out.println("Name - " + ravenclaw.getFullName() +
                    ", faculty - " + ravenclaw.getFaculty() +
                    ", empower - " + ravenclaw.getEmpower() +
                    ", transgression range - " + ravenclaw.getTransgressionRange());
            System.out.println("intelligence = " + ravenclaw.getIntelligence() +
                    ", wisdom = " + ravenclaw.getWisdom() +
                    ", wit = " + ravenclaw.getWit() +
                    ", creation = " + ravenclaw.getCreation());
        }
        System.out.println("______________________________________________");
    }
}
