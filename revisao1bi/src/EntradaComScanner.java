import java.util.*;  // Importa todas as classes do pacote java.ulti, que inclui a classe scaner
public class EntradaComScanner { // Declara uma classe publica "EntradaComScanner"

    public static void main(String[] args) { // : Início do método main, que é o ponto de entrada do programa
        float largura, comprimento, area, perimetro; // Declarações de variaveis do tipo float para armazenar a largura, area, comprimento e area
        Scanner sc; // Declara a variavel scanner
        try {
            System.out.println("Entre com o comprimento: "); // Imprime uma mensagem solicitando ao usuário que insira o comprimento do terreno
            sc = new Scanner(System.in); // Cria uma nova instância de Scanner para ler a entrada do usuário a partir do console
            comprimento = sc.nextFloat(); // Ve um valor de ponto flutuante inserido pelo usuário e o atribui à variável comprimento

            System.out.println("Área do terreno: "); // Mostra uma mensagem solicitando ao usuário que insira a largura do terreno
            sc = new Scanner(System.in); // Cria uma nova instância de Scanner para ler a entrada do usuário a partir do console
            largura = sc.nextFloat(); // Ele olha um valor de ponto flutuante inserido e atribui à variuavel

            area = comprimento * largura; // Ele esta fazendo a soma dos valores
            perimetro = comprimento * 2 + largura * 2; // ele esta fazendo a soma dos valores

            System.out.println("área do terreno: "+ area); // Mostra a area do terreno
            System.out.println("área do perímetro: " + perimetro); // Mostra o perimetro  do terreno
        }
        catch (NumberFormatException e) {
            System.out.println("Houve um erro na conversão, digite apenas caracteres numéricos!!"); // Mostra uma mensagem de erro caso o usuario nao colocar nenhum valor
        }
    }

}
