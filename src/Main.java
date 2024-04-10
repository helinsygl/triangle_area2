import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner inp=new Scanner(System.in);
int r;
double alpha;
double pi=3.14;
System.out.println("Üçgenin yarıçapını giriniz>");
r=inp.nextInt();
System.out.println("Üçgenin merkez açısını giriniz>");
alpha=inp.nextDouble();
double area=(pi*r*r*alpha)/360;
System.out.println("Üçgen diliminin alanı>"+area);

    }
}