/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
 
public class App {
    public static void main(String[] args) throws Exception {
        
		EnergiKinetik energi = new EnergiKinetik();
        
        energi.setMassa(145);
        energi.getMassa();
        energi.setKecepatan(25);
        energi.getKecepatan();
        energi.EnergiKinetik();
        energi.Usaha();
    }
}
