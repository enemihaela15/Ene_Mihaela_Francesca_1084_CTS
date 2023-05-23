package acs.ase.clase;

public class MyException extends IllegalArgumentException{
    private String mesaj;

    public MyException(String mesaj) {
        this.mesaj = mesaj;
    }
}
