class aritmatika {
    static int penjumlahan(int a, int b)
    {
    return a + b;
    }
   
    static double penjumlahan(double a, double b)
    {
    return a + b;
    }
   } 

public class main11 {
    public static void main(String[] args) {
        int hasil1 = aritmatika.penjumlahan(5, 6);
        double hasil2 = aritmatika.penjumlahan(5.5, 6.0);
        System.out.println("hasil penjumlahan int = " + hasil1);
        System.out.println("hasil penjumlahan double = " + hasil2);
    }
}