package br.com.pattern.service;

import br.com.pattern.factory.Veiculo;
import br.com.pattern.factory.VeiculoFactory;

public class VeiculoService {

    public void executar(String tipo) throws IllegalAccessException {
        Veiculo veiculo = VeiculoFactory.criarVeiculo(tipo);
        veiculo.dirigir();
    }
}
