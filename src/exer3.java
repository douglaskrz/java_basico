import java.util.Scanner;
public class exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] quad = new int[5];

        for (int i = 0; i < quad.length; i++) {
            quad[i] = i * i;
        }

        for (int n : quad) {
            System.out.print(n + " ");////

            sc.close();
        }
    }
}