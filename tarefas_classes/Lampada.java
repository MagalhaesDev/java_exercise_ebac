package tarefas_classes;

public class Lampada {
    // Propriedades
    private boolean ligada;
    private int potencia;
    private String cor;

    // Construtor
    public Lampada(boolean ligada, int potencia, String cor) {
        this.ligada = ligada;
        this.potencia = potencia;
        this.cor = cor;
    }

    // Método para ligar a lâmpada
    public void ligar() {
        if (!ligada) {
            System.out.println("Ligando a lâmpada.");
            ligada = true;
        } else {
            System.out.println("A lâmpada já está ligada.");
        }
    }

    // Método para desligar a lâmpada
    public void desligar() {
        if (ligada) {
            System.out.println("Desligando a lâmpada.");
            ligada = false;
        } else {
            System.out.println("A lâmpada já está desligada.");
        }
    }

    // Método para obter o estado da lâmpada
    public String estado() {
        return ligada ? "ligada" : "desligada";
    }

    // Método para obter a potência da lâmpada
    public int getPotencia() {
        return potencia;
    }

    // Método para definir a potência da lâmpada
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    // Método para obter a cor da lâmpada
    public String getCor() {
        return cor;
    }

    // Método para definir a cor da lâmpada
    public void setCor(String cor) {
        this.cor = cor;
    }
}
