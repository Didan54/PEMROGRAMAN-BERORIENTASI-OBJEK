class A{
    public static void tampil(){
    System.out.println("ini class A");
    }
}
public class Main16 {
    public static void tampil(){
        System.out.println("ini class Main");
    }
    public static void main(String[] args) {
        Main16.tampil();
        A.tampil();
    }
}