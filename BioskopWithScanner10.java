import java.util.Scanner;

public class BioskopWithScanner10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, next;
        int baris, kolom, menu;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                do {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    do {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi, silakan pilih kursi lain.");
                        }
                        else if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Baris atau kolom di luar jangkauan. Tolong ulangi.");
                        }


                    } while ((penonton[baris - 1][kolom - 1] != null) || (baris < 1 || baris > 4 || kolom < 1 || kolom > 2));

                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        System.out.println("Kembali ke menu utama.");
                        break;
                    }
                } while (next.equalsIgnoreCase("y"));
            } else if (menu == 2) {
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Penonton pada baris ke-" + (i + 1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.print(penonton[i][j]);
                        } else {
                            System.out.print("*");
                        }
                        if (j < penonton[i].length - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.println("Anda keluar dari program.");
                break;
            } else {
                System.out.println("Menu tidak valid, tolong ulangi.");
            }
        }
        sc.close();
    }
}
