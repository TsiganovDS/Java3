public class z4 {
    public static void main(String[] args) {
        int vozrast = 89;
        if (vozrast >= 2 && vozrast <= 6) {
            System.out.println("Если возраст человека равен " + vozrast + ", то ему нужно ходить в детский сад.");
        }
            else if (vozrast >= 7 && vozrast <= 17) {
            System.out.println("Если возраст человека равен " + vozrast + ", то ему нужно ходить в школу.");
        }
            else if (vozrast >= 18 && vozrast <= 24) {
            System.out.println("Если возраст человека равен " + vozrast + ", то ему нужно ходить в университет.");
        }
            else {
            System.out.println("Если возраст человека равен " + vozrast + ", то ему нужно ходить на работу.");

        }


    }

}
