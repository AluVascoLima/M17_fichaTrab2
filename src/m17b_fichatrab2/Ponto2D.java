package m17b_fichatrab2;

public class Ponto2D {

    private int x;
    private int y;

    public Ponto2D() {
        x = 0;
        y = 0;
    }

    /**
     *
     * @param x
     * @param y
     */
    public Ponto2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * 
     * @return 
     */
    public int getX(){
        return x;
    }
    /**
     * 
     * @return 
     */
    public int gety(){
        return x;
    }
    /**
     * 
     * @param x 
     */
    public void setX(int x){
        this.x = x;
    }
    /**
     * 
     * @param y 
     */
    public void setY(int y){
        this.y = y;
    }
    /**
     *
     * @param a
     * @return
     */
    public double distancia(Ponto2D a) {
        double dx = x - a.x;
        double dy = y - a.y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return ("X=" + x + " Y=" + y);
    }
}
