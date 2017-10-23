package boletin3_2;
/*
 * @author Arturo
 */
public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distanciaTerra;
    
    public Satelite(){
        meridiano = 0;
        paralelo = 0;
        distanciaTerra = 0;
    }
    public Satelite(double m, double p , double d ){
        meridiano = m ;
        paralelo = p;
        distanciaTerra = d ;
    }
    public void verPosicion(){
        System.out.println ("O satelite atopase:\nNo paralelo " +paralelo + "\nMeridiano "  + meridiano+ "\nA unha distancia da terra "+distanciaTerra);
    }
    

}
