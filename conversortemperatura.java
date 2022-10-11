import java.util.Scanner;

public class conversorTemperatura {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a leitura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        double celsius = 5* ((fahrenheit-32)/9);
        System.out.println("A temperatura digitada em celsius é igual a " + celsius + ".\n");
    }
}