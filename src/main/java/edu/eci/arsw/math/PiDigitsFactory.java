package edu.eci.arsw.math;

public class PiDigitsFactory extends Thread {

    private int digitoInicial;
    private int numeroDigitos;
    private byte[] digitosGlobales;

    public PiDigitsFactory(int digitoInicial, int numeroDigitos, byte[] digitosGlobales){
        this.digitoInicial = digitoInicial;
        this.numeroDigitos = numeroDigitos;
        this.digitosGlobales = digitosGlobales;

    }
    @Override
    public void run(){
        byte[] digitosGenerados = PiDigits.getDigits(digitoInicial,numeroDigitos);
        for(int i=digitoInicial,j=0;i<digitoInicial+numeroDigitos;i++,j++){
            digitosGlobales[i] = digitosGenerados[j];
        }


    }
}
