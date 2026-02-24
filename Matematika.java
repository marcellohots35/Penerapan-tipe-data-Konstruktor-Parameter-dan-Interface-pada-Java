public class Matematika implements OperasiMatematika{

    public double pertambahan(double a,double b){
        return a + b;
    }

    public double pengurangan(double a ,double b){
        return a - b;
    }

    public double perkalian(double a,double b) {
        return a * b;
    }

    public double pembagian(double a,double b){
        if (b == 0){
            System.out.println("Tidak bisa dibagi dengan 0");
        }return a/b;
    }
}
