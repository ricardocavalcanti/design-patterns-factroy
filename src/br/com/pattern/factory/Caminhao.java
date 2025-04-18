package br.com.pattern.factory;

public class Caminhao implements Veiculo{
    @Override
    public void dirigir() {
        System.out.println("Conduzindo um caminhão...");
    }
}
