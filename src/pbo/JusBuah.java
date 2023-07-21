package pbo;

//class
public class JusBuah {
    
    //atribut dan enkapsulasi
    private String nama;
    private int harga;

    //constructor
    public JusBuah(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }


    
    //mutator(setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
     //accessor(getter)
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
    
    public String tampilData(){
        return "Nama Buah : "+getNama() +"\nHarga Buah : "+getHarga();
    }
    
    //polymorphism (overloading)
    public String tampilData(int toping){
        return tampilData() +"\nHarga Toping : "+toping;
    }
    
}
