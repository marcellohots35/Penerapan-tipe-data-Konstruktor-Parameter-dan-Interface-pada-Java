public class MatematikaBeraksi {
    public static void main(String args[]){
        Matematika emteka = new Matematika();

        System.out.println("=========================");
        System.out.println("   PROGRAM KALKULATOR    ");
        System.out.println("=========================");

        System.out.println("Hasil Pertambahan dari 20 + 10 =" + emteka.pertambahan(20,10));
        System.out.println("Hasil Pengurangan dari 10 - 5 =" + emteka.pengurangan(10,5));
        System.out.println("Hasil Perkalian dari 10 x 3 =" + emteka.perkalian(10,3));
        System.out.println("Hasil Pembagian dari 21 : 2 =" + emteka.pembagian(21,2));

    }
}
