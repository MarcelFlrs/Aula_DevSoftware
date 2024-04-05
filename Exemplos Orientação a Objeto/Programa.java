public class Programa {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Jão");
        

    Carro uno = new Carro(476);
    // uno.velocidade = -10;

    uno.setMarca("Fiat");
    uno.setModelo("Uno Mille");
    uno.acelerar();
    uno.acelerar();
    uno.acelerar();
    uno.acelerar();
    uno.acelerar();

    uno.frear();
    uno.frear();

    System.out.println("Marca: " + uno.getMarca());
    System.out.println("Modelo: " + uno.getModelo());
    System.out.println("Velocidade: " + uno.getVelocidade());
    
    
    Carro vwJetta = new Carro(240);
    vwJetta.setMarca("Volkswagen");
    vwJetta.setModelo("Jetta 2.0 TSI");
    
    System.out.println("Marca: " + vwJetta.getMarca());
    System.out.println("Modelo: " + vwJetta.getModelo());
    System.out.println("Velocidade: " + vwJetta.getVelocidade());
}
}
