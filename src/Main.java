import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int san = scan.nextInt();
        if (san%12==0){
            System.out.println("ты родился в год обьезьяны");
        } else if (san%12==1) {
            System.out.println("ты родился в год петуха");
            
        } else if (san%12==2) {
            System.out.println("Ты родился в год собаки");
        } else if (san%12==3) {
            System.out.println("Ты родился в год свиньи");

        } else if (san%12==4) {
            System.out.println("Ты родился в год крысы");

        } else if (san%12==5) {
            System.out.println("Ты родился в год быка");

        } else if (san%12==6) {
            System.out.println("Ты родился в год тигра");

        } else if (san%12==7) {
            System.out.println("Ты родился в год кролика");

        } else if (san%12==8) {
            System.out.println("Ты родился в год дракона");

        } else if (san%12==9) {
            System.out.println("Ты родился в год змеи");

        } else if (san%12==10) {
            System.out.println("Ты родился в год лошади");
        } else if (san%12==11) {
            System.out.println("Ты родился в год барана");
        }

    }
    }











