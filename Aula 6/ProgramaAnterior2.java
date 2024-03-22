
public class ProgramaAnterior2{

//Exemplo de construtores
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("Ricardo");
        pessoa1.idade = 25;
        
        Pessoa pessoa2 = new Pessoa("Ana", 21);
        
        Pessoa pessoa3 = new Pessoa();
        // pessoa3.nome = "Carlos";
        // pessoa3.idade = 25;
        
        
        System.out.println("Pessoa 1 (nome): "  + pessoa1);
        System.out.println("Pessoa 2 (nome): "  + pessoa2.nome);
        System.out.println("Pessoa 3 (nome): "  + pessoa3.nome);
    }
    
//Exemplo de conversão, biblioteca e classes
    public static void mainAntigo(String[] args) {

        

        String texto1 = "100";
        String texto2 = "50";
        // Concatenação
        String txtFinal = texto1 + texto2;
        System.out.println("Texto: " + txtFinal);

        // Parsear (converter)
        Integer numero1 = Integer.parseInt(texto1);
        int numero2 = Integer.parseInt(texto2);
        int resultado = Calculadora.somar(numero1, numero2);
        System.out.println("Resultado: " + resultado);

        double variavel = 10.60;
        Double objeto = 10.50;
        int inteiro = objeto.intValue();

        System.out.println();

        // Objetos do tipo bike
        Bike objetoMinhaBike = new Bike();
        objetoMinhaBike.marca = "Caloi";
        objetoMinhaBike.alterarMarcha(3);

        Bike objetoSuaBike = new Bike();
        objetoSuaBike.marca = "Oggi";
        objetoSuaBike.alterarMarcha(5);

        System.out.println("Minha bike marca: " + objetoMinhaBike.marca);
        System.out.println("Minha bike marcha: " + objetoMinhaBike.marchaAtual);

        System.out.println();

        System.out.println("Sua bike marca: " + objetoSuaBike.marca);
        System.out.println("Sua bike marcha: " + objetoSuaBike.marchaAtual);

        System.out.println();



        String matricula = "A1";
        String[] matriculas = new String[]{"A1", "A2"};

    }

}
