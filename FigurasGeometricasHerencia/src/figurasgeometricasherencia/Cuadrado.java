/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricasherencia;


public class Cuadrado extends Figura {
      private Punto punto3;
    private Punto punto4;
    private double perimetro;

    public Cuadrado(Punto punto3, Punto punto4, Punto punto1, Punto punto2) {
        super(punto1, punto2);
        this.punto3 = punto3;
        this.punto4 = punto4;
    }

      public void darResultados() {
        if(isCuadrado()) {
            System.out.println("Lado1: " + darLado1());
            System.out.println("Lado2: " + darLado2());
            System.out.println("Lado3: " + darLado3());
             System.out.println("Lado4: " + darLado4());
            System.out.println("Perimetro: " + darPermietro());
            System.out.println("Area: " + darArea());
        } else {
            System.out.println("No es un Cuadrado");
        }    
    }
        private boolean isCuadrado() {
       if(punto1.getX()==punto4.getX()&&punto2.getX()==punto3.getX()){
                if(punto1.getY()==punto2.getY()&&punto3.getY()==punto4.getY()){
                      return true;
                }
            }else{
                return false;
            }
      return false;
    }
        /**
     * Retorma longitud de lado AB
     * @return 
     */
    private double darLado1(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado BC
     * @return 
     */
    private double darLado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado CA
     * @return 
     */
    private double darLado3(){
       double auxiliarX = Math.pow(punto4.getX() - punto4.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto3.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    private double darLado4(){
        double auxiliarX = Math.pow(punto1.getX() - punto4.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto4.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
     private double darPermietro() {        
        this.perimetro =  darLado1() + darLado2() + darLado3()+ darLado4();
        return this.perimetro;
    }
     
      private double darArea() {
       
        double area =Math.pow( darLado1(),2  );
        return area;
    }
      
      public String darTipoCuadrado() {
           if( (darLado1() == darLado2()) && (darLado2() == darLado3())&&(darLado3()== darLado4())&&(darLado4()== darLado1())) {
              return "Cuadrado";
          }else if((darLado1() == darLado3())&&(darLado4()== darLado1())){
                    return "Rectangulo";
          }else {          
             return "No es un Cuadrilaterio";
          }
   }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    public Punto getPunto4() {
        return punto4;
    }

    public void setPunto4(Punto punto4) {
        this.punto4 = punto4;
    }
      
}
