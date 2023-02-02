public class Main {
    static float polto = 70; // пальто
    static byte poltoDiscount = 77; // скидка (в процентах)
    static float ram = 23; // Шляпа
    static byte ramDiscount =37;
    static float room = 53; // Деловой костюм
    static byte roomDiscount = 44;
    static float cooler = 19; // Сорочка
    static float tufla = 41; // Туфли
    static byte tuflaDiscount = 32;
    static int account = 312; // счёт пользователя

    // метод подсчёта стоимости делового гардероба
    static  private float sum() {

        float count = (polto * (100 - poltoDiscount) + ram * (100 - ramDiscount)
                + room * (100 - roomDiscount)+ tufla * (100 - tuflaDiscount)) / 100 + cooler;
        return count;
    }

    static private boolean possibility() {
        if (sum() <= account) {
            return true;
        } else { // иначе
            return false;
        }
    }

    //
    static  private float balance() {
        if(possibility()) { //
            return account - sum();
        } else { // иначе
            return sum()-account;
        }
    }
    public static void main(String[] args) {


        if (possibility()){

            System.out.println("Монет в наличии =  " +account+ " монет   Стоимость делового гардероба  " +sum()+ " монет");
        System.out.println("Имеется достаточно средств для покупки делового гардероба");
        System.out.println("Остаток от покупки " + balance() + " серебрянных монет");
        } else {
        System.out.println("Недостаточно средств для покупки делового гардероба");
        System.out.println( "Для покупки не хватает:   " + balance() );
        }
    }
}
