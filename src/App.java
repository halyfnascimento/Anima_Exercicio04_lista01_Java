import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual sua nota do primeiro bimestre");
        nota1 = teclado.nextDouble();
        System.out.println("Qual sua nota do segundo bimestre");
        nota2 = teclado.nextDouble();
        System.out.println("Qual sua nota do terceiro bimestre");
        nota3 = teclado.nextDouble();
        System.out.println("Qual sua nota do quarto bimestre");
        nota4 = teclado.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        teclado.close();
        System.out.println("Sua media é " + media);
    }
}