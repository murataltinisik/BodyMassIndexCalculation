import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        double calculate;
        double height, weight;

        // SCANNER
        Scanner sc = new Scanner(System.in);

        // USER'S VALUES
        System.out.print("Lütfen Boyunuzu Giriniz:");
        height = sc.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz:");
        weight = sc.nextDouble();

        // CALCULATE
        calculate = Math.round(weight / (height * height));

        System.out.println(calculate);
        // PRINT
        System.out.print("Vücut Kitle Endeksi ");
        if(calculate > 0 && calculate <= 18.4){
            System.out.print("Zayıf: " + calculate);
        }else if(calculate > 18.4 && calculate <= 24.9){
            System.out.print("Normal: " + calculate);
        }else if(calculate > 24.9 && calculate <= 29.9){
            System.out.print("Fazla Kilolu: " + calculate);
        }else if(calculate > 29.9 && calculate <= 34.9){
            System.out.print("Şişman (1.Sınıf): " + calculate);
        }else if(calculate > 34.9 && calculate <= 44.9){
            System.out.print("Şişman (2.Sınıf): " + calculate);
        }else if(calculate > 44.9){
            System.out.print("Aşırı Şişman: " + calculate);
        }else{
            System.out.println("Geçersiz İşlem...");
        }

    }
}
