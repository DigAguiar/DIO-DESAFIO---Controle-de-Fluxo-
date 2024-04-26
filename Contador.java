package desafioControleFluxo;

import java.util.Scanner;

public class Contador {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        try {
            contar(numero1,numero2);
        } catch (ParametrosInvalidosException e) {
            System.err.println("Erro: " + e.getMessage());
        }

    }

    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }else {
            int contagem = parametro2 - parametro1;
            for (int i = 0; i <= contagem; i++) {
                System.out.println("Imprimindo o numero: " + i);
            }
        }



    }

}
