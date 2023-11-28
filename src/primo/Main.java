
public class Main {
    public static void main(String[] args) {
       String pari=PariDispari();
       System.out.println(pari);
    }

    public static  String PariDispari(){
        String numero="ciao";
        if (numero.length() % 2 == 0) {
            System.out.println("pari");

        }else {
            System.out.println("dispari");
        }

    }
}