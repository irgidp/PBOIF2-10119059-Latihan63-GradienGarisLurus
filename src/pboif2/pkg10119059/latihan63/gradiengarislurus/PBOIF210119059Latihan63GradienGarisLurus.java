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
public class PBOIF210119059Latihan63GradienGarisLurus {

    public static void main(String[] args) {
        Koordinat koor1 = new Koordinat(2,10,5,7);
        System.out.println("Garis yang melalui titik " + "(" +koor1.getX1() + "," + koor1.getY1() + ") dan (" + koor1.getX2() + "," + koor1.getY2() + ")");
        System.out.println("Memiliki gradien sebesar " +koor1.hitungGradien());
        System.out.println("");
        Koordinat koor2 = new Koordinat(5,1,3,12);
        System.out.println("Garis yang melalui titik " + "(" +koor2.getX1() + "," + koor2.getY1() + ") dan (" + koor2.getX2() + "," + koor2.getY2() + ")");
        System.out.println("Memiliki gradien sebesar " +koor2.hitungGradien());
        
    }
    
}
