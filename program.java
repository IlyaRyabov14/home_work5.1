import java.util.Scanner;
public class program {

    public static void main(String[] args) {
              
        Scanner num = new Scanner(System.in);
        System.out.print("Введите n-е треугольное число: ");
        double N = num.nextInt();
        double T = 0.5*N*(N+1);
        System.out.println("Ответ: ");
        System.out.println(T);
    }  
}  

    
   