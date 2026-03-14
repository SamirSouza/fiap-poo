package br.com.fiapride.main;

import br.com.fiapride.model.Carro;

public class SistemaPrincipal {
    public static void main(String[] args) {

        // Instância 1 — Porsche
        Carro meuCarro = new Carro("Porsche", "PDK");
        meuCarro.tipoTracao = "Tração Traseira";

        // Instância 2 — Ford
        Carro meuCarroFord = new Carro("Ford", "Dupla Embreagem");

        System.out.println("Meu carro esportivo é: " + meuCarro.marca);
        System.out.println("O tipo do meu Câmbio do meu carro esportivo é o: " + meuCarro.tipoCambio);
        System.out.println("A marca do meu carro do dia a dia é: " + meuCarroFord.marca);
        System.out.println("O tipo do meu Câmbio do meu carro do dia a dia é: " + meuCarroFord.tipoCambio);

        System.out.println("\n--- Testando método acelerar ---");

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
    }
}