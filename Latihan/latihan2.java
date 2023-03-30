public class latihan2 {
   public static void main(String[] args) {
        
        int kecepatan = 50;

        if (kecepatan > 120) {
            System.out.println("sangat cepat");
        } else if (kecepatan > 100) {
            System.out.println("cepat");
        } else if (kecepatan > 80) {
            System.out.println("sedang");
        } else if (kecepatan > 40) {
            System.out.println("lambat");
        } else {
            System.out.println("sangat lambat");
        }
    }
}
