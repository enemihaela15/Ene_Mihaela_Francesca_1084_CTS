package reteta_prototype.main;

import reteta_prototype.clase.IReteta;
import reteta_prototype.clase.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Float> solutii = new HashMap<String, Float>();
        solutii.put("Solutia1", (float)100);
        solutii.put("Solutia2", (float)200);
        solutii.put("Solutia3", (float)150);

        IReteta prototype = new Reteta("Reteta", solutii, 450);
        Reteta farmacie = (Reteta) prototype.copiaza();
        farmacie.setNume("Reteta Farmaciei");

        Reteta laborator = (Reteta) prototype.copiaza();
        laborator.setNume("Reteta Laboratorului");

        System.out.println(prototype.copiaza());
        System.out.println(farmacie.copiaza());
        System.out.println(laborator.toString());
    }
}
