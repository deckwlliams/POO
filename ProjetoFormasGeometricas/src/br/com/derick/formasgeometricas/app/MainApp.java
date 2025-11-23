package br.com.derick.formasgeometricas.app;

import br.com.derick.formasgeometricas.model.*;

public class MainApp
{
    public static void main(String[] args){
        FormaGeometrica formas[];
        formas = new FormaGeometrica[4];

        formas[0] = new Circulo(2);
        formas[1] = new Quadrado(3);
        formas[2] = new Paralelepipedo(4, 4, 5);
        formas[3] = new Cubo(4);
        for (FormaGeometrica forma : formas) {
            System.out.println(forma);
        }
    }

}
