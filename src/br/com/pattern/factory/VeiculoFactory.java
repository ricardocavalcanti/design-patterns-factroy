package br.com.pattern.factory;

public class VeiculoFactory {

    public static Veiculo criarVeiculo(String tipo) throws IllegalAccessException {
        switch (tipo.toLowerCase()){
            case "carro":
                System.out.println("Criando um veículo do tipo: Carro");
                return new Carro();
            case "moto":
                System.out.println("Criando um veículo do tipo: Moto");
                return new Moto();
            case "caminhao":
                System.out.println("Criando um veículo do tipo: Caminhao");
                return new Caminhao();
            default:
                throw new IllegalAccessException("Tipo de veículo desconhecido: "+tipo);
        }
    }
}
