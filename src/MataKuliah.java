import java.util.Scanner;
public class MataKuliah {
    Scanner scan = new Scanner(System.in);
    private String Kode_Matkul;
    private String Nama_Matkul;
    private int SKS;

    public void setKode_Matkul() {
        System.out.print("Kode Mata Kuliah\t: ");
        this.Kode_Matkul = scan.nextLine();
    }

    public void setNama_Matkul() {
        System.out.print("Nama Mata Kuliah\t: ");
        this.Nama_Matkul = scan.nextLine();
    }

    public void setSKS() {
        System.out.print("SKS yang diambil\t: ");
        this.SKS = scan.nextInt();
    }

    public String getKode_Matkul() {
        return Kode_Matkul;
    }

    public String getNama_Matkul() {
        return Nama_Matkul;
    }

    public int getSKS() {
        return SKS;
    }
}
