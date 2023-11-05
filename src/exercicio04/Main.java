package exercicio04;

public class Main {
    public static void main(String[] args) {
        Contador2 contador = new Contador2("Palavras são, na minha nada humilde opinião, nossa fonte inesgotável de magia.");
        int qtdPalavras = contador.contarPalavras();
        System.out.println(qtdPalavras);
    }
}
