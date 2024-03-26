public class MetodoSemRetorno {
    public static void main (String[] args) { //começa o código e serve para guardar valores colocados ao decorrer do código
        imprimir(); //declaração de variável imprimir
        imprimirTexto("Olá!!"); //declaração de variável imprimirTexto
        mostrarQuadrado(10); //declaração da variável mostrarQuadrado
        somar(10, 20); //declaração da variável somar
        mostrarMaior(10, 20, 30); //declaração da variável mostrarmaior
        mostrarSexoPorExtenso('F'); //declaração da variável mostrarSexoPorExtenso
    }
    public static void imprimir() {
        System.out.println("Aprendendo a Linguagem Java"); } // declara o valor da variável imprimir e imprime o valor na tela
    public static void imprimirTexto(String texto) {
        System.out.println(texto); } //declara o valor da variável imprimirTexto e imprime o valor na tela
    public static void somar(int a, int b) {
        System.out.println(a + b);
    } //declara o valor da variável somar e imprime o valor da equação na tela
    public static void mostrarQuadrado(int valor) {
        System.out.println(Math.pow(valor, 2));
    } // declara o valor de mostrarQuadrado e mostra na tela um número ao quadrado
    public static void mostrarMaior(int a, int b, int c) {
        System.out.println(Math.max(c, Math.max(a, b)));
    } //declara o valor de mostrar maior e mostra na tela o maior entre os três número colocados como parâmentro
    public static void mostrarSexoPorExtenso(char sexo) {
        if (sexo == 'F') {
            System.out.println("Feminino!!!"); // caso a resposta seja F, o valor sera feminino
        } else if (sexo == 'M') {
            System.out.println("Masculino!!"); // se a resposta for M, o valor será masculino
        } else {
            System.out.println("Sexo desconhecido!!!"); // Caso não seja nenhum dos dois, o valor vira "sexo desconhecido"
        }
    }
}
