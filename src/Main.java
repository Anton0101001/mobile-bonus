public class Main {
    public static void main(String[] args) {

        System.out.println("Ваш мобильный счёт");

        int account = 1_000;
        int payment = 5_500;
        int bonus;


        if (payment >= 1_100) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        int all = account + payment + bonus;


        System.out.println("На Ваш счет зачислено: " + all);
    }
}