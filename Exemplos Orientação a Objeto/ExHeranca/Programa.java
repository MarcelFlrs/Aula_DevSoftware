public class Programa {
    public static void main(String[] args) {
        Bike bikePrincipal = new Bike("vermelha");
        bikePrincipal.setCor("Roxo Pérola");
        bikePrincipal.setVelocidade(230);


        BikeDeCorrida bikeDeCorrida = new BikeDeCorrida();
        bikeDeCorrida.setCor("Laranja");
        bikeDeCorrida.setVelocidade(100);
        
        BikeDePasseio bikeDePasseio = new BikeDePasseio();
        bikeDePasseio.setCor("Preto");
        bikeDePasseio.setVelocidade(40);

        BikeDeTrilha bikeDeTrilha = new BikeDeTrilha();
        bikeDeTrilha.setCor("Roxo");
        bikeDeTrilha.setVelocidade(60);

        System.out.println(bikePrincipal);
        System.out.println(bikeDeCorrida);
        System.out.println(bikeDePasseio);
        System.out.println(bikeDeTrilha);
    }
}
