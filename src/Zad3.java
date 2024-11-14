import java.util.Scanner;

public class Zad3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String y;
        String[] a=new String[30];
        int g =0;
        System.out.println("Введите планы на день. Для выхода введите exit.");
        while (true) {
            System.out.println("Введите дела: ");
            y = scanner.nextLine();
            if (y.equalsIgnoreCase("exit")) {
                break;
            }
            if (g <= 30) {
                a[g] = y;
                g++;
            } else {
                System.out.println("Достигнут лимит");
                break;
            }
        }
        System.out.println("Список планов: ");
        for (int i=0;i<g;i++) {
            System.out.println((i+1)+". "+ a[i]);
        }
    }
}