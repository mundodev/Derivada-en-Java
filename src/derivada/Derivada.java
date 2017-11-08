package derivada;

import Presentacion.Polinomio;

/**
 *
 * @author VG
 */

public class Derivada {
    
    //Inicializamos la variables que utilizaremos
    
    public int grado;
    public double []coeficiente;
    
    
    //Método Derivada
    
    public Derivada(int grado, double []coeficiente) {
        this.grado = grado;
        this.coeficiente = coeficiente;
    }
    
    
    //Métodos Getters y Setters de las variables
    
    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public double[] getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(double[] coeficiente) {
        this.coeficiente = coeficiente;
    }
    
    
    //Método Imprimir
    
    public String imprimir(){
        String Derivada = " ";
        int subindice = 0;
        int exponente = 0;
        for(subindice=this.grado; subindice>=0; subindice--){
            exponente = subindice;
            if(subindice == 0){
                Derivada+= " "+this.coeficiente[subindice];
            }
            else {
                Derivada+= " "+ this.coeficiente[subindice]+"("+ "x^"+exponente+")+";
            }
        }
        return Derivada; 
    }
    
    
    //Método Exponente
    
    public double exponente(double coefi, int grado){
        double resultado = 1;
        for(int i=1; i<=this.grado; i++){
            resultado*=coefi;
        }
        return resultado;
    }
    
    
    //Método Derivada K-ésima
    
    public void Derivar(int k){
        int gradoDerivada = 0;
        double []coeficienteDerivada = {0};
        for(int i=1;i<=k;i++) {
            gradoDerivada = this.grado-1;
            coeficienteDerivada = new double[this.grado];
            int subindice=0;
            for(int j=1; j<=this.grado; j++) {
                coeficienteDerivada[subindice] = j*this.coeficiente[j];
                subindice++;
            }
            this.grado = gradoDerivada;
            this.coeficiente = coeficienteDerivada;
        }
    }
    

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Polinomio().setVisible(true);
            }
        });
    }
    
}
