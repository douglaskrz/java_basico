public class exer9 {
    public static void main(String[] args) {

        int[] v = { 12, 5, 33, 7, 28, 14, 9 };
        int alvo = 28;
        int posicao = -1;

        for (int i = 0; i < v.length; i++) {
            if (v[i] == alvo) {
                posicao = i;
                break;
            }
        }

        System.out.println(posicao == -1
                ? "Não encontrado"
                : "Encontrado em v[" + posicao + "]");
    }
}
