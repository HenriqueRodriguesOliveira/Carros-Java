package clientes;

import java.util.Scanner;

public class Cadastrando implements Cadastro{
    public static void main(String[] args) {
       Cadastrando cliente1 = new Cadastrando();
       cliente1.cadastrarInfo("Henrique", 45515, 51818);
    }


    @Override
    public void cadastrarInfo(String nome, Integer numero, Integer cpf) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("#Cadastrando cliente#");
//        System.out.println("Digite o nome do Cliente: ");
//        String nome = scanner.nextLine();
//        System.out.println("Nome: " + nome);
//
//        System.out.println("Digite o número de telefone do cliente: ");
//        Integer numero = Integer.valueOf(scanner.nextLine());
//        System.out.println("Número de telefone: " + numero);
//
//        System.out.println("Digite o CPF do cliente: ");
//        Integer cpf = Integer.valueOf(scanner.nextLine());
//        System.out.println("CPF: " + cpf);
//
//        System.out.println("Cliente cadastrado: " + nome + ", " + numero + ", " + cpf);
    }
}