package app;

import model.*;
import service.FolhaPagamentoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FolhaPagamentoService folha = new FolhaPagamentoService();

        System.out.println("1 - Funcionário CLT");
        System.out.println("2 - Funcionário PJ");
        System.out.print("Escolha o tipo: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        Funcionario funcionario;

        if (tipo == 1) {
            System.out.print("Salário base: ");
            double salario = scanner.nextDouble();

            System.out.print("Desconto INSS: ");
            double inss = scanner.nextDouble();

            funcionario = new FuncionarioCLT(nome, salario, inss);
        } else {
            System.out.print("Valor por hora: ");
            double valorHora = scanner.nextDouble();

            System.out.print("Horas trabalhadas: ");
            int horas = scanner.nextInt();

            funcionario = new FuncionarioPJ(nome, valorHora, horas);
        }

        folha.exibirSalario(funcionario);
        scanner.close();
    }
}
