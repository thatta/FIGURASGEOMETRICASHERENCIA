/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricasherencia;

/**
 *
 * @author Tatiana Almansa
 * @author Juan David Ojeda
 */

public class Circulo extends Figura {
    private double perimetro;
     private double radio;
     private double PI;

    public Circulo( Punto punto1, Punto punto2) {
        super(punto1, punto2);
        
    }
    private double darPerimetro() {  
        
        this.perimetro = 2*PI*radio;
        return this.perimetro;
    }
    
    private double darArea() {
        double  area=PI*Math.pow(radio, 2);
        return area;
    }
    void darResultados() {
        
    if(isCirculo()) {
    System.out.println("Perimetro: " + darPerimetro());
    System.out.println("Area: " + darArea());
      } else {
            System.out.println("No es un circulo");
        }    
    }
    private boolean isCirculo() {
           if(punto1.getX()==punto2.getX()&&punto1.getY()==punto2.getY()){
        return false;
    }else{
            return true;
        }  
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
   
}
