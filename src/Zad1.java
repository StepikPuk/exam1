import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите месячную зп: ");
        int i= scanner.nextInt();
        int a=0;
        if (i<100000) {
            a=(int)(i*0.13);
        }
        if (i>=100000 && i<=1000000){
            a=(int)(i*0.18);
        }
        if(i>1000000){
            a=(int)(i*0.25);
        }
        int j=(int)(i-a);
        System.out.println("Доход после вычета налога: "+j);
    }
}