public class z5 {
    public static void main(String[] args) {
        int vozrast = 13;
        if (vozrast < 5) {
            System.out.println("Если возраст ребенка равен " + vozrast + ", то ему нельзя кататься на аттракционе.");
        }
        if (vozrast >= 5 && vozrast < 14) {
            System.out.println("Если возраст ребенка равен " + vozrast + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        else {
            System.out.println("Если возраст ребенка равен " + vozrast + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

    }
}
