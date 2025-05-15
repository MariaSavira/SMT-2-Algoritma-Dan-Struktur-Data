package Pertemuan12;

public class Mahasiswa7 {
    String nim;    
    String nama;    
    String kelas;
    double ipk;

    public Mahasiswa7(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi(){
        System.out.println(nim + " - " + nama + " - " + kelas + " - " + ipk);
    }
    
}
