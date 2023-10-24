public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // değişken isimlendirilmesi Javada camelCase yazılır.
        String ortaMetin = " İlginizi çekebilir";
        String altMetin = "Vade süresi";

        System.out.println(ortaMetin);

        //int
        int vade = 12;

        double dolarDun = 18.25;
        double dolarBugun = 18.30;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if (dolarBugun < dolarDun) {
            String okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun > dolarDun) {
            String okYonu = "up.svg";
            System.out.println(okYonu);
        } else {
            tring okYonu = "equal.svg";
            System.out.println(okYonu);

        }
        //array

        String[] krediler = {"Hızlı kredi", "Maaşını halkbanktan", "Mutlu emekli"};

        // System.out.println(krediler[1]);
        //System.out.println(krediler[2]);

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }

    }

}
