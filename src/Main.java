import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int numero;
    String agencia;
    String nomeCliente;
    Float saldo;

    Scanner scaner = new Scanner(System.in);

    System.out.println("Por favor, digite o número da Agência !");
    agencia = scaner.next();
    nomeCliente = scaner.next();
    numero = scaner.nextInt();
    saldo = scaner.nextFloat();

    System.out.println("\"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta "+numero + "e seu saldo "+saldo+" já está disponível para saque\".");


    }

}