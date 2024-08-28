public class z1 {
    public static void main(String[] args) {
        int age = 17;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }

        else {
            // Блок выполнится, так как возраст действительно меньше 18
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать.");
        }
    }
}

