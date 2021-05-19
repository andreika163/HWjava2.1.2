public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int refill = 900;
        int bonus;
        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int endBalance = startBalance + refill + bonus;
        System.out.println("Бонус:" + bonus);
        System.out.println("Остаток на счете:" + endBalance);
    }
}