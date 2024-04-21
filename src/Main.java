public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwartsStudents = {
                new Hogwarts("Harry Potter", "Griffindor", 95, 89),
                new Hogwarts("Hermione Granger", "Griffindor", 99, 99),
                new Hogwarts("Ron Weasley", "Griffindor", 77, 78),
                new Hogwarts("Draco Malfoy", "Slytherin", 87, 80),
                new Hogwarts("Graham Montague", "Slytherin", 76, 70),
                new Hogwarts("Gregory Goyle", "Slytherin", 81, 78),
                new Hogwarts("Zachariah Smith", "Hufflepuff", 60, 58),
                new Hogwarts("Cedric Diggory", "Hufflepuff", 79, 77),
                new Hogwarts("Justin Finch-Fletchley", "Hufflepuff", 71, 67),
                new Hogwarts("Zhou Chang", "Ravenclaw", 73, 69),
                new Hogwarts("Padma Patil", "Ravenclaw", 80, 77),
                new Hogwarts("Marcus Belby", "Ravenclaw", 71, 68)
        };
        Griffindor[] griffindorStudents = {
                new Griffindor("Harry Potter", "Griffindor", 95, 89, 92, 100, 100),
                new Griffindor("Hermione Granger", "Griffindor", 99, 99, 95, 95, 92),
                new Griffindor("Ron Weasley", "Griffindor", 77, 78, 94, 97, 100)
        };
        Slytherin[] slytherinStudents = {
                new Slytherin("Draco Malfoy", "Slytherin", 87, 80, 98, 97, 95, 100),
                new Slytherin("Graham Montague", "Slytherin", 76, 70, 92, 93, 94, 95),
                new Slytherin("Gregory Goyle", "Slytherin", 81, 78, 90, 98, 92, 90)
        };
        Hufflepuff[] hufflepuffStudents = {
                new Hufflepuff("Zachariah Smith", "Hufflepuff", 60, 58, 90, 93, 94),
                new Hufflepuff("Cedric Diggory", "Hufflepuff", 79, 77, 97, 98, 98),
                new Hufflepuff("Justin Finch-Fletchley", "Hufflepuff", 71, 67, 92, 93, 96)
        };
        Ravenclaw[] ravenclawStudents = {
                new Ravenclaw("Zhou Chang", "Ravenclaw", 73, 69, 93, 100, 94, 99),
                new Ravenclaw("Padma Patil", "Ravenclaw", 80, 77, 94, 96, 91, 91),
                new Ravenclaw("Marcus Belby", "Ravenclaw", 71, 68, 89, 98, 100, 90)
        };
        PrintService printService = new PrintService();
        printService.print(griffindorStudents);
        printService.print(slytherinStudents);
        printService.print(hufflepuffStudents);
        printService.print(ravenclawStudents);
    }
}
