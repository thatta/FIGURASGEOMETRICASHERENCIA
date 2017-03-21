/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricasherencia;

import java.util.Scanner;

/**
 *
 * @author Tatiana Almansa
 * @author Juan David Ojeda
 */
public class Menu {
     private Scanner teclado;
    
       public Menu() {
        teclado = new Scanner(System.in);        
        mensajeBienvenida();
        iniciar();
    }
    private void mensajeBienvenida(){
        System.out.println("-----BIENVENIDO----");
        System.out.println("ELIGE UNA OPCION");
    }
     private void iniciar() {        
         OUTER:
         while (true) {
             System.out.println("1.CUADRADO 2.CIRCULO 3. TRIANGULO 4.SALIR");
              System.out.println("OPCION");
             byte opcion =  teclado.nextByte();
             switch (opcion) {
                 case 1:
                     iniciarCuadrado();
                     break;
                 case 2:
                     iniciarCirculo();
                     break;
                 case 3:
                     iniciarTriangulo();
                     break;
                 case 4:
                     break OUTER;
                 default:
                     System.out.println("NUMERO NO VALIDO");
                     break;
             }
         }
    }
    
     private void iniciarCuadrado(){
        double x, y;
        System.out.println("Digite lado x1");
        x = teclado.nextDouble();
        System.out.println("Digite lado y1");
        y = teclado.nextDouble();
        Punto punto1 = new Punto(x, y);
        System.out.println("Digite lado x2");
        x = teclado.nextDouble();
        System.out.println("Digite lado y2");
        y = teclado.nextDouble();
        Punto punto2 = new Punto(x, y);
        System.out.println("Digite lado x3");
        x = teclado.nextDouble();
        System.out.println("Digite lado y3");
        y = teclado.nextDouble();
        Punto punto3 = new Punto(x, y);
        System.out.println("Digite lado x4");
        x = teclado.nextDouble();
        System.out.println("Digite lado y4");
        y = teclado.nextDouble();
        Punto punto4 = new Punto(x, y);
        Cuadrado cuadrado = new Cuadrado(punto1, punto2, punto3, punto4);
        cuadrado.darResultados();  
    }
     private void iniciarCirculo(){
        double radio;
        double x,y;
        
        System.out.println("Digite coodenada x1");
        x = teclado.nextDouble();
        System.out.println("Digite coordenada y1");
        y = teclado.nextDouble();
        Punto punto1 = new Punto(x, y);
         Punto punto2 = new Punto (x,y);
        System.out.println("digite el radio del circulo");
        radio=teclado.nextDouble();
         Circulo circulo = new Circulo(punto1,punto2);
        circulo.darResultados();
     }
      private void iniciarTriangulo(){
        double x, y;
        System.out.println("Digite lado x1");
        x = teclado.nextDouble();
        System.out.println("Digite lado y1");
        y = teclado.nextDouble();
        Punto punto1 = new Punto(x, y);
        System.out.println("Digite lado x2");
        x = teclado.nextDouble();
        System.out.println("Digite lado y2");
        y = teclado.nextDouble();
        Punto punto2 = new Punto(x, y);
        System.out.println("Digite lado x3");
        x = teclado.nextDouble();
        System.out.println("Digite lado y3");
        y = teclado.nextDouble();
        Punto punto3 = new Punto(x, y);
        Triangulo triangulo = new Triangulo(punto1, punto2, punto3);
        triangulo.darResultados();        
    }
}
