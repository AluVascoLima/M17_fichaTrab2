package m17b_fichatrab2;

public class Ponto2D {

    private int x;
    private int y;
    
    /**
     * Inicializa as coordenadas sem parametros
     */
    public Ponto2D() {
        x = 0;
        y = 0;
    }

    /**
     * Inicializa as coordenadas com parametros
     */
    public Ponto2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * @return coordenada x
     */
    public int getX(){
        return x;
    }
    /**
     * @return coordenada y
     */
    public int gety(){
        return x;
    }
    /**
     * Setter para x
     */
    public void setX(int x){
        this.x = x;
    }
    /**
     * Setter para y
     */
    public void setY(int y){
        this.y = y;
    }
    /**
     * Calcula a distancia entre dois pontos
     */
    public double distancia(Ponto2D a) {
        double dx = x - a.x;
        double dy = y - a.y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    /**
     * @return Distancia entre o primeiro e o segundo ponto
     */
    @Override
    public String toString() {
        return ("X=" + x + " Y=" + y);
    }
}
