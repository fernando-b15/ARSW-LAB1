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
        PiDigits generaDigitos = new PiDigits();
        byte[] digitosGenerados = generaDigitos.getDigits(digitoInicial,numeroDigitos);
        int j=0;
        for(int i=digitoInicial;i<digitoInicial+numeroDigitos;i++){
            digitosGlobales[i] = digitosGenerados[j];
            j++;
        }



    }
}
