
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] sks = {{3, 22, 24}, {2.5, 19, 21}, {2, 16, 18}, {1.5, 12, 15}, {0, 0, 11}};
        System.out.println("PROGRAM SISTEM INFORMASI AKADEMIK");
        System.out.print("Masukkan jumlah mahasiswa : ");
        Mahasiswa[] mahasiswa = new Mahasiswa[scan.nextInt()];
        MataKuliah[][] matakuliah = new MataKuliah[25][25];
        String loop = "n";
        int i;
        if (mahasiswa.length >= 3) {
            for (int x = 0; x < mahasiswa.length; x++) {
                System.out.println("");
                System.out.println("Mahasiswa " + (x + 1));
                mahasiswa[x] = new Mahasiswa();
                mahasiswa[x].setNama();
                mahasiswa[x].setNIM();
                mahasiswa[x].setJurusan();
                mahasiswa[x].setIP();
                i = -1;
                do {
                    i++;
                    System.out.println("\nMatakuliah "+(i+1));
                    matakuliah[x][i] = new MataKuliah();
                    matakuliah[x][i].setKode_Matkul();
                    matakuliah[x][i].setNama_Matkul();
                    matakuliah[x][i].setSKS();
                    mahasiswa[x].setJumlahSKS(matakuliah[x][i].getSKS());
                    System.out.println("______________");
                    loop = "y";
                    for (int y = 0; y < sks.length; y++) {
                        if (mahasiswa[x].getIP() >= sks[y][0]) {
                            if (mahasiswa[x].getJumlahSKS() < sks[y][1]) {
                                System.out.println("Kurang " + (sks[y][1] - mahasiswa[x].getJumlahSKS()) + " SKS");
                                loop = "n";

                            } else if (mahasiswa[x].getJumlahSKS() > sks[y][2]) {
                                System.out.println("Kelebihan " + (mahasiswa[x].getJumlahSKS() - sks[y][2]) + " SKS");
                                mahasiswa[x].setJumlahSKS(0 - mahasiswa[x].getJumlahSKS());
                                loop = "n";

                            }
                            break;
                        }

                    }
                    if (loop == "y") {
                        System.out.print("Sudah?(y/n)");
                        loop = scan.next();
                    }

                } while (loop.equals("n"));

            }
            
            
            for (int x = 0; x < mahasiswa.length; x++) {
                System.out.println("\nMAHASISWA "+(x+1));
                System.out.println("NIM\t: "+mahasiswa[x].getNIM());
                System.out.println("Nama\t: "+mahasiswa[x].getNama() + "   ");
                System.out.println("IP\t: "+mahasiswa[x].getIP() + "   ");
                System.out.println("Jurusan\t: "+mahasiswa[x].getJurusan() + "   ");
                System.out.println("SKS\t: "+mahasiswa[x].getJumlahSKS() + "   ");
                System.out.println("");
                System.out.println("MATAKULIAH");
                System.out.println("Kode\t\tNama\t\t\tSKS");
                for (int y = 0; y < matakuliah[x].length; y++) {
                    if(matakuliah[x][y] == null) break;  
                    System.out.print( matakuliah[x][y].getKode_Matkul());
                    System.out.print("\t"+matakuliah[x][y].getNama_Matkul());
                    System.out.print("  "+matakuliah[x][y].getSKS()+" SKS");
                    System.out.println("");
                }
                System.out.println("------------------");
                    System.out.println("TOTAL\t"+mahasiswa[x].getJumlahSKS()+" SKS");
                
            }

        } else {
            System.out.println("Mahasiswa minimal 3!");
        }
    }

}
