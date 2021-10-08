/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5prf;


/**
 *
 * @author Gabihh
 */
public class FabricaLampada implements Lampada{
    private String tipoLampada;
    
    public FabricaLampada(){}
    public FabricaLampada(String lampada){
        this.tipoLampada = lampada;
    }
    
    public String getTipoLampada(){return this.tipoLampada;}
    
    public void lampada(){
        if("incandescente".equalsIgnoreCase(getTipoLampada())){
            class Incandescente{
                public void criarLampadaI(){
                    FabricaLampada x = new FabricaLampada();
                    System.out.println("Lâmpada Inscandescente criada!");
                }
            }
            
            Incandescente i = new Incandescente();
            i.criarLampadaI();
        }
        if("fluorescente".equalsIgnoreCase(getTipoLampada())){
            class Fluorescente{
                public void criarLamapdaF(){
                    FabricaLampada x = new FabricaLampada();
                    System.out.println("Lâmpada Fluorescente criada!"); 
                }
            }
            Fluorescente f = new Fluorescente();
            f.criarLamapdaF();
        }
    }
    
    public void ligar(){
        System.out.println("Está ligado!");
    }
    public void desligar(){
        System.out.println("Está desligado!");
    }
    
}
