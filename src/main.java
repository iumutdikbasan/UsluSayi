import java.util.Scanner;

public class main {
    public static void main(String[] args){
        int n,k;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ussu alinacak sayi: ");
        n=scan.nextInt();
        System.out.println("Us olacak sayi : ");
        k=scan.nextInt();
        int total=1;
        for(int i =1;i<=k;i++){

            total*=n;

        }
        System.out.println("Cevap: "+total);

    }
}
