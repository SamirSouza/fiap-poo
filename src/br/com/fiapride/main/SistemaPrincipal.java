package br.com.fiapride.main;

import br.com.fiapride.model.Carro;

public class SistemaPrincipal {
    public static void main(String[] args) {

        // Instância 1 — Porsche
        Carro meuCarro = new Carro("Porsche", "PDK");
        meuCarro.setTipoTracao("Tração Traseira");

        // Instância 2 — Ford
        Carro meuCarroFord = new Carro("Ford", "Dupla Embreagem");

        System.out.println("Meu carro esportivo é: " + meuCarro.getMarca());
        System.out.println("O tipo do meu Câmbio do meu carro esportivo é o: " + meuCarro.getTipoCambio());
        System.out.println("A marca do meu carro do dia a dia é: " + meuCarroFord.getMarca());
        System.out.println("O tipo do meu Câmbio do meu carro do dia a dia é: " + meuCarroFord.getTipoCambio());

        System.out.println("\n--- Testando método acelerar ---");


        // Aula 02 - Utilizando os métodos criados para alterar atributos
        // Teste 1: valor válido — deve funcionar
        meuCarro.acelerar(80);

        // Teste 2: mais aceleração válida
        meuCarro.acelerar(100);

        // Teste 3: valor inválido (negativo) — deve mostrar erro
        meuCarro.acelerar(-50);

        // Teste 4: valor inválido (zero) — deve mostrar erro
        meuCarro.acelerar(0);

        // Teste 5: ultrapassa a velocidade máxima — deve travar no limite
        meuCarro.acelerar(200);

        // aula 03 - Utilização dos metodos get e set para alterar de maneira controlada e segura a natureza dos atributos

        meuCarro.setMarca("Ferrari");
        System.out.println("Marca atualizada para: " + meuCarro.getMarca());

        meuCarro.setMarca("");
    }
}
