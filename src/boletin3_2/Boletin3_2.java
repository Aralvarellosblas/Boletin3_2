package boletin3_2;
/*
 * @author Arturo
 */
public class Boletin3_2 {

    public static void main(String[] args) {
        //Creamos un satelite con el constructor por defecto
        Satelite sat1=new Satelite();
        //Visualizamos
        sat1.verPosicion();
        //Creamos otro satelite dandole valores
        Satelite sat2=new Satelite(76, 55, 12548);
        sat2.verPosicion();
        
    }
    
}
