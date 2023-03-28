package spital_builder.main;

import spital_builder.clase.Pacient;
import spital_builder.clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder("Popescu");
        Pacient pacient = pacientBuilder.setMicDejunInclus(true).setPapuciDeCamera(true).build();
        Pacient pacientNou = new PacientBuilder("Ionescu").setMicDejunInclus(true).build();
        Pacient pacientNou2 = new PacientBuilder("Gheorghe").setPapuciDeCamera(true).setMicDejunInclus(true).build();
        Pacient pacientNou3 = pacientBuilder.setPatRabatabil(true).build();

        System.out.println(pacient.toString());
//        System.out.println(pacientNou.toString());
//        System.out.println(pacientNou2.toString());
        System.out.println(pacientNou3.toString());
    }
}