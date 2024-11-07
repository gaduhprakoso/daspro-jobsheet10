import java.util.Scanner;

public class SIAKAD10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int Mahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int Matkul = sc.nextInt();

        int[][] nilai = new int[Mahasiswa][Matkul];

        for (int i = 0; i < nilai.length; i++) {
            int totalPerSiswa = 0;
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPerSiswa / Matkul);
        }
        System.out.println("\n===================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");

        for (int j = 0; j < Matkul; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < Mahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / Mahasiswa);
        }
    }
}