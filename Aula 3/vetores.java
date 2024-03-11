import java.util.Scanner;

public class vetores {
    public static void main(String[] args){

        // Vetores
        int[] vet1 = new int[3];
        // int[] vet2 = new int[]{6,8,3};

        vet1[1] = 450;
        // int vlrPos1 = vet1[0];

        // System.out.println("Vet1 pos 1: " + vlrPos1);
        // System.out.println("Vet2 pos 1: " + vet1[1]);
        // System.out.println("Vet2 pos 1: " + vet2[0]);

        // Repetidores for. while, do/while
        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.println("Digite o valor da posição "+ (i + 1));
            int vlrDigitado = leitor.nextInt();
            vet1[i] = vlrDigitado;
            //vet1[i] = leitor.netInt();
            
        }

        //Imprimir os valores de vet1
        boolean executar = true;
        int contador = 0;

        while (executar && contador < 3) {
            int vlrVetor = vet1[contador];
            if (vlrVetor > 100) {
                executar = false;
            }else{
                System.out.println("Valor na posição " + (contador + 1) + ": " + vlrVetor);
                contador++;
            }

        }

        // Zerar o vet1
        do {
            //Vetor está zerado?
            if (vet1[0] == 0) {
                break;
            }
            vet1[contador] = 0;
            contador++;
        } while (contador < 3);

        leitor.close();
    }

}
