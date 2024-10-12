package TestaDate;

public class TestaDate {
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date(15, 10, 2002);

        d1.mostraData();
        d2.mostraData();

        d1.setDia(3);
        d2.setMes(5);
        d1.setMes(15);
        d2.setDia(4);
        d2.setAno(1927);
        d1.setAno(2012);

        d1.mostraData();
        d2.mostraData();

    }
}
