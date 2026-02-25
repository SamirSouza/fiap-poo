package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Carro;
import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal
{
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.Marca = "Porche";
        meuCarro.TipoCambio = "PDK";
        meuCarro.TipoTracao = "Tração Traseira";
// Fabriquei a segunda (Instância 2)
        Carro meuCarroFord = new Carro();
        meuCarroFord.Marca = "Ford";
        meuCarroFord.TipoCambio = "Dupla Embreagem";
        System.out.println("Meu carro esportivo é: " + meuCarro.Marca);
        System.out.println("O tipo do meu Câmbio do meu carro esportivo é o : " + meuCarro.TipoCambio);
        System.out.println("A marca do meu carro do dia a dia é : " + meuCarroFord.Marca);
        System.out.println("O tipo do meu Câmbio do meu carro do dia dia é: " + meuCarroFord.TipoCambio);
    }
}