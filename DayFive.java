package Days;

import java.util.Scanner;

public class DayFive {
    public static void main(String[] args) {
        int NilaiUTS = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai UTS: ");
        NilaiUTS = input.nextInt();
        if (NilaiUTS < 50 ){
            System.out.println("Nilai Error");
        }else{
            System.out.println("Nilai tidak error");
        }
    }
}
