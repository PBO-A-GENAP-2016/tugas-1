package Bab1;

import java.util.Scanner;
public class Mahasiswa {

    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    private final String[] Nama;
    private final String[] NIM;
    private final double[] IP;
    private final String[] Jurusan;
    private final int[][] Kode_Mata_Kuliah;
    private final String[][] Nama_Mata_Kuliah;
    private int SKS;
    int a = 7;

    public Mahasiswa() {
        this.Nama = new String[a];
        this.NIM = new String[a];
        this.IP = new double[a];
        this.Jurusan = new String[a];
        this.Kode_Mata_Kuliah = new int[a][a];
        this.Nama_Mata_Kuliah = new String[a][a];
    }

    public void setSKS(int b) {
        SKS = b;
    }

    public String[] GetNama() {
        return Nama;
    }

    public String[] GetNIM() {
        return NIM;
    }

    public double[] GetIP() {
        return IP;
    }

    public String[] GetJurusan() {
        return Jurusan;
    }

    public int[][] Kode_Mata_Kuliah() {
        return Kode_Mata_Kuliah;
    }

    public String[][] Nama_Mata_Kuliah() {
        return Nama_Mata_Kuliah;
    }

    public int getSKS() {
        return SKS;
    }

    public void menuSIAM() {
        int i;
        System.out.println("====================================================");
        System.out.println("        Sistem Informasi Akademik Mahasiswa");
        System.out.println("====================================================");
        System.out.print("Jumlah Data Mahasiswa\t: ");
        a = input.nextInt();
        System.out.println("Silahkan Inputkan Data Mahasiswa\t:");
        do {
            for (i = 0; i < a; i++) {
                System.out.println("Data Mahasiswa Ke-" + (i + 1) + " : ");
                System.out.print("Nama\t: ");
                this.Nama[i] = input.nextLine();
                input.nextLine();
                System.out.print("NIM\t: ");
                this.NIM[i] = input.nextLine();
                System.out.print("Program Studi\t: ");
                this.Jurusan[i] = input.nextLine();
                System.out.print("IP Semester Lalu\t: ");
                this.IP[i] = input.nextDouble();
                System.out.println("");
                if (this.IP[i] >= 3) {
                    System.out.println("SKS Maksimal\t: 22-24");
                    this.SKS = 24;
                } else if ((this.IP[i] >= 2.50) && (this.IP[i] <= 2.99)) {
                    System.out.println("SKS Maksimal\t: 19-21");
                    this.SKS = 21;
                } else if ((this.IP[i] >= 2) && (this.IP[i] <= 2.49)) {
                    System.out.println("SKS Maksimal\t: 16-18");
                    this.SKS = 18;
                } else if ((this.IP[i] >= 1.50) && (this.IP[i] <= 1.99)) {
                    System.out.println("SKS Maksimal\t: 12-15");
                    this.SKS = 15;
                } else if (this.IP[i] < 1.5) {
                    System.out.println("SKS Maksimal\t:  3-11");
                    this.SKS = 11;
                }
                int c = 1;
                System.out.println("================================================");
                System.out.println("             Daftar Mata Kuliah");
                System.out.println("================================================");
                System.out.println("Kode  Nama Mata Kuliah           SKS           ");
                System.out.println("001   Matematika Komputasi        3            ");
                System.out.println("002   Sistem Digital              4            ");
                System.out.println("003   Sistem Operasi              4            ");
                System.out.println("004   Pemrograman Dasar           5            ");
                System.out.println("005   Pemrograman Lanjut          5            ");
                System.out.println("006   Bahasa Inggris              4            ");
                System.out.println("007   Filsafat Ilmu Pendidikan    3            ");
                System.out.println("Total SKS : " + this.SKS + "\t= ");
                System.out.println("");
                do {
                    System.out.println("------------------------------------------------");
                    System.out.print("Masukkan Kode Mata Kuliah\t: ");
                    this.Kode_Mata_Kuliah[i][1 + i] = input.nextInt();
                    System.out.print("Masukkan Nama Mata Kuliah\t: ");
                    this.Nama_Mata_Kuliah[i][1 + i] = input2.nextLine();
                    System.out.print("Jumlah SKS\t: ");
                    c = input.nextInt();
                    this.SKS = this.SKS - c;
                    System.out.println("Sisa SKS\t: " + (this.SKS));
                    System.out.println("");
                } while ((this.SKS != 2) && (this.SKS != 1) && (this.SKS != 0));
            }
        } while (i == 3);
    }
}
