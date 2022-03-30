public class Main {
    public static void main(String[] args) {

        System.out.println("ВАШ МОБИЛЬНЫЙ СЧЕТ.");

        int account = 500;
        int payment = 1000;
        int bonus = payment / account;


        if (payment >= 200) {
            System.out.println(bonus);
        }

        int all = account + payment + bonus;

        System.out.println("На Ваш счет зачислено: " + all);
    }
}