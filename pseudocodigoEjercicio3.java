
import java.util.Scanner;

public class pseudocodigoEjercicio3 {
    public static void main(String[] args){
        int No;
        int Fac = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        No = sc.nextInt();
        for(int i = No ; i > 0 ; i--){
            Fac = Fac*i;
        }
            System.out.println("El factorial es: "+Fac);
    }    
}
