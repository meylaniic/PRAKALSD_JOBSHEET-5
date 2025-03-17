import java.util.Scanner;
public class mainfaktorial {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai : ");
    int nilai = input.nextInt();

    faktorial fk = new faktorial();
    System.out.println("Nilai faktorial " +nilai + " Menggunakan BF : " +fk.faktorialBF(nilai));
    System.out.println("Nilai faktorial " +nilai + " Menggunakan DC : " +fk.faktorialDC(nilai));
    
    }
}
