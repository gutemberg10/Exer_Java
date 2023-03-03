package exerciciosCondicionais;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("Sobre o cliente, digite 1 para homem e 2 para mulher: ");
        char sexo = sc.next().charAt(0);

        System.out.print("Digite o valor das compras do cliente: ");
        double valorCompras = sc.nextDouble();

        double desconto = 0.0;

        if (sexo == '1') {
            desconto = valorCompras * 0.5;
        } else if (sexo == '2') {
            desconto = valorCompras * 0.13;
        }

        double precoComDesconto = valorCompras - desconto;

        System.out.println("O preço com desconto para o cliente " + nome + " é de R$ " + precoComDesconto);

        sc.close();
    }

    
}
