package tarefas_classes;

public class Main {
    public static void main(String[] args) {
        // Criando uma lâmpada
        Lampada lampada = new Lampada(false, 60, "branca");

        // Testando os métodos
        lampada.ligar();
        System.out.println("A lâmpada está " + lampada.estado());
        lampada.desligar();
        System.out.println("A lâmpada está " + lampada.estado());
    }
}
