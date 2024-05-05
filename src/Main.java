import java.util.Random;

public class Main {
    public static String permission(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30)
                || (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25))
            return "Можно идти гулять";
        else return "Оставайтесь дома";
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(120);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int randomAge = generateRandomAge();
            int randomTemperature = new Random().nextInt(51) - 20;
            System.out.println("Возраст: " + randomAge + ", Температура: " + randomTemperature + " градусов - "
                    + permission(randomAge, randomTemperature));
        }
    }
}