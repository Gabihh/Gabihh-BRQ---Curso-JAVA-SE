/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2e05;

/**
 *
 * @author Gabihh
 */
public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Relogio(){
    }
    public Relogio(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public int getHora(){
        return this.hora;
    }
    public int getMinuto(){
        return this.minuto;
    }
    public int getSegundo(){
        return this.segundo;
    }
    public void getExibirHorario(){
        System.out.println(this.hora + ":" + this.minuto + ":" + this.segundo);
    }
    
    public void setHora(int hora){
        this.hora = hora;
    }
    public void setMinuto(int minuto){
        this.minuto = minuto;
    }
    public void setSegundo(int segundo){
        this.segundo = segundo;
    }
    public void setAdiantar(int segundo){
        int total = (this.hora * 3600) + (this.minuto * 60) + this.segundo + segundo;
        total = total % 86400;
        this.hora = total  / 3600;
        this.minuto = (total % 3600) / 60;
        this.segundo = (total % 3600) % 60;
    }
    public void setAtrasar(int segundo){
        int total = (this.hora * 3600) + (this.minuto * 60) + this.segundo - segundo % 86400;
        total += 86400;
        total = total % 86400;
        this.hora = total  / 3600;
        this.minuto = (total % 3600) / 60;
        this.segundo = (total % 3600) % 60;
    }
}

