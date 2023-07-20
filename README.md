# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima nama jus dan apakah pembeli ingin toping, dan memberikan output berupa harga toping dan harga total dari jus yang dibeli.


Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `JusBuah`, `JusBuahDetail`, dan `Main` adalah contoh dari class.

```bash
public class JusBuah {
    ...
}

public class JusBuahDetail extends JusBuah {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `jusbuah[0] = new JusBuahDetail(nama1, 5000);` adalah contoh pembuatan object.

```bash
jusbuah[0] = new JusBuahDetail(nama1, 5000);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` , `harga` dan `toping` adalah contoh atribut.

```bash
String nama;
int harga;
int toping;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `JusBuah` dan `JusBuahDetail`.

```bash
public JusBuah(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

public JusBuahDetail(String nama, int harga) {
        super(nama, harga);
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setHarga` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama` dan `getHarga` adalah contoh method accessor.

```bash
public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `harga` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private int harga;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `JusBuahDetail` mewarisi `Jusbuah` dengan sintaks `extends`.

```bash
public class JusBuahDetail extends JusBuah{
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilData(int toping)` di `JusBuah` merupakan overloading method `tampilData` dan `tampilData(int toping)` di `JusBuahDetail` merupakan override dari method `tampilData(int toping)` di `JusBuah`.

```bash
 public String tampilData(int toping){
        return tampilData() +"\nHarga Toping : "+toping;
    }

@Override
public String tampilData(int toping){
    this.toping = toping;
    return super.tampilData()+
    "\nHarga Toping : "+toping+
    "\nHarga Total : "+getHargaTotal()+
    "\n----------------";
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam pemakaian toping.

```bash
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
```

11. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("Beli Jus : ");
String nama1 = scanner.nextLine();
System.out.print("Pakai Toping (Y/N): ");
String toping1 = scanner.nextLine();
```

12. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `JusBuahDetail[] jusbuah = new JusBuahDetail[2];` adalah contoh penggunaan array.

```bash
JusBuahDetail[] jusbuah = new JusBuahDetail[2];
```

13. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error : Terjadi kesalahan tak terduga");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | IO Sederhana   |   10    |
| 12  | Array          |   15    |
| 13  | Error Handling |   15    |
|     | **TOTAL**      | **95** |

## Pembuat

Nama: Muhammad Hibatullah

NPM: 2110010599
