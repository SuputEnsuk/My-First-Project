import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour, minute, next_time;

        hour = sc.nextInt();
        minute = sc.nextInt();
        next_time = sc.nextInt();

        minute += next_time;
        hour += (minute / 60);
        minute %= 60;
        hour %= 24;

        System.out.printf("%02d:%02d", hour, minute);
    }
}
