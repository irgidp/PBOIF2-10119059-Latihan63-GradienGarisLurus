/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan gradien garis lurus menggunakan konsep abstraksi
 */
package pboif2.pkg10119059.latihan63.gradiengarislurus;
/**
 *
 * @author Corazon
 */
public class Koordinat implements GarisLurus{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    public Koordinat(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public int getX1(){
        return x1;
    }
    public int getY1(){
        return y1;
    }
    public int getX2(){
        return x2;
    }
    public int getY2(){
        return y2;
    }
    
    @Override
    public int hitungGradien() {
        return (y2-y1)/(x2-x1);
    }
    
}
