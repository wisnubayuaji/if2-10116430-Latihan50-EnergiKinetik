/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
 
public class EnergiKinetik {
    double massa, kecepatan;
    public double getMassa() {
        System.out.println("Massa = "+massa+" g");
        return massa;
    }
    public void setMassa(double massa) {
        this.massa = massa;
    }
    public double getKecepatan() {
        System.out.println("Kecepatan = "+kecepatan+" m/s");
        return kecepatan;
    }
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    public double EnergiKinetik() {
        double EnergiKinetik = (double) (0.5 * massa * kecepatan * kecepatan);
        System.out.println("a. Energi Kinetik = "+EnergiKinetik+" J");
        return EnergiKinetik;
    }
    public double Usaha() {
        //--- /\Ek = 1/2m(vt^2 - vo^2)
        double Usaha = (double) (0.5 * massa * ((kecepatan*kecepatan)-(0)));
        System.out.println("b. Usaha = "+Usaha+" J");
        return Usaha;
    }
}
