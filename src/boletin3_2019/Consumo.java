/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_2019;

/**
 *
 * @author david
 */
public class Consumo {
    
    
    
      private float km,litros,vMed,pGas,tempo;
    
    //constructor sen parametros
    
    public Consumo(){
        }
    
    //constructor parametros
    
    public Consumo(float km,float Lt,float vMed,float pGas,float tempo){
        this.km=km;
        this.litros=Lt;
        this.pGas=pGas;
        this.vMed=vMed;
        this.tempo=tempo;
      
                
    }
    
    //metodos
    
    public void setkm (float km){
    this.km = km;
    }
    public float getkm(){
    return km;
    }
    public void setlitros (float Lt){
        this.litros = Lt;
    }
    
    public float getlitros(){
        return litros;
    }
    
    public void settempo (float tempo){
        this.tempo = tempo;
    }
    
    public float gettempo(){
        return tempo;
    }
    
    
    public void setvMed(float vMed){
        this.vMed = vMed;
    }
    
    public float getvMed(){
        return vMed;
        
    }
    public void setpGas(float pGas){
        this.pGas = pGas;
        
    }
    public float getpGas(){
        
        return pGas;
    }
    
    
    // Metodos calculo
    
    
    public float consumoMedio(){
        float consumoMedio;
        consumoMedio=(litros/km)*100;
        return consumoMedio;
        }
    public float consumoEuro(){
        float consumoEuro;
        consumoEuro=(consumoMedio())*pGas;
        return consumoEuro;
    }
    
    public float velocidadMedia(){
        float velocidadMedia;
        velocidadMedia= km/tempo;
        return velocidadMedia;
    
}

}