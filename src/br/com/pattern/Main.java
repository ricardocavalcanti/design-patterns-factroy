package br.com.pattern;

import br.com.pattern.service.VeiculoService;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        VeiculoService service = new VeiculoService();
        service.executar("carro");
        service.executar("moto");
        service.executar("caminhao");
    }
}