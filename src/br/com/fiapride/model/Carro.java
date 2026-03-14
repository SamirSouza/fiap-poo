package br.com.fiapride.model;

public class Carro {
    public String marca;
    public String tipoCambio;
    public String tipoTracao;
    public double velocidadeMaxima; // novo atributo
    public double velocidadeAtual; // Novo atributo

    public Carro(String marca, String tipoCambio) {
        this.marca = marca;
        this.tipoCambio = tipoCambio;
        this.velocidadeMaxima = 250;
        this.velocidadeAtual = 0; // começa parado
    }

    // REGRA: não aceita incremento negativo ou zero
    public void acelerar(double incremento) {
        if (incremento <= 0) {
            System.out.println("Erro: o incremento deve ser maior que zero!");
            return;
        }
        if (this.velocidadeAtual + incremento > this.velocidadeMaxima) {
            System.out.println("Limite de velocidade máxima atingido! Velocidade mantida em: " + this.velocidadeMaxima + " km/h");
            this.velocidadeAtual = this.velocidadeMaxima;
            return;
        }
        this.velocidadeAtual += incremento;
        System.out.println(this.marca + " acelerou para: " + this.velocidadeAtual + " km/h");
    }

    public void tipoCarro() {
        if (this.velocidadeMaxima >= 200) {
            System.out.println("Esse carro: " + this.marca + " é um carro de uso rotineiro com velocidade máxima de " + this.velocidadeMaxima + " km/h e não se enquadra como esportivo.");
        } else {
            System.out.println("Esse carro: " + this.marca + " é um carro esportivo! Câmbio: " + this.tipoCambio + ". Utilize-o com cuidado, pois pode ser perigoso!!!");
        }
    }
}