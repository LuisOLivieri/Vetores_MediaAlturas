import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Vetores sao arranjos: homogenia, ordenadas e alocada uma vez. [ARRAY]
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as alturas: ");
        int n = sc.nextInt();
        //DECLARACAO VETOR: 
        double[] vect = new double[n]; //Declarando o vetor e vai receber o número de vezes N. 

        for (int i = 0; i < n; i++ ) { //i começa no 0; Enquanto i for menor que n(continua); a cada volta acrescenta 1
            vect[i] = sc.nextDouble(); //Next na posiçao recebendo o que o usário passou. 
        }

        double soma = 0.0;
        for(int i = 0; i < n; i++){ //i começa no 0; Enquanto i for menor que n(continua); a cada volta acrescenta 1
            soma += vect[i]; //Percorrer o vetor e somar todos os i que forem passando. 
        }

        double avg = soma / n;
        System.out.println("Average: " + avg);

        sc.close();

    }   
}
