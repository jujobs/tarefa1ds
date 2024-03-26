public class ConversaoDeTipos {
    public static void main(String[] args) { // serve para começar o código e salvar valores

        String s1 = "10"; //declaração da variável s1
        int v = Integer.parseInt(s1); //declaração de variável "v"
        float x = Float.parseFloat(s1); //declaração de variável "x"
        double y = Double.parseDouble(s1); //declaração de variável "y"
        int w = (int) x; //declaração de variável "w" (número inteiro)
        int z = (int) y; //declaração de variável "z" (número inteiro)
        String s2 = String.valueOf(v); //conversão do valor da variável s2
        System.out.println(s2 + w + z); //serve para "imprimir" o valor da equação das variáveis na tela

    }
}
