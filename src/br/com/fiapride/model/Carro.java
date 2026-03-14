package br.com.fiapride.model;

public class Carro {
    private String marca;
    private String tipoCambio;
    private String tipoTracao;
    private double velocidadeMaxima; // novo atributo
    private double velocidadeAtual; // Novo atributo

    public Carro(String marca, String tipoCambio) {
        setMarca(marca);
        this.marca = marca;
        this.tipoCambio = tipoCambio;
        this.velocidadeMaxima = 250;
        this.velocidadeAtual = 0; // começa parado
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isEmpty()) {
            System.out.println("Não é permitido não informar a marca");
            return;
        }
        this.marca = marca;
    }

    public String getTipoCambio() {
        return this.tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }


    public String getTipoTracao() {
        return this.tipoTracao;
    }

    public void setTipoTracao(String tipoTracao) {
        this.tipoTracao = tipoTracao;
    }


    public double getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // ---- GET e SET: velocidadeAtual ----
    public double getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
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