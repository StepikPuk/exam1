import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите кол-во дней:");
        int i = scanner.nextInt();
        System.out.println("Введите сумму для откладывания:");
        int a = scanner.nextInt();
        int j=0;
        for(int g = 1; g<=i; g++){
            j+=a;
            System.out.println("День "+ g +"."+"Уже "+j +" руб.");
        }
    }
}
