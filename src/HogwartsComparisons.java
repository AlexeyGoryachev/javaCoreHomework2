public class HogwartsComparisons {
    public static void compareGryffindorStudents(Griffindor student1, Griffindor student2) {
        int totalScore1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int totalScore2 = student2.getNobility() + student2.getHonor() + student2.getBravery();

        if (totalScore1 > totalScore2) {
            System.out.println(student1.getFullName() + " лучший ученик из Гриффиндора.");
        } else if (totalScore1 < totalScore2) {
            System.out.println(student2.getFullName() + " лучший ученик из Гриффиндора.");
        } else {
            System.out.println(student1.getFullName() + " и " + student2.getFullName() + " оба ученика из Гриффиндора равны по своим характеристикам.");
        }
    }
    public static void compareSlytherinStudents(Slytherin student1, Slytherin student2) {
        int totalScore1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getLustForPower();
        int totalScore2 = student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getLustForPower();

        if (totalScore1 > totalScore2) {
            System.out.println(student1.getFullName() + " лучший ученик из Слизерина.");
        } else if (totalScore1 < totalScore2) {
            System.out.println(student2.getFullName() + " лучший ученик из Слизерина.");
        } else {
            System.out.println(student1.getFullName() + " и " + student2.getFullName() + " оба ученика из Слизерина равны по своим характеристикам.");
        }
    }
    public static void compareHufflepuffStudents(Hufflepuff student1, Hufflepuff student2) {
        int totalScore1 = student1.getHardWork() + student1.getLoyalty() + student1.getHonesty();
        int totalScore2 = student2.getHardWork() + student2.getLoyalty() + student2.getHonesty();

        if (totalScore1 > totalScore2) {
            System.out.println(student1.getFullName() + " лучший ученик из Пуффендуя.");
        } else if (totalScore1 < totalScore2) {
            System.out.println(student2.getFullName() + " лучший ученик из Пуффендуя.");
        } else {
            System.out.println(student1.getFullName() + " и " + student2.getFullName() + " oба ученика из Пуффендуя равны по своим характеристикам.");
        }
    }
    public static void compareRavenclawStudents(Ravenclaw student1, Ravenclaw student2) {
        int totalScore1 = student1.getIntelligence() + student1.getWisdom() + student1.getWit() + student1.getCreation();
        int totalScore2 = student2.getIntelligence() + student2.getWisdom() + student2.getWit() + student2.getCreation();

        if (totalScore1 > totalScore2) {
            System.out.println(student1.getFullName() + " лучший ученик из Когтеврана.");
        } else if (totalScore1 < totalScore2) {
            System.out.println(student2.getFullName() + " лучший ученик из Когтеврана.");
        } else {
            System.out.println(student1.getFullName() + " и " + student2.getFullName() + " oба ученика из Когтеврана равны по своим характеристикам.");
        }
    }
    public static void compareMagicAndTransgression(Hogwarts student1, Hogwarts student2) {
        int totalMagic1 = student1.getEmpower();
        int totalMagic2 = student2.getEmpower();
        int totalTransgression1 = student1.getTransgressionRange();
        int totalTransgression2 = student2.getTransgressionRange();

        if (totalMagic1 + totalTransgression1 > totalMagic2 + totalTransgression2) {
            System.out.println(student1.getFullName() + " самый могущественный ученик Хогвартса.");
        } else if (totalMagic1 + totalTransgression1 < totalMagic2 + totalTransgression2) {
            System.out.println(student2.getFullName() + " самый могущественный ученик Хогвартса.");
        } else {
            System.out.println("об их могуществе, говорит весь Хогвартс!");
        }
    }
}
