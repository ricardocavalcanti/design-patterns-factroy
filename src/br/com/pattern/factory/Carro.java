package br.com.pattern.factory;

public class Carro implements Veiculo{
    @Override
    public void dirigir() {
        System.out.println("Dirigindo um carro...");
    }
}
