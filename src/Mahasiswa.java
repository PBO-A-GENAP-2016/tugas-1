import java.util.Scanner;
public class Mahasiswa {
    Scanner scan = new Scanner(System.in);
    private String Nama;
    private String NIM;
    private double IP;
    private String Jurusan;
    private int JumlahSKS;

    public void setNama() {
        System.out.print("Nama\t: ");
        this.Nama = scan.nextLine();
    }

    public void setNIM() {
        System.out.print("NIM\t: ");
        this.NIM = scan.nextLine();
    }

    public void setIP() {
        System.out.print("IP\t: ");
        this.IP = scan.nextDouble();
    }

    public void setJurusan() {
        System.out.print("Jurusan\t: ");
        this.Jurusan = scan.nextLine();
    }

    public String getNama() {
        return this.Nama;
    }

    public String getNIM() {
        return this.NIM;
    }

    public double getIP() {
        return this.IP;
    }

    public String getJurusan() {
        return this.Jurusan;
    }

    public void setJumlahSKS(int sks){
        this.JumlahSKS=this.JumlahSKS+sks;
    }
    
    public int getJumlahSKS() {
        return this.JumlahSKS;
    }
    
}
