/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fazendafeliz;

/**
 *
 * @author Gabihh
 */
public class FazendaFeliz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal rex = new Cachorro("Canis lupus familiaris", "Cachoro REX");
        Animal mimosa = new Vaca("Bos taurus", "Vaca Mimosa");
        Animal felix = new Gato("Felis catus", "Gato Felix");
        Animal caipira = new Galinha("Gallus gallus", "Galinha Caipira");
        
        SonsDaFazenda sdf = new SonsDaFazenda();
        sdf.sonsDaFazenda(rex);
        sdf.sonsDaFazenda(mimosa);
        sdf.sonsDaFazenda(felix);
        sdf.sonsDaFazenda(caipira);
        
        AnimalInterface donald = new Pato("Anatidae", "Donald");
        sdf.sonsDaFazendaInterface(donald);
        
    }
    
}
