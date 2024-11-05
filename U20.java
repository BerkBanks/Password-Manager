public class U20 {
    public static void main(String[] args) {


        int summe;
        int produkt;

        int anzahl = 1;

        do {
            int a = (int) (Math.random() *6 + 1);
            int b = (int) (Math.random() *6 + 1);
            int c = (int) (Math.random() *6 + 1);
            int d = (int) (Math.random() *6 + 1);
            int e = (int) (Math.random() *6 + 1);
            int f = (int) (Math.random() *6 + 1);

            produkt =  (a * b * c * d * e * f);
            summe =  (a + b + c + d + e + f);

            System.out.println("Summe" + summe);
            System.out.println("Produkt" + produkt);
            System.out.println("gewürfelte Zahlen " + a + " " + b +" " + c + " " + d + " " + e + " " + f);
            System.out.println("dies ist der " + anzahl + " Versuch");
            anzahl++;
        }
        while (summe != 22 || produkt != 540);
    }
}
