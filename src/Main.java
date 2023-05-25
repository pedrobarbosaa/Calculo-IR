import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double salario;
        double imposto = 0;

        System.out.println("Digite seu salario");
        salario = leitura.nextDouble();
        double diferenca;

        if(salario > 4500) {
            imposto = 1000 * 0.08 + 1500 * 0.18;
            diferenca = salario - 4500;
            imposto += diferenca * 0.28;
        }
        else if (salario > 3000) {
            imposto = 1000 * 0.08;
            diferenca = salario - 3000;
            imposto += diferenca * 0.18;
        }
        else if(salario > 2000){
            diferenca = salario - 2000;
            imposto = diferenca * 0.08;
        }
        else if(salario < 2000){
            System.out.println("Você é isento de declaração");
        }
        System.out.println("O valor de imposto é R$ " + imposto);
    }
}