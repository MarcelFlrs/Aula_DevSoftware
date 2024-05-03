
public class Bike {
    private String cor;
    private int velocidade;
    
    public Bike() {
    }

    public Bike(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Bike [cor=" + cor + ", velocidade=" + velocidade + "]";
    }



}
