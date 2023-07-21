package pbo;


import java.util.Scanner;

//class
public class Main {
    public static void main(String[] args) {
        
        //IO sederhana
        Scanner scanner = new Scanner(System.in);
        //array 
        JusBuahDetail[] jusbuah = new JusBuahDetail[2];
        
        //Error Handling
        try {
        
        System.out.print("Beli Jus : ");
        String nama1 = scanner.nextLine();
        System.out.print("Pakai Toping (Y/N): ");
        String toping1 = scanner.nextLine();
        
        //objek 1
        jusbuah[0] = new JusBuahDetail(nama1, 5000);
        
        //Seleksi
        if (toping1.equals("Y")){
            System.out.println(jusbuah[0].tampilData(3000));
        } else {
            System.out.println(jusbuah[0].tampilData(0));
        }
        
        
        System.out.print("Beli Jus : ");
        String nama2 = scanner.nextLine();
        System.out.print("Pakai Toping (Y/N): ");
        String toping2 = scanner.nextLine();
        
        //objek 2
        jusbuah[1] = new JusBuahDetail(nama1, 5000);
        if (toping2.equals("Y")){
            System.out.println(jusbuah[1].tampilData(3000));
        } else {
            System.out.println(jusbuah[1].tampilData(0));
        }
        } catch (Exception e) {
            System.out.println("Error : Terjadi kesalahan tak terduga");
        }
       
        }
}