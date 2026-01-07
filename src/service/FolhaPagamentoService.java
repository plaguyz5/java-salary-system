package service;

import model.Funcionario;

public class FolhaPagamentoService {

    public void exibirSalario(Funcionario funcionario) {
        System.out.println(
                "Funcionário: " + funcionario.getNome() +
                        " | Salário: R$ " + funcionario.calcularSalario()
        );
    }
}
